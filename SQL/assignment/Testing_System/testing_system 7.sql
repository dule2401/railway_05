USE `quan_ly_phong_ban`;
-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo
--  trước 1 năm trước
USE quan_ly_phong_ban ;
DROP TRIGGER IF EXISTS creat_date_group_one_ago;
DELIMITER $$
CREATE TRIGGER creat_date_group_one_ago
before
insert on `group_account`
	for each row 
begin
	if new. year(now())-year(join_date) =1 THEN 
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'khong duoc nhap';
		END if;
end$$
DELIMITER ;

-- ---------------------------------------------------
-- -- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào
--  department "Sale" nữa, khi thêm thì hiện ra thông báo "Department
--  "Sale" cannot add more user"
USE quan_ly_phong_ban ;
DELIMITER $$
CREATE TRIGGER Department_Sale_cannot_add_more_user
BEFORE
INSERT ON `account`
FOR EACH ROW 
BEGIN 
	IF NEW. department_id = 7 then 
    SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'Department Sale cannot add more user';
        end if;
end $$
DELIMITER ;


-- --------------------------------------------------
-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user

USE quan_ly_phong_ban ;
DROP TRIGGER IF EXISTS
DELIMITER $$
CREATE TRIGGER group_5_user
BEFORE
INSERT ON `group_account`
FOR EACH ROW
BEGIN
		IF ( SELECT group_id
				FROM group_account 
                WHERE COUNT(account_id)>5)
		THEN
        SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = 'Group with at most 5 user';
		END IF;
END$$
DELIMITER ;

-- -------------------------------------------------------------------
-- --Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question
USE quan_ly_phong_ban ;
DROP TRIGGER IF EXISTS group_5_user
DELIMITER $$
CREATE TRIGGER group_5_user
BEFORE
INSERT ON `examquestion`
FOR EACH ROW
BEGIN
		IF ( SELECT exam_id
				FROM `examquestion` 
                WHERE COUNT(question_id)>10 )
		THEN
        SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = 'The test has 10 questions at most';
		END IF;
END$$
DELIMITER ;
-- ----------------------------------------------------------
-- Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là
--  admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
--  còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông
--  tin liên quan tới user đó 

USE quan_ly_phong_ban ;
DROP TRIGGER IF EXISTS not_delete_account_admin
DELIMITER $$
CREATE TRIGGER not_delete_account_admin
BEFORE
DELETE on `account`
FOR EACH ROW
	BEGIN
        IF OLD.email ='admin@gmail.com' THEN
        SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = 'not_delete_account_admin';
        END IF;
    END$$
DELIMITER ;

-- -------------------------------------------------------------------
-- Question 6: Không sử dụng cấu hình default cho field DepartmentID của table
--  Account, hãy tạo trigger cho phép người dùng khi tạo account không điền
--  vào departmentID thì sẽ được phân vào phòng ban "waiting Department"

USE quan_ly_phong_ban ;
DROP TRIGGER IF EXISTS
DELIMITER $$
CREATE TRIGGER not_delete_account_admin
BEFORE
INSERT ON `account`
FOR EACH ROW
BEGIN
		DECLARE new_department_id INT;
		SELECT department_id INTO new_department_id 
		FROM department
		WHERE department_name = 'Waiting Room';
	IF NEW.department_id IS NULL THEN
	SET NEW.department_id = new_department_id;
	END IF;
END$$
DELIMITER ;

-- ----------------------------------------------------------------------
-- Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi
--  question, trong đó có tối đa 2 đáp án đúng.
USE quan_ly_phong_ban ;
DROP TRIGGER IF EXISTS exam_max_4_answers;
DELIMITER $$
CREATE TRIGGER exam_max_4_answers
BEFORE
INSERT ON `answer`
FOR EACH ROW
	BEGIN
		SELECT COUNT(answer_id) as so_luong_cau
        FROM `answer` 
        GROUP BY question_id
        HAVING question_id = NEW.question_id;
        SELECT COUNT(answer_id) as so_cau_dung
        FROM `answer` 
        GROUP BY question_id
        HAVING question_id = NEW.question_id AND iscorrect LIKE 'đúng';
        IF so_luong_cau > 4 and so_cau_dung >2 then
        SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = 'cannot create';
        END IF;
	END$$
    DELIMITER ;

-- ---------------------------------------------------------------------------
-- Question 8: Viết trigger sửa lại dữ liệu cho đúng:
--  Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
--  Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database
USE quan_ly_phong_ban ;
DELIMITER $$
CREATE TRIGGER gender_of_account
BEFORE INSERT ON `account`
FOR EACH ROW
BEGIN 
	IF NEW.gender = 'nam' then SET gender = 'M';
	ELSEIF NEW.gender = 'nu' then SET gender = 'F';
    ELSEIF NEW.gender = 'chưa xác định' then SET gender= 'U';
	END IF ;
END$$
DELIMITER ;
-- ------------------------------------------------------------------
-- Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày
USE quan_ly_phong_ban ;
DELIMITER $$
CREATE TRIGGER cannot_delete_exam
BEFORE DELETE ON exam
FOR EACH ROW
BEGIN
	IF OLD.create_date =DATE_SUB(NOW(), INTERVAL 2 DAY) THEN
    SIGNAL SQLSTATE '12345'
	SET MESSAGE_TEXT = 'cannot delete exam';
    END IF ;
END$$
DELIMITER ;

-- --------------------------------------------------------------------------------------
-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các
--  question khi question đó chưa nằm trong exam nào
USE quan_ly_phong_ban ;
DELIMITER $$
CREATE TRIGGER cannot_update_delete_question
BEFORE DELETE ON `question`
FOR EACH ROW
BEGIN 
    SELECT question_id AS QUESTION_IS_NOT_AVAILABLE_FOR_TEST
    FROM `question`
    WHERE question_id = (SELECT question_id
							FROM `examquestion`
							WHERE exam_id IS NULL);
	IF OLD.question_id = QUESTION_IS_NOT_AVAILABLE_FOR_TEST THEN
	SIGNAL SQLSTATE '12345'
	SET MESSAGE_TEXT = 'cannot delete question';
    END IF ;
END$$
DELIMITER ;

-- --------------------------------------------------------------
-- Question 12: Lấy ra thông tin exam trong đó:
-- Duration <= 30 thì sẽ đổi thành giá trị "Short time"
-- 30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
-- Duration > 60 thì sẽ đổi thành giá trị "Long time"-- 
USE `quan_ly_phong_ban`;
SELECT 
    *,
    CASE
        WHEN duration <= 60 THEN 'Short time'
        WHEN duration < 120 THEN 'Medium time'
        ELSE 'Long time'
    END AS thoi_gian_thi
FROM
    `exam`;
-- ----------------------------------------------------------------
-- Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên
--  là the_number_user_amount và mang giá trị được quy định như sau:
-- 2
-- Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
-- Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
-- Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher

USE quan_ly_phong_ban ;
SELECT g.group_id,
    CASE
		WHEN COUNT(ga.account_id) <= 5 then 'few'
        WHEN COUNT(ga.account_id) <= 20 then  'normal'
        ELSE 'higher'
	END AS the_number_user_amount
	FROM group_account ga
    left join `group` g on ga.group_id = g.group_id
    group by g.group_id ;
-- -------------------------------------------------------------------------
-- Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào
--  không có user thì sẽ thay đổi giá trị 0 thành "Không có User"	
USE quan_ly_phong_ban ;
SELECT D.department_id,D.department_name,
	CASE 
		WHEN COUNT(A.account_id) = 0 THEN 'Không có User'
		ELSE COUNT(A.account_id)
		END AS Empty_rooms
FROM `account` A
LEFT JOIN `department` D ON A.department_id = D.department_id
GROUP BY  D.department_id;
