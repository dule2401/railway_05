DROP DATABASE IF EXISTS `table trainee`;
CREATE DATABASE `table trainee`;
USE `table trainee`;
-- khai báo bảng học sinh--
CREATE TABLE Trainee (
Trainee_id SMALLINT UNSIGNED PRIMARY KEY,
full_name VARCHAR(50) NOT NULL,
birth_date DATE,
gender ENUM ('male',' female','unknow'),
training_class CHAR(20) NOT NULL,
et_iq tinyint unsigned, 
	check(et_iq <= 20),
et_gmath tinyint unsigned,
	check(et_iq <= 20),
et_english tinyint unsigned,
	check( et_english <=20),
evaluation_notes Nchar(50) NOT NULL -- note đánh giá --
 );
 CREATE table vti_account (
 vti_account SMALLINT UNSIGNED UNIQUE NOT NULL
);
