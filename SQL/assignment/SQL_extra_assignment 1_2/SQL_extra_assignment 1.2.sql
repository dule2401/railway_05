DROP DATABASE IF EXISTS Data_Types;
CREATE DATABASE Data_Types;
USE Data_Types ;
CREATE TABLE `Data` (
id SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY key ,
`name` VARCHAR(50) NOT NULL ,
`code` CHAR(5) UNIQUE NOT NULL,
modified_date TIMESTAMP
);
