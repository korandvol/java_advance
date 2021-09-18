drop database if exists i_shop;
create database i_shop char set utf8;
use i_shop;

CREATE TABLE user(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(256) NOT NULL,
last_name VARCHAR(256) NOT NULL,
email VARCHAR(256) NOT NULL,
role VARCHAR(256) NOT NULL,
password VARCHAR(256) NOT NULL)
;

CREATE TABLE product(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
description VARCHAR(256) NOT NULL,
price INT(11) NOT NULL);

CREATE TABLE BUCKET(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
user_id INT(11) DEFAULT NULL,
product_id INT(11) DEFAULT NULL,
purchase_date timestamp NULL);


ALTER TABLE BUCKET ADD FOREIGN KEY (user_id)
REFERENCES user(id); 
ALTER TABLE BUCKET ADD FOREIGN KEY (product_id)
REFERENCES product(id);


SELECT * FROM user;

SELECT * FROM product;
SELECT * FROM BUCKET;

INSERT INTO user(first_name, last_name, email, role, password)
VALUES
('boss', 'big boss', 'bb@gmail.com', 'ADMINISTRATOR', 123456789)
;