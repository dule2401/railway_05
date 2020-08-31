DROP DATABASE IF EXISTS sale_management;
CREATE DATABASE sale_management;
USE sale_management;

CREATE TABLE Customer (
customer_id int,
first_name varchar(50),
last_name varchar(50),
email_address varchar(50)
);

CREATE TABLE sales (
purchase_number int,
date_of_puschase date,
customer_id int,
item_code varbinary(50)
);

CREATE TABLE items (
item_code varchar(50),
item	varchar(50),
unit_price_usd int,
company_id int,
company varchar(50),
phone_number varchar(50)
);
