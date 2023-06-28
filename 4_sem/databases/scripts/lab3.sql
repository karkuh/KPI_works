select * from abonents;
select * from cities;
select * from prices;
select * from discounts;
select * from calls;

select * from abonents
where number_phone like '%0';

# 1.1
select ID_call, Duration_call from calls;

select * from calls;

# 1.2
select * from discounts where Min_duration >= 10 and Discount_percentage = 10;

# 1.2
SELECT 
    *
FROM
    prices
WHERE
    DayTariff >= 0.5 OR NightTariff >= 0.3
    and ID_city not in (select ID_city FROM cities where Name_city like 'K%');

# 1.2-1.3
select * from cities where not Name_city in('Kharkiv', 'Zaporizhzhia');

# 1.3
select ID_city, Daytariff  from prices where Daytariff between 0.4 and 0.5;

# 1.3
select *  from cities where Name_city like 'K%';

select * from abonents where Name_abonent is null;

# 2.1
select ID_price, ID_city, DayTariff  from prices
order by 3 desc;

# 2.2
select ID_price, ID_city, NightTariff from prices
order by 3 ;

# використання inner join
select Name_city, DayTariff, NightTariff from cities
inner join prices
on cities.ID_city = prices.ID_city;

# використання LEFT OUTER JOIN
INSERT  cities (Name_city) VALUES 
('Kovel');

select Name_city, DayTariff, NightTariff from cities
left join prices
on cities.ID_city = prices.ID_city;

select Name_city, DayTariff, NightTariff from prices
right join cities 
on cities.ID_city = prices.ID_city;



create table polandCities (
ID_city INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
Name_city VARCHAR(50) NOT NULL
);


INSERT  polandCities (Name_city) VALUES 
('Warsaw'),
('Krakow'),
('Gdansk'),
('Poznan'),
('Wroclaw');

create table franceCities (
ID_city INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
Name_city VARCHAR(50) NOT NULL
);


INSERT  franceCities (Name_city) VALUES 
('Paris'),
('Marseille'),
('Lyon'),
('Toulouse'),
('Nice');


select * from polandCities;

# використання cross join
select cities.Name_city, polandCities.Name_city
from cities
cross join polandCities;

# використання union
select Name_city
from cities
union
select Name_city
from PolandCities;


# використання distinct
select distinct Date_call from calls ;


# використання limit
select Date_call, round(avg(Duration_call),2) as 'average call' from calls
group by 1 
order by 2 desc
limit 3;
