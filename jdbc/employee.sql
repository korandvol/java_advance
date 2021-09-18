
DROP DATABASE  IF EXISTS employee;
CREATE DATABASE employee CHAR SET UTF8;
USE employee;
CREATE TABLE employee(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
fname VARCHAR(120) NOT NULL UNIQUE,
lname VARCHAR(120) NOT NULL UNIQUE);

INSERT INTO employee(fname, lname)
VALUES
('Andrii', 'Korchak'),
('Nastja', 'Topunkova'),
('Zlata', 'Korchachka');

SELECT * FROM employee;

