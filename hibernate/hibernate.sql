drop database if exists hibernate;
create database hibernate char set utf8;
use hibernate;

CREATE TABLE Person(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
firstName VARCHAR(256) NOT NULL,
lastName VARCHAR(256) NOT NULL,
age INT NOT NULL)
;

CREATE TABLE Car(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
carModel VARCHAR(256) NOT NULL)
;

SELECT * FROM Person;
SELECT * FROM Car;