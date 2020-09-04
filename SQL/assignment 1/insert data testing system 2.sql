DROP DATABASE IF EXISTS quan_ly_phong_ban;
create database quan_ly_phong_ban;
use quan_ly_phong_ban;
-- tạo bảng khai báo phòng ban--
CREATE TABLE department (
    department_id SMALLINT UNSIGNED PRIMARY KEY,
    department_name VARCHAR(50) UNIQUE KEY
);

-- dang tao bang chức vụ --
CREATE TABLE position (
    position_id SMALLINT UNSIGNED PRIMARY KEY,
    position_name VARCHAR(50) NOT NULL
);
-- tạo bảng khai báo tài khoản--
CREATE TABLE `account` (
    account_id INT PRIMARY KEY,
    email VARCHAR(50) UNIQUE,
    username VARCHAR(50) UNIQUE CHECK(LENGTH(username)>= 3),
    fullname NVARCHAR(50) CHECK(length(fullname)>= 3),
    department_id SMALLINT UNSIGNED,
    position_id SMALLINT UNSIGNED not null,
    create_date DATETIME,
    FOREIGN KEY (department_id)REFERENCES department(department_id),
    FOREIGN KEY (position_id)REFERENCES `position`(position_id)
);
-- bảng khai báo group--
CREATE TABLE `group` (
    group_id SMALLINT UNSIGNED PRIMARY KEY,
    group_name VARCHAR(50) NOT NULL,
    creator_id SMALLINT UNSIGNED UNIQUE,
    creat_date DATETIME
);
-- bảng khai báo nhóm--
CREATE TABLE group_account (
    group_id SMALLINT UNSIGNED UNIQUE,
    account_id INT UNIQUE UNIQUE,
    join_date DATETIME,
    PRIMARY KEY (group_iD, account_id),
    FOREIGN KEY (account_id)REFERENCES `account`(account_id),
    FOREIGN KEY(group_id)REFERENCES `group`(group_id)
);
-- loại câu hỏi --
CREATE TABLE type_quesition (
    type_id SMALLINT UNSIGNED PRIMARY KEY,
    type_name VARCHAR(50) NOT NULL
);
-- chủ đề câu hỏi --
CREATE TABLE category_question (
    category_id SMALLINT UNSIGNED PRIMARY KEY,
    category_name NVARCHAR(50) NOT NULL
);
			
-- định danh câu hỏi--
CREATE TABLE question (
    question_id SMALLINT UNSIGNED PRIMARY KEY,
    content NVARCHAR(50) NOT NULL,
    category_id SMALLINT UNSIGNED UNIQUE,
    type_id SMALLINT UNSIGNED,
    creator_id SMALLINT UNSIGNED,
    create_date DATETIME,
    FOREIGN KEY(category_id) REFERENCES category_question(category_id),
    FOREIGN KEY(type_id)REFERENCES type_quesition(type_id)
);
-- câu trả lời --
CREATE TABLE answer (
    answer_id SMALLINT UNSIGNED,
    content VARCHAR(50) NOT NULL,
    question_id SMALLINT UNSIGNED,
    iscorrect ENUM('đúng','sai') DEFAULT('sai'),
    PRIMARY KEY (answer_id,question_id),
    FOREIGN KEY(question_id) REFERENCES question(question_id)
);

-- đề thi --
CREATE TABLE exam (
    exam_id SMALLINT UNSIGNED PRIMARY key,
    `code` VARCHAR(50) UNIQUE,
    title VARCHAR(50) NOT NULL,
    category_id SMALLINT UNSIGNED UNIQUE,
    duration SMALLINT UNSIGNED NOT NULL,
    creator_id SMALLINT UNSIGNED UNIQUE,
    create_date DATETIME
);
-- bảng đề thi --
CREATE TABLE examquestion (
    exam_id SMALLINT UNSIGNED,
    question_id SMALLINT UNSIGNED,
    PRIMARY KEY(exam_id,question_id),
    FOREIGN KEY(exam_id) REFERENCES exam(exam_id),
    FOREIGN KEY(question_id) REFERENCES question(question_id)
);
-- NHẬP DỮ LIỆU CHO BẢNG PHÒNG BAN--
 INSERT INTO department(department_id, department_name)
 VALUES		(1, 'PRESIDENT'		),
			(2, 'MARKETING'		),
            (3, 'ACCOUNTANCY'	),
            (4, 'PERSONNEL'		),
            (5,'DEVELOPER'		),
            (6,'FINANCE'		),
            (7,'SALE'			),
            (8,'TECHNICAL'		),
            (10,'SECURITY'		);
            -- NHẬP DỮ LIỆU CHO BẢNG CHỨC VỤ --
INSERT INTO `position`(position_id,position_name)
VALUES		(1, 'GENERAL DIRECTOR'		),
			(2, 'TECHNICAL MANAGER'		),
            (3, 'SALE MANAGER'			),
            (4, 'FINANCE MANAGER'		),
            (5, 'CHIEF OF OPERRATIONS'		),
            (6, 'ACCOUNTANT'),
            (7, 'CODER'),
            (8,'WAREHOUSE STAFF'),
            (9,'SECURITY CHIEF');
-- NHẬP DỮ LIỆU CHO BẢNG ACCOUNT--
INSERT INTO `account`(
		account_id,		email,					username,		fullname,department_id,	position_id,create_date) VALUE
			(1,	'nguyenngoc@gmail.com',		'nguyenngoc',	N'trương thị thương2',6,			4,		25/08/2020),
            (2,	'vanchiena1@gmail.com',		'chienproa1',	N'lê văn chiến 1 ',	3,			2,		25/08/2020),
            (3,	'vantuana2@gmail.com',		'tuan190997',	N'nguyễn văn tuân',	2,			3,		26/08/2020),
            (4,	'trinhtuana1@gmail.com',	'trinhtuana1',	N'trịnh văn tuân',	4,			4,		26/08/2020),
            (5,	'minhchien@gmail.com',		'minhchienlc',	N'lê văn chiến 2 ',	4,			5,		27/08/2020),
            (6, 'haidang29@gmail.com',		'caoanh240197', N'cao thị anh',		1,			1,		27/08/2020),
            (7, 'account1@gmail.com',		'truongthuong', N'trương thị thương1',5,			8,		27/08/2020),
            (8, 'account2@gmail.com',			'lelan',	N'le thị lan',		5,			7,		28/28/2020),
            (9, 'account3@gmail.com',			'ngocluc',	N'le ngoc luc',		10,			9,		28/08/2020);
-- NHẬP DỮ LIỆU CHO BẢNG GROUP --
INSERT INTO `group`(group_id,group_name,creator_id,creat_date) VALUE
			(1,'SALES ',			2,		'2020-09-01'),
            (2,'TETECHNICAL',		3,		'2020-09-01'),
            (3,'DEV',				8,		'2020-08-31'),
            (4,'SECURITY',			9,		'2020-08-30'),
            (5,'MANAGER',			1,		'2020-08-30');
-- NHẬP DỮ LIỆU CHO BẢNG group_account--
INSERT INTO group_account(group_id,account_id,join_date) VALUE
			(1,9,30/08/2020),
            (2,5,30/08/2020),
            (3,3,31/08/2020),
            (4,6,31/08/2020),
            (5,7,31/08/2020);
-- NHẬP DỮ LIỆU CHO BẢNG typequesition --
INSERT INTO type_quesition(type_id,type_name) VALUE
			(1,'True / False'),
            (2,'short answer');
-- NHẬP DỮ LIỆU categoryquestion --
INSERT INTO category_question(category_id,category_name) VALUE
			(1,'C'			),
			(2,'C++'		),
			(3,'JAVA'		),
            (4,'ios'		),
			(5,'SQL'		);
INSERT INTO question(question_id,content,category_id,type_id,creator_id,create_date) VALUE
			(1,' CÂU HỎI 1 C LÀ GÌ'		,1,		1,		6,		01/09/2020),
            (2,' HÃY CHO BIẾT C++ LÀ GÌ'		,2,		1,		6,		01/09/2020),
            (3,' CÂU HỎI 2 JAVA LÀ GÌ'	,3,		2,		1,		01/09/2020),
            (4,' CÂU HỎI 3 iOS LÀ GÌ'		,4,		2,		2,		01/09/2020),
            (5,' HÃY CHO BIẾT SQL LÀ GÌ'		,5,		1,		1,		01/09/2020);
INSERT INTO answer(answer_id,content,question_id,iscorrect) VALUE 
			(1,'C là một ngôn ngữ lập trình máy tính',1, 'đúng'),
            (2,'c++ là bổ chợ cho c ',2, 'sai'),
            (3,'là ngôn ngữ lập trình máy tính ',3, 'đúng'),
            (4,'là hệ điều hành của ios ',4,'sai'),
            (5,'là kiểu rảng buộc dữ liệu ',5, 'đúng');
INSERT INTO exam(exam_id,`code`,title,category_id,duration,creator_id,create_date) VALUE
			(1,	'A1' ,	'c', 1	,	'60',1,NOW()),
            (2,	'A2' ,	'c++',3	, 	'120',4,NOW()),
            (3,	'A3' ,	'JAVA',2 ,	'90',5,NOW()),
            (4,	'A4' ,	'IOS',5, 	'90',6,NOW()),
            (5,	'A5' ,	'SQL',4, 	'120',2,NOW());
INSERT INTO examquestion(exam_id,question_id) VALUE
			(1,2),
            (2,1),
            (3,5),
            (4,4),
            (5,3);
            

			
