
create database lab2;
use lab2;

create table abonents(
ID_abonent INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
Name_abonent VARCHAR(50) NULL,
Number_phone VARCHAR(13) NOT NULL UNIQUE,
IIN VARCHAR(10) NOT NULL UNIQUE,
Card_number VARCHAR(16) NOT NULL UNIQUE,
CHECK(LENGTH(IIN) = 10 and LENGTH(Card_number) = 16 and LENGTH(Number_phone) = 10)
);



create table cities(
ID_city INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
Name_city VARCHAR(50) NOT NULL
);

create table prices(
ID_price INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
ID_city INT NOT NULL UNIQUE,
DayTariff DOUBLE NOT NULL,
NightTariff DOUBLE NOT NULL,
FOREIGN KEY (ID_city)
REFERENCES cities (ID_city)
ON DELETE CASCADE
);

create table discounts(
ID_discount INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
ID_city INT NOT NULL ,
Min_duration int NOT NULL default(5),
Discount_percentage int NOT NULL check(Discount_percentage <100) default(5),
FOREIGN KEY (ID_city)
REFERENCES cities (ID_city)
ON DELETE CASCADE
);

create table calls(
ID_call INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
ID_abonent INT NOT NULL,
ID_city INT NOT NULL,
Date_call date NOT NULL default(curdate()),
Duration_call int NOT NULL check(Duration_call > 0),
Day_or_night VARCHAR(1) NOT NULL check( Day_or_night in ("D","N")),
FOREIGN KEY (ID_abonent) 
REFERENCES abonents (ID_abonent) 
ON DELETE CASCADE,
FOREIGN KEY (ID_city)
REFERENCES cities (ID_city)
ON DELETE CASCADE
);

alter table calls add column Cost float NULL;



INSERT  abonents (Name_abonent,Number_phone,IIN,Card_number) VALUES 
(null,'0978932990','2481596325','7032820279840581'),
('Vasia','0978932991','6548239751','9025061253469202'),
(null,'0978932992','9871234560','1217247174082274'),
('Petia','0978932993','3458917620','8057026431903736'),
(null,'0978932994','4350218974','4829013672587401'),
('Kolya','0978932995','7905120863','7390156284961053'),
(null,'0978932996','6813950247','9146275038296714'),
('Oleg','0978932997','2097846153','5823094167904351'),
(null,'0978932998','3569870124','3718562904682309'),
('Roma','0978932999','7123450896','5429423958334917');



INSERT  cities (Name_city) VALUES 
('Kyiv'),
('Lviv'),
('Odessa'),
('Kharkiv'),
('Dnipro'),
('Donetsk'),
('Zaporizhzhia'),
('Mykolaiv'),
('Vinnytsia'),
('Kherson');




INSERT  prices (ID_city,DayTariff,NightTariff) VALUES 
(1,0.5,0.3),
(2,0.6,0.4),
(3,0.4,0.25),
(4,0.35,0.2),
(5,0.55,0.35),
(6,0.4,0.3),
(7,0.5,0.2),
(8,0.45,0.3),
(9,0.35,0.2),
(10,0.9,0.7);



INSERT  discounts (ID_city,Min_duration,Discount_percentage) VALUES 
(1,10,10),
(1,30,15),
(2,default,default),
(2,15,10),
(3,default,7),
(4,8,default),
(5,default,9),
(6,4,default),
(7,7,default),
(8,default,8),
(9,default,8),
(10,default,10);


INSERT  calls (ID_abonent,ID_city,Duration_call,Day_or_night) VALUES 
(1,3,15,'D'),
(2,5,15,'N'),
(1,7,25,'D'),
(5,8,7,'N'),
(5,2,3,'D'),
(3,1,8,'N'),
(2,4,12,'D'),
(4,10,45,'N'),
(2,2,32,'D'),
(1,6,4,'N'),
(7,4,18,'D'),
(9,3,3,'N'),
(6,2,23,'D'),
(9,5,5,'N'),
(6,6,14,'D'),
(10,7,7,'N'),
(5,2,42,'D'),
(8,2,32,'N'),
(10,4,10,'N');

INSERT  calls (ID_abonent,ID_city,Date_call,Duration_call,Day_or_night) VALUES 
(3,5,'2023-03-11',15,'N'),
(4,2,'2023-03-10',18,'D'),
(3,5,'2023-03-09',5,'N'),
(5,5,'2023-03-13',15,'D'),
(8,5,'2023-03-14',15,'N'),
(1,5,'2023-03-15',15,'D');

INSERT  calls (ID_abonent,ID_city,Date_call,Duration_call,Day_or_night) VALUES 
(3,5,'2023-03-11',15,'N');




