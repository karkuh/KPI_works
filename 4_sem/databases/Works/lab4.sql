select * from abonents;
select * from cities;
select * from prices;
select * from discounts;
select * from calls;

#без використання group by
SELECT 
    COUNT(*) AS 'count',
    AVG(Duration_call) AS 'average number of calls',
    MIN(Duration_call) AS 'smallest call',
    MAX(Duration_call) AS 'biggest call',
    ROUND(SUM(Cost), 4) AS'total cost'
FROM
    calls;

#з використання group by
SELECT 
    ID_abonent,
    COUNT(*) AS 'count',
    AVG(Duration_call) AS 'average number of calls',
    MIN(Duration_call) AS 'smallest call',
    MAX(Duration_call) AS 'biggest call',
    ROUND(SUM(Cost), 4) AS 'total cost'
FROM
    calls
GROUP BY ID_abonent;

#без використання агрегатних функцій 
SELECT 
*
FROM
    calls
GROUP BY ID_abonent;

#з використання агрегатних функцій 
SELECT 
ID_abonent,
ROUND(SUM(Cost), 4) AS'total cost'
FROM
    calls
GROUP BY ID_abonent;


#з використання having
SELECT 
    ID_abonent,
    COUNT(*) AS 'count',
    AVG(Duration_call) AS 'average number of calls',
    MIN(Duration_call) AS 'smallest call',
    MAX(Duration_call) AS 'biggest call',
    ROUND(SUM(Cost), 4) AS 'total cost'
FROM
    calls
GROUP BY 1
HAVING count >= 3
ORDER BY 2 DESC
;

#з використання where
SELECT 
    ID_abonent,
    COUNT(*) AS 'count',
    AVG(Duration_call) AS 'average number of calls',
    MIN(Duration_call) AS 'smallest call',
    MAX(Duration_call) AS 'biggest call',
    ROUND(SUM(Cost), 4) AS 'total cost'
FROM
    calls
WHERE
    Duration_call BETWEEN 5 AND 25
GROUP BY ID_abonent;

#з використання where та having
SELECT 
    ID_abonent,
    COUNT(*) AS 'count',
    AVG(Duration_call) AS 'average number of calls',
    MIN(Duration_call) AS 'smallest call',
    MAX(Duration_call) AS 'biggest call',
    ROUND(SUM(Cost), 4) AS 'total cost'
FROM
    calls
WHERE
    Duration_call BETWEEN 5 AND 25
GROUP BY ID_abonent
HAVING count >= 3
ORDER BY 2 DESC
;

create table pryklad(
NameUser VARCHAR(20),
PointUser INT
);

INSERT  pryklad (NameUser,PointUser) VALUES 
('Vlad',18),
('Stepan',50),
('Bogdan',61),
('Vlad',55),
('Stepan',75),
('Vlad',3),
('Stepan',45);

select  NameUser from pryklad
order by NameUser
;

select * from pryklad;

select  NameUser, count(*) from pryklad
group by 1
;


