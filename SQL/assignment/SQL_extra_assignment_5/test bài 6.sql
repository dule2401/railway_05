-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các
-- account thuộc phòng ban đó --

use `quan_ly_phong_ban`;
DELIMITER $$;
CREATE procedure enter_your_username (in department_name varchar(50))
	BEGIN
		SELECT D.department_name,A.account_id,A.fullname
        from `account` A
        left join `department` D on A.department_id = D.department_id
        group by D.department_id

    END$$
DELIMITER ;