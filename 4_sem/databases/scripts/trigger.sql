delimiter //
CREATE TRIGGER update_cost_before_insert
BEFORE INSERT ON calls
FOR EACH ROW
BEGIN
	DECLARE percentage INT;
    SET percentage = (SELECT max(Discount_percentage) from discounts where Min_duration <= NEW.Duration_call and ID_city = NEW.ID_city);
    if percentage = null then
    SET percentage = 0;
    END IF;
	IF NEW.Day_or_night = 'D' THEN 
		SET NEW.Cost = NEW.Duration_call * (SELECT DayTariff FROM prices WHERE ID_city = NEW.ID_city) ;
	ELSE 
		SET NEW.Cost = NEW.Duration_call * (SELECT NightTariff FROM prices WHERE ID_city = NEW.ID_city);
	END IF;
    SET NEW.Cost = NEW.Cost - (NEW.Cost * percentage) / 100;
END; //
delimiter ;


DROP TRIGGER IF EXISTS `lab2`.`update_cost_before_insert`;