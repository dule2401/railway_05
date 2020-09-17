DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE ThucTap;
USE ThucTap;
CREATE TABLE GiangVien (
magv SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
hoten NVARCHAR(50) NOT NULL,
luong INT UNSIGNED NOT NULL 
);
CREATE TABLE SinhVien (
masv SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
hoten NVARCHAR(50) NOT NULL,
namsinh DATE,
quequan NVARCHAR(50) NOT NULL
);
CREATE TABLE DeTai (
madt SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
tendt NVARCHAR(50) NOT NULL,
kinhphi INT UNSIGNED NOT NULL ,
NoiThucTap NVARCHAR(50) NOT NULL
);
CREATE TABLE HuongDan (
id SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
masv SMALLINT UNSIGNED NOT NULL,
madt SMALLINT UNSIGNED NOT NULL,
magv SMALLINT UNSIGNED NOT NULL,
ketqua NVARCHAR(50) NOT NULL,
 FOREIGN KEY (magv) REFERENCES GiangVien(magv),
 FOREIGN KEY (masv) REFERENCES SinhVien(masv),
 FOREIGN KEY (madt) REFERENCES DeTai(madt)
);

INSERT INTO GiangVien( hoten ,luong ) VALUES
		(N'lê ngọc du', 8000000 ),
        (N'cao thị anh', 8500000),
        (N'đỗ thị thủy', 10000000),
        (N'đinh thị ly',9000000);
INSERT INTO SinhVien(hoten,namsinh,quequan) VALUES
		(N'nguyễn thị yến', '1986-06-12',N'hà nội'),
        (N'lê văn chiễn','2000-04-19',N'thanh hóa'),
        (N'trương huyền thương','1997-11-19',N'thanh hóa'),
        (N'đỗ thị quỳnh','1997-11-01',N'hà nội'),
        (N'lê văn sơn','1995-05-01',N'hà nội');
INSERT INTO DeTai (tendt,kinhphi,NoiThucTap) VALUES
		(N'xây dựng','5000000',N'hà nội'),
        (N'giao thông','8000000',N'thái nguyên'),
        (N'xã hội','7000000',N'thanh hóa'),
        (N'phương tiện','20000000',N'quảng ninh'),
        (N'bán hàng','15000000',N'hòa bình');
INSERT INTO HuongDan (masv,madt,magv,ketqua) VALUES
		(2,2,2,N'đạt'),
        (3,5,2,N'không đạt'),
        (5,1,1,N'đạt');
       
        
        
-- --------------------------------------------------------------------------
-- 2. Viết lệnh để
-- a) Lấy tất cả các sinh viên chưa có đề tài hướng dẫn
USE ThucTap;
SELECT*
FROM SinhVien S
LEFT JOIN HuongDan H ON S.masv = H.masv
GROUP BY S.masv
HAVING H.madt IS NULL;
-- b) Lấy ra số sinh viên của đề tài ‘xây dựng’
USE ThucTap;
SELECT *
FROM DeTai D
JOIN HuongDan H ON  D.madt = D.madt 
GROUP BY D.tendt
HAVING D.tendt = 'xây dựng' ;

-- --------------------------------------------------
-- 3. Tạo view có tên là "SinhVienInfo" lấy các thông tin về học sinh bao gồm:
-- mã số, họ tên và tên đề tài
-- (Nếu sinh viên chưa có đề tài thì column tên đề tài sẽ in ra "Chưa có")
USE ThucTap;
DROP VIEW IF EXISTS SinhVienInfo;
CREATE  VIEW  SinhVienInfo AS
	SELECT S.masv, S.hoten,
     IF (D.madt IS NULL, 'Chưa có',D.tendt) AS tendt
    FROM SinhVien S
    LEFT JOIN HuongDan H ON S.masv = H.masv
    LEFT JOIN DeTai D ON H.madt = D.madt;
   
    -- ---------------------------------------------------------------
  --   -- 4. Tạo trigger cho table SinhVien khi insert sinh viên có năm sinh <= 1900
-- thì hiện ra thông báo "năm sinh phải > 1900"
USE ThucTap;
DROP TRIGGER IF EXISTS insert_stud ;
DELIMITER $$
CREATE TRIGGER insert_stud
BEFORE 
INSERT ON SinhVien
FOR EACH ROW
	BEGIN 
			IF NEW.YEAR(namsinh) <= '1900' THEN
            SIGNAL SQLSTATE '12345'
			SET MESSAGE_TEXT = 'năm sinh phải > 1900';
			END IF ;
    END $$
DELIMITER ;


-- -------------------------------------------------------------------------
-- 5. Hãy cấu hình table sao cho khi xóa 1 sinh viên nào đó thì sẽ tất cả thông
-- tin trong table HuongDan liên quan tới sinh viên đó xóa đi
USE ThucTap;
DROP PROCEDURE IF EXISTS delete_stud;
DELIMITER $$
CREATE PROCEDURE delete_stud(IN in_put_mssv SMALLINT UNSIGNED )
	BEGIN
		DELETE 
		FROM HuongDan
        WHERE masv = in_put_mssv;
        DELETE
        FROM SinhVien
        WHERE masv = in_put_mssv;
    END$$
DELIMITER ;
