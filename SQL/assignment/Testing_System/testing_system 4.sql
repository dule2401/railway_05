-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ --
use `quan_ly_phong_ban`;
SELECT 
    d.department_id, d.department_name, a.fullname
FROM
    `account` a
        JOIN
    department d ON d.department_id = a.department_id;
    
   ----------------------------------------------------------------------------- 
-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010 --
use `quan_ly_phong_ban`;
SELECT 
    d.department_id, d.department_name, a.fullname
FROM
    `account` a
        JOIN
    department d ON d.department_id = a.department_id
WHERE
    create_date < '2020-08-28';
------------------------------------------------------------------------------------
-- Question 3: Viết lệnh để lấy ra tất cả các developer --
use `quan_ly_phong_ban`;
SELECT 
    P.position_id, P.position_name, a.fullname
FROM
    `account` a
        JOIN
    `position` p ON P.position_id = a.position_id
WHERE
    P.position_name = 'developer';
-----------------------------------------------------------------------------------
-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >1 nhân viên --
USE `quan_ly_phong_ban`;
SELECT 
    d.department_id, d.department_name
FROM
    department d
        INNER JOIN
    `account` a ON d.department_id = a.department_id
GROUP BY d.department_id
HAVING COUNT(a.account_id) > 1;
--------------------------------------------------------------------------------------
-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất --
use `quan_ly_phong_ban`;
SELECT 
    Q.question_id
FROM
    question Q
        LEFT JOIN
    examquestion EQ ON EQ.question_id = Q.question_id
GROUP BY Q.question

HAVING COUNT(EQ.exam_id) = (SELECT 
        MAX(So_Luong_Exam)
    FROM
        (SELECT 
            COUNT(EQ.exam_id) AS So_Luong_Exam
        FROM
            question Q
        LEFT JOIN examquestion EQ ON EQ.question_id = Q.question_id
        GROUP BY Q.question_id) AS statistic_Question_Exam);
-----------------------------------------------------------------------------------
-- Question 6: Thông kê mỗi countQuestion được sử dụng trong bao nhiêu Question --
USE `quan_ly_phong_ban`;
SELECT 
    C.category_id,
    C.category_name,
    COUNT(Q.category_id) AS co_luong_su_dung
FROM
    category_question C
        LEFT JOIN
    question Q ON C.category_id = Q.category_id
GROUP BY C.category_id
HAVING COUNT(Q.category_id);
-----------------------------------------------------------------------
-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
USE `quan_ly_phong_ban`;
SELECT 
	Q.question_id,
    Q.content,
    COUNT(E.question_id) AS so_luong_su_dung
FROM
    examquestion E
        LEFT JOIN
    question Q ON E.question_id = Q.category_id
GROUP BY Q.category_id
having COUNT(E.question_id);
-----------------------------------------------------------------------------------------
-- Question 8: Lấy ra Question có nhiều câu trả lời nhất --
use `quan_ly_phong_ban`;
SELECT 
    Q.question_id, COUNT(A.answer_id) as so_cau_tra_loi
FROM
    question Q
        LEFT JOIN
    answer A ON Q.question_id = A.question_id
GROUP BY Q.question_id
HAVING COUNT(A.answer_id) = (SELECT 
        MAX(So_Luong_answer)
    FROM
        (SELECT 
            COUNT(A.answer_id) AS So_Luong_answer
        FROM
            question Q
        LEFT JOIN answer A ON A.question_id = Q.question_id
        GROUP BY Q.question_id) AS so_luong_cau_hoi);

-----------------------------------------------------------
-- Question 9: Thống kê số lượng account trong mỗi group --
USE `quan_ly_phong_ban`;
SELECT 
    G.group_id, COUNT(GA.account_id) AS so_luong_nhan_vien
FROM
    `group` G
        LEFT JOIN
    group_account GA ON GA.group_id = G.group_id
GROUP BY GA.group_id
HAVING COUNT(GA.account_id)
 ;
----------------------------------------------
-- Question 10: Tìm chức vụ có ít người nhất--
USE `quan_ly_phong_ban`;
SELECT 
    Q.position_id
FROM
    `position` Q
        LEFT JOIN
    `account` A ON Q.position_id = A.position_id
GROUP BY A.position_id
HAVING COUNT(A.position_id) = (SELECT 
        MIN(so_luong_nhan_vien)
    FROM
        (SELECT 
            COUNT(A.position_id) AS so_luong_nhan_vien
        FROM
            `position` Q
        LEFT JOIN `account` A ON Q.position_id = A.position_id
        GROUP BY A.position_id) AS chuc_vu_nhan_vien);
--------------------------------------------------------------------------------------
-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM ---

-----------------------------------------------------------
-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của
-- question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …
USE `quan_ly_phong_ban`;
SELECT 
    Q.question_id,
    Q.category_id,
    Q.type_id,
    Q.creator_id,
    AC.fullname,
    A.answer_id,
    A.content
FROM
    question Q
        LEFT JOIN
    answer A ON Q.question_id = A.question_id
        LEFT JOIN
    `ư` AC ON Q.creator_id = AC.account_id;

----------------------------------------------------------------------
-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
USE `quan_ly_phong_ban`;
SELECT 
    TQ.type_id,
    TQ.type_name,
    COUNT(Q.type_id) AS so_luong_cau_hoi
FROM
    question Q
        LEFT JOIN
    type_quesition TQ ON Q.type_id = TQ.type_id
GROUP BY Q.type_id
HAVING COUNT(Q.type_id);

---------------------------------------------------
-- Question 14:Lấy ra group không có account nào --
USE `quan_ly_phong_ban`;
SELECT 
    *
FROM
    `group` GR
        LEFT JOIN
    group_account g ON g.group_id = GR.group_id
WHERE
    g.group_id IS NULL;
------------------------------------------------------
-- Question 16: Lấy ra question không có answer nào --
USE `quan_ly_phong_ban`;
SELECT 
    *
FROM
    question Q
        LEFT JOIN
    answer A ON Q.question_id = A.question_id
WHERE
    A.question_id IS NULL;
--------------------------------------
-- Question 17:
-- a) Lấy các account thuộc nhóm thứ 1
-- b) Lấy các account thuộc nhóm thứ 2
-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau --

USE `quan_ly_phong_ban`;
SELECT 
    A.fullname, A.username, G.account_id
FROM
    group_account G
        INNER JOIN
    `account` A ON G.account_id = A.account_id
WHERE
    group_id = 1 
UNION SELECT 
    A.fullname, A.username, G.account_id
FROM
    group_account G
        INNER JOIN
    `account` A ON G.account_id = A.account_id
WHERE
    group_id = 2;

------------------------------------------------
-- Question 18:
-- a) Lấy các group có lớn hơn 5 thành viên
-- b) Lấy các group có nhỏ hơn 7 thành viên
-- c) Ghép 2 kết quả từ câu a) và câu b)--
USE `quan_ly_phong_ban`;
SELECT 
    G.group_name,
    G.group_id,
    COUNT(GA.group_id) AS so_lương_nhan_vien
FROM
    `group` G
        LEFT JOIN
    group_account GA ON GA.group_id = G.group_id
GROUP BY GA.group_id
HAVING COUNT(GA.group_id) > 1 
UNION SELECT 
    G.group_name,
    G.group_id,
    COUNT(GA.group_id) AS so_lương_nhan_vien
FROM
    `group` G
        LEFT JOIN
    group_account GA ON GA.group_id = G.group_id
GROUP BY GA.group_id
HAVING COUNT(GA.group_id) < 1;