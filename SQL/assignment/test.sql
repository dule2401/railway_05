DROP DATABASE IF EXISTS quan_ly_thuc_tap;
CREATE DATABASE quan_ly_thuc_tap;
USE quan_ly_thuc_tap;

CREATE TABLE Country (
country_id TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
country_name NVARCHAR(30) NOT NULL UNIQUE KEY
);

CREATE TABLE Location (
location_id TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
street_adress NVARCHAR(30) NOT NULL UNIQUE KEY,
postal_code NVARCHAR(30) NOT NULL UNIQUE KEY,
country_id TINYINT UNSIGNED ,
Foreign key (country_id) REFERENCES Country(country_id) ON DELETE SET NULL 
);

CREATE TABLE Employee (
employee_id TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
full_name NVARCHAR(30) NOT NULL UNIQUE KEY,
email NVARCHAR(30) NOT NULL UNIQUE KEY,
location_id TINYINT UNSIGNED ,
Foreign key (location_id) REFERENCES Location(location_id) ON DELETE SET NULL 
);

-- DATA--
INSERT INTO Country(country_name) VALUES
	(N'lào'),
    (N'thái'),
    (N'viet nam'),
    (N'trung quoc');
    
  INSERT INTO Location(street_adress,postal_code,country_id) VALUES  
	('abc','121wq',1),
    ('xyz','2121s',1),
    ('asd','1212w',3),
    ('afdda','121s',3),
    ('asas','adas1',2),
    ('sassaa','ada2',4);
  INSERT INTO Employee(full_name,email,location_id) VALUES      
    ('saas','1@gmail.com',1),
    ('sasada','2@gmail.com',2),
    ('dada','3@gmail.com',3),
    ('ddadad','nn03@gmail.com',4),
    ('czcx','4@gmail.com',1),
    ('vasvsa','5@gmail.com',2);
    
    
 --   ---------------------------------------------------------------
SELECT C.country_name,L.location_id,E.employee_id,E.full_name,E.email
FROM Country C
LEFT JOIN Location L ON C.country_id = L.country_id
LEFT JOIN Employee E ON L.location_id = E.location_id
WHERE C.country_name = 'VIET NAM';

SELECT C.country_name
FROM Country C
LEFT JOIN Location L ON C.country_id = L.country_id
LEFT JOIN Employee E ON L.location_id = E.location_id
WHERE E.email = 'nn03@gmail.com';

SELECT C.country_id,C.country_name,L.location_id,COUNT(E.employee_id) as so_nhan_vien
FROM Country C
LEFT JOIN Location L ON C.country_id = L.country_id
LEFT JOIN Employee E ON L.location_id = E.location_id
GROUP BY L.location_id
HAVING COUNT(E.employee_id);

SELECT C.country_id,COUNT(E.employee_id) AS SO_NHAN_VIEN
FROM  Country C
LEFT JOIN Location L ON C.country_id = L.country_id
LEFT JOIN Employee E ON L.location_id = E.location_id
GROUP BY C.country_id
HAVING COUNT(E.employee_id);

DROP TRIGGER IF EXISTS insert_employee;
delimiter $$

CREATE TRIGGER insert_employee
BEFORE
INSERT ON `Employee`
FOR EACH ROW

BEGIN
	IF (SELECT COUNT(E.employee_id) AS SO_NHAN_VIEN
		FROM  Country C
		LEFT JOIN Location L ON C.country_id = L.country_id
		LEFT JOIN Employee E ON L.location_id = E.location_id
		GROUP BY C.country_id
		HAVING COUNT(E.employee_id)) > 10
        THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'insert Employee on Country max value < 10 ';
	END IF;
END $$ 
delimiter ;

USE quan_ly_thuc_tap;
DROP PROCEDURE IF EXISTS delete_democode;
DELIMITER $$
CREATE PROCEDURE delete_democode(IN in_put_location_id TINYINT UNSIGNED )
	BEGIN
		DELETE 
		FROM Location
        WHERE location_id = in_put_location_id;
    END$$
DELIMITER ;


