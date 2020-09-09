-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale --
use `quan_ly_phong_ban`;

CREATE VIEW department_sale AS
    SELECT 
        A.account_id, A.fullname, D.department_name
    FROM
        `account` A
            LEFT JOIN
        department D ON A.department_id = D.department_id
    WHERE
        D.department_name = 'sale';
-------------------------------------------------------------------------------------------
-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất --

use `quan_ly_phong_ban`;
CREATE view  thong_tin_account_tham_gia_group  as
SELECT 
    A.account_id,COUNT(GR.group_id) as so_luong_tham_gia_group
FROM
    `group_account` GR
        LEFT JOIN
    `account` A ON GR.account_id = A.account_id
GROUP BY GR.group_id
HAVING COUNT(GR.group_id) = (SELECT 
        MAX(so_luong_group)
    FROM
        (SELECT 
            COUNT(GR.group_id) AS so_luong_group
        FROM
            `group_account` GR
        LEFT JOIN `account` A ON GR.account_id = A.account_id
        GROUP BY GR.group_id) AS bang_group);
--------------------------------------------------------------------------------------        
-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ
-- được coi là quá dài) và xóa nó đi --
use `quan_ly_phong_ban`;
CREATE VIEW so_cau_hoi_qua_dai AS
    SELECT 
        *, LENGTH(content)
    FROM
        `question`
    WHERE
        LENGTH(content) > 25;
drop view if exists so_cau_hoi_qua_dai;
------------------------------------------------------------------------------------
-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất --
use `quan_ly_phong_ban`;
create view number_of_department as
SELECT 
    D.department_id, D.department_name, count(A.account_id)
FROM
    `account` A
        LEFT JOIN
    `department` D ON A.department_id = D.department_id
GROUP BY A.department_id
HAVING COUNT(A.department_id) = (SELECT 
        MAX(number_of_department)
    FROM
        (SELECT 
            COUNT(A.department_id) AS number_of_department
        FROM
            `account` A
        LEFT JOIN `department` D ON A.department_id = D.department_id
        GROUP BY A.department_id
        HAVING COUNT(A.department_id)) AS so_lương_department);
        
-- dung cte--
with   so_department as 
(SELECT 
            COUNT(A.department_id) AS number_of_department
        FROM
            `department` D
        LEFT JOIN `account` A ON A.department_id = D.department_id
        GROUP BY D.department_id)
	SELECT*
    from `account`
    GROUP BY department_id
    having count(department_id) = (SELECT max(number_of_department)
									from so_department);
        
-------------------------------------------------------------------------------	
-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo --
use `quan_ly_phong_ban`;
CREATE VIEW questions_of_their_creator_cao AS
    SELECT 
        Q.question_id, A.fullname, A.account_id
    FROM
        question Q
            LEFT JOIN
        `account` A ON Q.creator_id = A.account_id
    GROUP BY Q.question_id
    HAVING A.account_id = (SELECT 
            account_id AS nguoi_tao_co_ho_cao
        FROM
            `account`
        WHERE
            fullname LIKE 'cao%');
  -- dùng cte --
