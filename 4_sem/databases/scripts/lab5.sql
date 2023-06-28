select * from calls;
select * from abonents;

# 1 форма case
SELECT 
    ID_call,
    ID_abonent,
    Duration_call,
    CASE
        WHEN Duration_call >= 20 THEN 'large call'
        WHEN Duration_call >= 10 THEN 'middle call'
        ELSE 'small call'
    END Rating_call,
    CASE Day_or_night
        WHEN 'D' THEN 'Day'
        ELSE 'Night'
    END Day_or_night
FROM
    calls
LIMIT 15;



# if
SELECT IF(2 < 1, 'YES', 'NO');

SELECT 
    IF(2 = 3,
        '1111',
        IF(4 = 3,
            '2222',
            IF(3 = 3, '3333', '4444')));


 # перевірка на null
SELECT 
    ID_abonent,
    IF(Name_abonent IS NULL,
        'anonim',
        Name_abonent) AS 'Name'
FROM
    abonents;

#in
SELECT 
    ID_abonent, Name_abonent, Card_number
FROM
    abonents
WHERE
    ID_abonent  IN (IF(Card_number LIKE '%17%',
        ID_abonent,
        NULL));
    
# where
SELECT 
    ID_call, Cost
FROM
    calls
WHERE
    CASE
        WHEN cost >= 10 THEN 1
        ELSE 0
    END = 1;

# ORDER BY
SELECT 
    ID_call, ID_abonent, Duration_call, Cost
FROM
    calls
ORDER BY CASE
    WHEN Duration_call >= 15 THEN 1
    ELSE 0
END , ID_call
;
   
   
# HAVING   
SELECT 
    ID_abonent,
    COUNT(*) AS 'count',
    AVG(Duration_call) AS 'average_number_of_calls',
    ROUND(SUM(Cost), 4) AS 'total_cost'
FROM
    calls
GROUP BY 1
HAVING count >= 2
    AND IF(total_cost > 20, 1, 0) = 1
ORDER BY 2 DESC;
   
   
#UPDATE
SELECT 
    *
FROM
    calls;
UPDATE calls 
SET 
    Cost = IF(Day_or_night = 'D', Cost + 1, Cost);
    
    
#DELETE
DELETE FROM calls 
WHERE
    IF(Cost < 1, 1, 0) = 1;

#COALESCE   
SELECT 
    ID_abonent, COALESCE(Name_abonent, 'anonim') AS Result
FROM
    abonents;




#UNION
SELECT 
    Name_city
FROM
    cities 
UNION SELECT 
    Name_city
FROM
    PolandCities 
UNION SELECT 
    Name_city
FROM
    franceCities
;


    

