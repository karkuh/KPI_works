select * from cities;
select * from polandCities;
select * from franceCities;


#Об'єдання
SELECT 
    Name_city
FROM
    cities
    where Name_city like 'D%'
UNION SELECT 
    Name_city
FROM
    PolandCities 
    where Name_city like '%W'
UNION SELECT 
    Name_city
FROM
    franceCities
    where Name_city like '_a%'
;

#перетин 1 
SELECT 
    Name_city
FROM
    cities 
intersect
SELECT
	 Name_city 
FROM 
	PolandCities;
   
   #перетин 2
SELECT 
    Name_city
FROM
    cities
WHERE
    Name_city IN (SELECT 
            Name_city
        FROM
            PolandCities);


#різниця 1
SELECT 
    Name_city
FROM
    cities
 EXCEPT
 SELECT 
    Name_city
 FROM
    PolandCities;
    
#різниця 2
SELECT 
    Name_city
FROM
    cities
WHERE
    Name_city NOT IN (SELECT 
            Name_city
        FROM
            PolandCities);


SELECT 
    cities.Name_city AS 'Ukraine',
    polandCities.Name_city AS 'Poland',
    francecities.Name_city AS 'France'
FROM
    cities
        CROSS JOIN
    polandCities
        CROSS JOIN
    franceCities
WHERE
    cities.Name_city IN ('Kyiv' , 'Kharkiv', 'Mykolaiv')
        AND polandCities.Name_city NOT IN ('Kyiv' , 'Lviv')
        AND CHAR_LENGTH(franceCities.Name_city) >= 5
LIMIT 10;


#СЕЛЕКЦІЯ АБО ВИБІРКА    
SELECT 
    *
FROM
    prices
WHERE
    ID_city NOT IN (SELECT 
            ID_city
        FROM
            cities
        WHERE
            Name_city LIKE 'K%')
        AND (DayTariff >= 0.5 OR NightTariff >= 0.3);
    
    
#ПРОЕКЦІЯ
SELECT 
    ID_call, Duration_call
FROM
    calls
    limit 5;
    
    #СПОЛУЧЕННЯ
SELECT 
    Name_city, DayTariff, NightTariff
FROM
    cities
        LEFT JOIN
    prices ON cities.ID_city = prices.ID_city
WHERE
    DayTariff <= 0.5;

#РОЗШИРЕННЯ
SELECT 
    calls.ID_call,
    CONCAT(RIGHT(abonents.Card_number, 4),
            '-',
            LEFT(abonents.Card_number, 4)) AS 'Card',
    calls.Duration_call,
    IF(calls.Duration_call > 15,
        'LONG',
        'SHORT') AS 'Сall_evaluation '
FROM
    calls
        JOIN
    abonents ON calls.ID_abonent = abonents.ID_abonent
ORDER BY 3;


#Обчислення і підведення підсумків в запитах
SELECT 
    Date_call,
    COUNT(*) AS 'Count',
    ROUND(AVG(Duration_call), 2) AS 'Average_call',
    ROUND(SUM(Cost), 2) AS 'Sum_cost'
FROM
    calls
GROUP BY 1
ORDER BY 4 DESC
LIMIT 3;

















#ДІЛЕННЯ
create  table Temp (
ID_city INT NOT NULL,
Date_call date NOT NULL default(curdate())
);

INSERT  Temp (ID_city,Date_call) VALUES 
(4,'2023-03-24')
;

truncate table Temp;

SELECT * FROM calls 
WHERE  NOT EXISTS (
SELECT * FROM Temp 
where calls.ID_city = Temp.ID_city);
