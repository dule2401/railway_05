DROP DATABASE IF EXISTS Testing_System;
create database Testing_System;
use Testing_System;
-- tạo bảng khai báo phòng ban--
CREATE TABLE department (
    department_id SMALLINT UNSIGNED PRIMARY KEY,
    department_name VARCHAR(50) UNIQUE KEY CHECK(LENGTH(department_name)>6)
);
-- dang tao bang chức vụ --
CREATE TABLE position (
    position_id SMALLINT UNSIGNED PRIMARY KEY,
    position_name VARCHAR(50) UNIQUE KEY CHECK(LENGTH(position_name)>6)
);
-- tạo bảng khai báo tài khoản--
CREATE TABLE `account` (
    account_id INT PRIMARY KEY,
    email VARCHAR(50) UNIQUE,
    username VARCHAR(50) UNIQUE KEY CHECK(LENGTH(username)>6),
    fullname VARCHAR(50) NOT NULL CHECK(LENGTH(fullname)>6),
    department_id SMALLINT UNSIGNED,
    position_id SMALLINT UNSIGNED not null,
    create_date DATETIME DEFAULT NOW(),
    FOREIGN KEY (department_id)REFERENCES department(department_id)
);
-- bảng khai báo group--
CREATE TABLE `group` (
    group_id SMALLINT UNSIGNED PRIMARY KEY,
    group_name VARCHAR(50) CHECK(LENGTH(group_name)>6),
    creator_id SMALLINT UNSIGNED,
    creat_date DATETIME DEFAULT NOW()
);
-- bảng khai báo nhóm--
CREATE TABLE groupaccount (
    group_id SMALLINT UNSIGNED UNIQUE,
    account_id INT UNIQUE,
    join_date DATETIME,
    PRIMARY KEY (group_iD, account_id),
    FOREIGN KEY (account_id)REFERENCES `account`(account_id),
    FOREIGN KEY(group_id)REFERENCES `group`(group_id)
);
-- loại câu hỏi --
CREATE TABLE typequesition (
    type_id SMALLINT UNSIGNED PRIMARY KEY,
    type_name VARCHAR(50) NOT NULL CHECK (LENGTH(type_name)>8)
);
-- chủ đề câu hỏi --
CREATE TABLE categoryquestion (
    category_id SMALLINT UNSIGNED PRIMARY KEY,
    category_name VARCHAR(50)
);
-- định danh câu hỏi--
CREATE TABLE question (
    question_id SMALLINT UNSIGNED PRIMARY KEY,
    content VARCHAR(50) NOT NULL CHECK(LENGTH(content)>6),
    category_id SMALLINT UNSIGNED UNIQUE,
    type_id SMALLINT UNSIGNED,
    creator_id SMALLINT UNSIGNED,
    create_date DATETIME DEFAULT NOW(),
    FOREIGN KEY(category_id) REFERENCES categoryquestion(category_id),
    FOREIGN KEY(type_id)REFERENCES typequesition(type_id)
);
-- câu trả lời --
CREATE TABLE answer (
    answer_id SMALLINT UNSIGNED,
    content VARCHAR(50) NOT NULL CHECK(LENGTH(content)>8),
    question_id SMALLINT UNSIGNED,
    iscorrect ENUM('đúng','sai')NOT NULL ,
    PRIMARY KEY (answer_id,question_id),
    FOREIGN KEY(question_id) REFERENCES question(question_id)
);
-- đề thi --
CREATE TABLE exam (
    exam_id SMALLINT UNSIGNED PRIMARY key,
    `code` VARCHAR(50) UNIQUE,
    title VARCHAR(50) CHECK (LENGTH(title)>8),
    category_id SMALLINT UNSIGNED UNIQUE,
    duration DATETIME,
    creator_id SMALLINT UNSIGNED UNIQUE,
    create_date DATETIME DEFAULT NOW()
);
-- bảng đề thi --
CREATE TABLE examquestion (
    exam_id SMALLINT UNSIGNED,
    question_id SMALLINT UNSIGNED,
    PRIMARY KEY(exam_id,question_id),
    FOREIGN KEY(exam_id) REFERENCES exam(exam_id),
    FOREIGN KEY(question_id) REFERENCES question(question_id)
);
