DROP DATABASE IF EXISTS Testing_System;
create database Testing_System;
use Testing_System;
-- tạo bảng khai báo phòng ban--
CREATE TABLE department (
    department_id SMALLINT UNSIGNED PRIMARY KEY,
    department_name VARCHAR(50)
);
-- dang tao bang chức vụ --
CREATE TABLE position (
    position_id SMALLINT UNSIGNED PRIMARY KEY,
    position_name VARCHAR(50)
);
-- tạo bảng khai báo tài khoản--
CREATE TABLE accounts (
    account_id INT PRIMARY KEY,
    email VARCHAR(50),
    username VARCHAR(50),
    fullname VARCHAR(50),
    department_id SMALLINT UNSIGNED,
    position_id SMALLINT UNSIGNED,
    create_date DATETIME
);
-- bảng khai báo group--
CREATE TABLE `group` (
    group_id SMALLINT UNSIGNED PRIMARY KEY,
    group_name VARCHAR(50),
    creator_id SMALLINT UNSIGNED,
    creat_date DATETIME
);
-- bảng khai báo nhóm--
CREATE TABLE groupaccount (
    group_id SMALLINT UNSIGNED,
    account_id INT ,
    join_date DATETIME,
    PRIMARY KEY (group_iD, account_id)
);
-- loại câu hỏi --
CREATE TABLE typequesition (
    type_id SMALLINT UNSIGNED PRIMARY KEY,
    type_name VARCHAR(50)
);
-- chủ đề câu hỏi --
CREATE TABLE categoryquestion (
    category_id SMALLINT UNSIGNED PRIMARY KEY,
    category_name VARCHAR(50)
);
-- định danh câu hỏi--
CREATE TABLE question (
    question_id SMALLINT UNSIGNED PRIMARY KEY,
    content VARCHAR(50),
    category_id SMALLINT UNSIGNED,
    type_id SMALLINT UNSIGNED,
    creator_id SMALLINT UNSIGNED,
    create_date DATETIME
);
-- câu trả lời --
CREATE TABLE answer (
    answer_id SMALLINT UNSIGNED,
    content VARCHAR(50),
    question_id SMALLINT UNSIGNED,
    iscorrect ENUM('đúng','sai'),
    PRIMARY KEY (answer_id,question_id)
);
-- đề thi --
CREATE TABLE exam (
    exam_id SMALLINT UNSIGNED,
    `code` VARCHAR(50) PRIMARY KEY,
    title VARCHAR(50),
    category_id SMALLINT UNSIGNED,
    duration DATETIME,
    creator_id SMALLINT UNSIGNED,
    create_date DATETIME
);
-- bảng đề thi --
CREATE TABLE examquestion (
    exam_id SMALLINT UNSIGNED,
    question_id SMALLINT UNSIGNED,
    PRIMARY KEY(exam_id,question_id)
);
