DROP DATABASE IF EXISTS Employee;
CREATE DATABASE Employee;
USE Employee;

CREATE TABLE Department (
    Department_Number TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Department_Name VARCHAR(50) NOT NULL
);

CREATE TABLE Employee_Table (
    Employee_Number TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Employee_Name VARCHAR(50) NOT NULL,
    Department_Number TINYINT UNSIGNED NOT NULL,
    FOREIGN KEY (Department_Number) REFERENCES Department(Department_Number)
);

CREATE TABLE Employee_Skill_Table (
    Employee_Number TINYINT UNSIGNED PRIMARY KEY,
    Skill_Code CHAR(10) NOT NULL,
    Date_Registered DATETIME,
	FOREIGN KEY(Employee_Number) REFERENCES Employee_Table(Employee_Number)
);


-- THÊM DATA CHO BẢNG Department --
INSERT INTO `Department`(`Department_Name`) VALUE
			( 'PRESIDENT'		),
			( 'MARKETING'		),
            ( 'ACCOUNTANCY'	),
            ( 'PERSONNEL'		),
            ('DEVELOPER'		),
            ('FINANCE'		),
            ('SALE'			),
            ('TECHNICAL'		),
            ('SECURITY'		);
            
-- THÊM DATA CHO BẢNG Employee_Table --
INSERT INTO `Employee_Table`(`Employee_Name`,`Department_Number`) VALUE
			('trần thị hiển',		1),
			('nguyễn văn hoằng',	2),
			('Nguyễn văn anh',		3),
			('nguyễn thị ngọc',		4),
			('lê văn đức',			5),
			('lê thị giang',		6),
			('Lê ngọc du',			7),
			('lê hữu việt',			8),
			('hoàng thị nga',		9),
			('Cao thị anh',			1);

-- THÊM DATA CHO BẢNG Employee_Skill_Table --
INSERT INTO `Employee_Skill_Table`(`Employee_Number`,`Skill_Code`,`Date_Registered`) 
	VALUE	(2,'JAVA','2010-09-01'),
            (3,'SQL','2010-09-02'),
            (5,'PHP','2010-09-02'),
            (6,'NET','2010-09-03'),
            (1,'SQL','2010-09-01'),
            (10,'JAVA','2010-09-04'),
            (3,'JAVA','	2010-09-03'),
            (2,'JAVA','	2010-09-05'),
            (1,'PHP','	2010-09-04'),
            (4,'PHP','	2010-09-05');
            
-- Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java --
USE Employee;
SELECT 
    S.Employee_Number, S.Skill_Code, A.Employee_Name
FROM
    Employee_Skill_Table S
        INNER JOIN
    Employee_Table A ON S.Employee_Number = A.Employee_Number
WHERE
    S.Skill_Code = 'JAVA';
     
-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >1 nhân viên --
USE Employee;
SELECT 
    d.Department_Number,
    d.Department_Name,
    COUNT(e.Employee_Number) AS so_nhan_vien
FROM
    Department d
        INNER JOIN
    employee_table e ON d.Department_Number = e.Department_Number
GROUP BY e.Department_Number
HAVING COUNT(e.Employee_Number) > 1;

-- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban. --
USE Employee;
SELECT 
    d.Department_Number,
    d.Department_Name,
	e.employee_Name
FROM
    Department d
        INNER JOIN
    employee_table e ON d.Department_Number = e.Department_Number
group by d.Department_Number
having count(e.Department_Number);

-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills --
USE Employee;
SELECT 
    e.Employee_Number,
    e.Employee_Name,
    count(sk.Skill_Code) as so_luong_skill
FROM
    employee_table e
        INNER JOIN
    employee_skill_table sk ON e.Employee_Number = sk.Employee_Number
    GROUP BY sk.Skill_Code
    having count(sk.Skill_Code)>1;
    
		

