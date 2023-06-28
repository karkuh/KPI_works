CREATE DATABASE lab1;

CREATE TABLE club1(
ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
FirstName VARCHAR(20) NOT NULL,
LastName VARCHAR(20) NOT NULL,
NumberPhone VARCHAR(20) NULL,
Age INT NOT NULL CHECK(Age>= 18)
);

INSERT  club1 (FirstName,LastName,Age) VALUES 
('Vlad','Karkushevskiy',18),
('Stepan','Bandera',50),
('Bogdan','Khmelnitsky',61);

SELECT * FROM club1;

LOAD DATA LOCAL INFILE 'C:/Users/User/Desktop/data.txt' INTO TABLE club1;


ALTER TABLE club1 ADD  Email VARCHAR(40);

UPDATE club1
SET Email = CONCAT(LastName, '@gmail.com')
WHERE Email IS NULL;

UPDATE club1
SET FirstName = NULL
WHERE LastName = 'Karkushevskiy';


SELECT * FROM club1;

DELETE FROM club1
WHERE NumberPhone IS NOT NULL;

SELECT * FROM club1;

ALTER TABLE club1 DROP COLUMN NumberPhone;

TRUNCATE TABLE club1;

DROP TABLE club1;
SHOW TABLES;

DROP DATABASE lab1;
SHOW DATABASES;
