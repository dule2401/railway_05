-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các
-- account thuộc phòng ban đó --

use `quan_ly_phong_ban`;
DELIMITER $$
CREATE procedure enter_your_username (in input_department varchar(50))
	BEGIN
		SELECT D.department_name,A.account_id,A.fullname
        from `account` A
        left join `department` D on A.department_id = D.department_id
        where D.department_name = input_department;
    END$$
DELIMITER ;

-- ---------------------------------------------------------------------
-- Question 2: Tạo store để in ra số lượng account trong mỗi group
DELIMITER $$
CREATE PROCEDURE number_account_by_group (in input_number_group smallint unsigned )
	BEGIN 
		SELECT 
    *,G.group_id, COUNT(GA.account_id) AS so_luong_nhan_vien
FROM
    `group` G
        LEFT JOIN
    group_account GA ON GA.group_id = G.group_id
	WHERE GA.group_id = input_number_group;
	END$$
    DELIMITER ;
    
-- ----------------------------------------------------
-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo
-- trong tháng hiện tại
drop procedure if exists number_type_question ;
DELIMITER $$
CREATE PROCEDURE number_type_question (in type_id smallint unsigned)
	BEGIN 
		SELECT COUNT(Q.type_id) AS number_question
			FROM `type_quesition` TQ
            JOIN `question` Q ON TQ.type_id = Q.type_id
            WHERE month(Q.create_date) = month(now());
	END$$
    DELIMITER ;
    
-- -----------------------------------------------------
-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất 
DROP PROCEDURE IF EXISTS max_number_type_question;
DELIMITER $$
CREATE PROCEDURE max_number_type_question ()
	BEGIN
			SELECT TQ.type_id
			FROM `type_quesition` TQ
            JOIN `question` Q ON TQ.type_id = Q.type_id
            GROUP BY Q.type_id
            HAVING COUNT(Q.type_id) = (SELECT 
												MAX(COUNT(Q.type_id))
										FROM 
											(SELECT COUNT(Q.type_id)
												FROM `type_quesition` TQ
												JOIN `question` Q ON TQ.type_id = Q.type_id 
												GROUP BY Q.type_id ) AS SO_LUONG_CAU_HOI);
   END$$
   DELIMITER ;
   
-- -----------------------------------------------------------
-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
DROP PROCEDURE IF EXISTS max_number_type_question;
DELIMITER $$
CREATE PROCEDURE max_number_type_question ()
	BEGIN
			SELECT TQ.type_name
			FROM `type_quesition` TQ
            JOIN `question` Q ON TQ.type_id = Q.type_id
            GROUP BY Q.type_id
            HAVING COUNT(Q.type_id) = (SELECT 
												MAX(COUNT(Q.type_id))
										FROM 
											(SELECT COUNT(Q.type_id)
												FROM `type_quesition` TQ
												JOIN `question` Q ON TQ.type_id = Q.type_id 
												GROUP BY Q.type_id ) AS SO_LUONG_CAU_HOI);
END$$
   DELIMITER ;
   
-- -------------------------------------------------------------------------
-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
-- chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
-- chuỗi của người dùng nhập vào
drop procedure if exists user_information;
DELIMITER $$
CREATE PROCEDURE user_information (IN input_string VARCHAR(100))
begin 
	select username, null as group_name
    from `account`
    where username like concat('%', 'input_string','%')
    union 
    SELECT null as username ,group_name
    from `group`
    WHERE group_name like concat('%', 'input_string','%');
end$$
DELIMITER ;
call user_information ('a');

-- ------------------------------------------------------------------------------\
-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và
-- trong store sẽ tự động gán:
-- username sẽ giống email nhưng bỏ phần @..mail đis
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ
-- Sau đó in ra kết quả tạo thành công




-- -------------------------------------------------------------
--- - Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
-- -- để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất
DELIMITER $$
create procedure max_content (in in_put enum('essay','Multiple-Choice') )
begin
	SELECT Q.content, LENGTH(Q.content) 
    FROM questions Q
    WHERE LENGTH(Q.content) = (SELECT MAX(LENGTH(Q.content))
							   FROM questions Q
							   JOIN type_question TQ ON Q.type_id = TQ.type_id
                               WHERE TQ.type_name = in_put);
end$$
DELIMITER ;

-- -------------------------------------------------------------------
-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
DELIMITER $$
create procedure delete_exam_by_id (in in_put_id  smallint unsigned)
begin 
	DELETE FROM exam_question 
    WHERE exam_id = in_put_id and exam_name = in_put_id;
    end$$
DELIMITER ;
-- ------------------------------------------
-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử
-- dụng store ở câu 9 để xóa)
-- Sau đó in số lượng record đã remove từ các table liên quan trong khi
-- removing
DROP PROCEDURE IF EXISTS delete_exam_3_years_ago;
DELIMITER $$
create procedure delete_exam_3_years_ago()
begin 
		delete 
			from `exam`
			WHERE exam_id = (
							select exam_id
							from `exam`
							where year(now())-year(create_date) >3 );
				
end$$
DELIMITER ;
-- -------------------------------------------------------------------------
-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
--  nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được
--  chuyển về phòng ban default là phòng ban chờ việc -- 

DROP PROCEDURE IF EXISTS delete_department;
DELIMITER $$
CREATE PROCEDURE delete_department (in input_department_name varchar(50))
BEGIN 
	UPDATE `account`
    SET department_id = 1
    where departmen_id = (select departmen_id
							    FROM `department`
								WHERE department_name = input_department_name);
	DELETE
    FROM `department` 
	wHERE
		department_name = input_department_name;
END$$
DELIMITER ;

-- --------------------------------------------------------
-- -- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm
--  nay

DROP PROCEDURE IF EXISTS every_month_how_many_question_in_year ;
 DELIMITER $$
CREATE PROCEDURE every_month_how_many_question_in_year ()
	BEGIN 
		SELECT sum(so_luong_cau_hoi_trong_thang) AS tong_so_luong_cau_hoi_trong_thang
			from
				(SELECT count(question_id) As so_luong_cau_hoi_trong_thang
				FROM `question`
				group by create_date
				having month(create_date) =1) as thang_1
		UNION
			SELECT sum(so_luong_cau_hoi_trong_thang)AS tong_so_luong_cau_hoi_trong_thang
			from
				(SELECT count(question_id) As so_luong_cau_hoi_trong_thang
				FROM `question`
				group by create_date
				having month(create_date) =2) as thang_2
      union
			SELECT sum(so_luong_cau_hoi_trong_thang)AS tong_so_luong_cau_hoi_trong_thang
			from
				(SELECT count(question_id) As so_luong_cau_hoi_trong_thang
				FROM `question`
				group by create_date
				having month(create_date) =3) as thang_3
		UNION
                SELECT sum(so_luong_cau_hoi_trong_thang)AS tong_so_luong_cau_hoi_trong_thang
			from
				(SELECT count(question_id) As so_luong_cau_hoi_trong_thang
				FROM `question`
				group by create_date
				having month(create_date) =4) as thang_4
		UNION
                SELECT sum(so_luong_cau_hoi_trong_thang) AS tong_so_luong_cau_hoi_trong_thang
			from
				(SELECT count(question_id) As so_luong_cau_hoi_trong_thang
				FROM `question`
				group by create_date
				having month(create_date) =5) as thang_5
		UNION
                SELECT sum(so_luong_cau_hoi_trong_thang) AS tong_so_luong_cau_hoi_trong_thang
			from
				(SELECT count(question_id) As so_luong_cau_hoi_trong_thang
				FROM `question`
				group by create_date
				having month(create_date) =6) as thang_6
		UNION
                SELECT sum(so_luong_cau_hoi_trong_thang) AS tong_so_luong_cau_hoi_trong_thang
			from
				(SELECT count(question_id) As so_luong_cau_hoi_trong_thang
				FROM `question`
				group by create_date
				having month(create_date) =7) as thang_7
		UNION
                SELECT sum(so_luong_cau_hoi_trong_thang) AS tong_so_luong_cau_hoi_trong_thang
			from
				(SELECT count(question_id) As so_luong_cau_hoi_trong_thang
				FROM `question`
				group by create_date
				having month(create_date) =9) as thang_8
		UNION
                SELECT sum(so_luong_cau_hoi_trong_thang) AS tong_so_luong_cau_hoi_trong_thang
			from
				(SELECT count(question_id) As so_luong_cau_hoi_trong_thang
				FROM `question`
				group by create_date
				having month(create_date) =10) as thang_10
		UNION
                SELECT sum(so_luong_cau_hoi_trong_thang) AS tong_so_luong_cau_hoi_trong_thang
			from
				(SELECT count(question_id) As so_luong_cau_hoi_trong_thang
				FROM `question`
				group by create_date
				having month(create_date) =11) as thang_11
		UNION
                SELECT sum(so_luong_cau_hoi_trong_thang) AS tong_so_luong_cau_hoi_trong_thang
			from
				(SELECT count(question_id) As so_luong_cau_hoi_trong_thang
				FROM `question`
				group by create_date
				having month(create_date) =12) as thang_12;
END$$
DELIMITER ;
-- ---------------------------------------------------------------------
-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6
-- tháng gần đây nhất
-- (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng")

DELIMITER $$
CREATE PROCEDURE NUMBER_QUESTION_6_MONTH_AGO ()
BEGIN 
	SELECT COUNT(question_id) as so_cau_hoi
    from `question`
    GROUP BY create_date
    HAVING MONTH(create_date) =month(CURRENT_DATE - INTERVAL 0 MONTH)
    union 
    SELECT COUNT(question_id) as so_cau_hoi
    from `question`
    GROUP BY create_date
    HAVING MONTH(create_date) =month(CURRENT_DATE - INTERVAL 1 MONTH)
     union 
    SELECT COUNT(question_id) as so_cau_hoi
    from `question`
    GROUP BY create_date
    HAVING MONTH(create_date) =month(CURRENT_DATE - INTERVAL 2 MONTH)
     union 
    SELECT COUNT(question_id) as so_cau_hoi
    from `question`
    GROUP BY create_date
    HAVING MONTH(create_date) =month(CURRENT_DATE - INTERVAL 3 MONTH)
     union 
    SELECT COUNT(question_id) as so_cau_hoi
    from `question`
    GROUP BY create_date
    HAVING MONTH(create_date) =month(CURRENT_DATE - INTERVAL 4 MONTH)
     union 
    SELECT COUNT(question_id) as so_cau_hoi
    from `question`
    GROUP BY create_date
    HAVING MONTH(create_date) =month(CURRENT_DATE - INTERVAL 5 MONTH);
END$$
DELIMITER ;














