DROP DATABASE IF EXISTS quan_ly_hoc_sinh ;
CREATE DATABASE quan_ly_hoc_sinh;
USE quan_ly_hoc_sinh;
CREATE TABLE quan_ly (
    id TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(20) NOT NULL,
    birth_date DATE,
    gender ENUM('male', ' female', 'unknow') DEFAULT 'unknow',
    Training_Class CHAR(5) NOT NULL,
    ET_IQ FLOAT NOT NULL CHECK (ET_IQ <= 20),
    ET_Gmath FLOAT NOT NULL CHECK (ET_Gmath <= 20),
    ET_English FLOAT NOT NULL CHECK (ET_English <= 20)
);
 
-- THÊM DATA VÀO BẢNG --
INSERT INTO quan_ly (full_name,birth_date,Training_Class,ET_IQ,ET_Gmath,ET_English) VALUE
		(N'Nguyễn văn anh'  ,'1997-02-04','A1',9	,8	,	3	),
        (N'Cao thị anh'		,'1997-01-24','A2',18	,16	,	17	),
        (N'Lê ngọc du'		,'1997-08-05','A2',17	,14	,	9	),
        (N'lê văn đức'		,'1997-09-19','A1',12	,7	,	4	),
        (N'nguyễn văn hoằng','1997-06-19','A4',15	,9	,	7	),
        (N'trần thị hiển'	,'1997-11-01','A4',10	,5	,	8	),
        (N'lê thị giang'	,'1997-04-24','A3',9	,11	,	9	),
        (N'nguyễn thị ngọc'	,'1997-12-12','A1',8	,18	,	14	),
        (N'hoàng thị nga'	,'1997-07-01','A3',6	,17	,	11	),
        (N'lê hữu việt'		,'1997-05-03','A2',5	,10	,	7	);