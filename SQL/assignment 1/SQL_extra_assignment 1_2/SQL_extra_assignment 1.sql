DROP DATABASE IF EXISTS `table_trainee`;
CREATE DATABASE `table_trainee`;
USE `table_trainee`;
-- khai báo bảng học sinh--
CREATE TABLE Trainee (
Trainee_id MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
full_name VARCHAR(50) NOT NULL,
birth_date DATE,
gender ENUM ('male',' female','unknow'),
training_class CHAR(20) NOT NULL,
et_iq FLOAT unsigned, 
	check(et_iq <= 20),
et_gmath FLOAT unsigned,
	check(et_iq <= 20),
et_english FLOAT unsigned,
	check( et_english <=20),
evaluation_notes Nvarchar(200) -- note đánh giá --
 );
 -- Thêm trường vti_account vào bảng với điều kiện unique và not null--
ALTER TABLE Trainee ADD vti_account SMALLINT UNSIGNED UNIQUE NOT NULL
