-- Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào, nhóm chúng thành các tháng sinh khác nhau --
USE quan_ly_hoc_sinh;
SELECT GROUP_CONCAT(full_name), GROUP_CONCAT(year(birth_date),'-',month(birth_date))
from quan_ly
GROUP BY month(birth_date), year(birth_date);

-- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau: tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table) --
USE quan_ly_hoc_sinh;
SELECT 
    *
FROM
    quan_ly
WHERE
    LENGTH(full_name) = (SELECT 
            MAX(LENGTH(full_name))
        FROM
            quan_ly);
    

-- Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là
-- những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
--  ET_IQ + ET_Gmath>=20
--  ET_IQ>=8
--  ET_Gmath>=8
--  ET_English>=18 ---
USE quan_ly_hoc_sinh;
SELECT 
    *
FROM
    quan_ly
WHERE
    (ET_IQ + ET_Gmath) >= 20 AND ET_IQ >= 8
        AND ET_Gmath >= 8
        AND ET_English >= 18;

-- Question 5: xóa thực tập sinh có TraineeID = 3 --
USE quan_ly_hoc_sinh;
DELETE FROM quan_ly 
WHERE
    ID = 3;
    
-- Question 6: Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". Hãy cập nhật thông tin vào database --
USE quan_ly_hoc_sinh;
UPDATE quan_ly 
SET 
    Training_Class = 'A2'
WHERE
    id = 5;