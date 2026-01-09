create table mytable(id int primary key not null,name varchar(50),
course varchar(20),price double);
select * from mytable;
create table coursechange_log(
id int, old_course varchar(20),new_course varchar(20),
change_date datetime
);
select * from coursechange_log;
insert into mytable values(13,'Jay','Python',4000.50);


DELIMITER //
CREATE TRIGGER mytable_trg
AFTER UPDATE ON mytable
FOR EACH ROW
BEGIN
    INSERT INTO coursechange_log (
        id, old_course, new_course, price_change, change_date
    )
    VALUES (
        OLD.id,
        OLD.course,
        NEW.course,
        NEW.price,
        NOW()
    );
END;
//
DELIMITER ;