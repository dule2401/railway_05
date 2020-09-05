-------------- TESTING SYSTEM ------------
-------------- TRUY VẪN DỮ LIỆU ----------
-- Question 2: lấy ra tất cả các phòng ban --
SELECT 
    *
FROM
    department;
    
-- Question 3: lấy ra id của phòng ban "Sale"---
USE quan_ly_phong_ban;
SELECT 
    department_id
FROM
    department
WHERE
    department_name = 'SALE';
-- Question 4: lấy ra thông tin account có full name dài nhất--
USE quan_ly_phong_ban;
SELECT 
    *
FROM
    `account`
WHERE
    LENGTH(FULLNAME) = (SELECT 
            LENGTH(MAX(FULLNAME))
        FROM
            `account`);

-- Question 5 Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id= 3 --
USE quan_ly_phong_ban;
SELECT 
    *
FROM
    `account`
WHERE
    department_id = 3
        AND LENGTH(FULLNAME) = (SELECT LENGTH(MAX(FULLNAME))); 

-- Question 6: Lấy ra tên group đã tham gia trước ngày 2020-09-01 --
USE quan_ly_phong_ban;
SELECT 
    *
FROM
    `group`
WHERE
    creat_date < '2020-09-01';

-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 2020-09-02 --
USE quan_ly_phong_ban;
SELECT 
    `code`
FROM
    exam
WHERE
    duration > 60
        AND create_date < '2020-09-02';
    
-- Question 9: Lấy ra 5 group được tạo gần đây nhất --
USE quan_ly_phong_ban;
SELECT 
    *
FROM
    `account`
ORDER BY create_date DESC
LIMIT 5;
    
    -- Question 10: Đếm số nhân viên thuộc department có id = 2 --
USE quan_ly_phong_ban;
SELECT 
    COUNT(`account`)
FROM
    `account`
WHERE
    department_id = 4;
    
	-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "C" và kết thúc bằng chữ "H" --
USE quan_ly_phong_ban;
SELECT 
    *
FROM
    `account`
WHERE
    fullname LIKE 'C%H';
    
-- Question 12: Xóa tất cả các exam được tạo trước ngày 2020-09-04 --
USE quan_ly_phong_ban;
DELETE FROM exam 
WHERE
    create_date < '2020-09-04';

-- Question 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi" --
USE quan_ly_phong_ban;
DELETE FROM question 
WHERE
    content = '(CÂU HỎI)%';
    
-- Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn --
USE quan_ly_phong_ban;
UPDATE `account` 
SET 
    fullname = 'nguyễn bá lộc',
    email = 'loc.nguyenba@vti.com.vn'
WHERE
    account_id = 5;
    
-- Question 15: update account có id = 5 sẽ thuộc group có id = 4 -- 
USE quan_ly_phong_ban;
UPDATE group_account 
SET 
    group_id = ' 2'
WHERE
    account_id = '5';
