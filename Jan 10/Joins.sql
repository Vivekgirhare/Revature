create table customers(
customer_id int primary key,
customer_name varchar(50)
);

create table orders(
order_id int primary key,
customer_id int,
order_date date);

insert into customers values
(1,'Ajith'),(2,'Sujata'),(3,'Poonam'),(4,'Rahu');

insert into orders values
(1001,1,'2025-09-09'),(1002,2,'2025-12-16'),
(1003,3,'2025-11-16'),(1004,4,'2026-01-01');


select customers.customer_name, orders.order_id 
from customers
inner join orders on customers.customer_id = orders.customer_id;

select customers.customer_name, orders.order_id 
from customers
left join orders on customers.customer_id = orders.customer_id;

select customers.customer_name, orders.order_id 
from customers
right join orders on customers.customer_id = orders.customer_id;


