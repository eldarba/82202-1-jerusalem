-- practice
-- create tables with relation

create table customers(
customerId int,
customerName varchar(45),
primary key(customerId)
);

create table orders(
orderId int,
customerId int,
orderPrice float,
primary key(orderId),
foreign key (customerId) references customers(customerId)
);

insert into customers values(101, 'Dan');
insert into customers values(102, 'Ben');


insert into orders values(1, 101, 30);
insert into orders values(2, 101, 70);
insert into orders values(3, null, 40);
insert into orders values(4, 102, 100);
insert into orders values(5, null, 250);

select * from customers;
select * from orders;

select o.orderId, o.orderPrice, c.customerName 
from orders as o 
join customers as c 
on o.customerId=c.customerId;

-- left outer join
select * 
from orders as o left outer join customers as c 
on o.customerId=c.customerId;

-- show all orders
select o.orderId, o.orderPrice, c.customerName 
from orders as o left outer join customers as c 
on o.customerId=c.customerId;

-- show all orders < 50
select o.orderId, o.orderPrice, c.customerName 
from orders as o left outer join customers as c 
on o.customerId=c.customerId
where o.orderPrice < 50;

-- the books table - auto increment PK
create table book(
isbn int primary key auto_increment, 
title varchar(20) unique, 
author varchar(20) not null,
price float check(price > 0),
published date);

insert into book values(0, 'Java', 'Eldar', 30, '1990-01-25') ;
insert into book values(null, 'SQL', 'Avi', 45, '2000-03-25') ;
insert into book values(0, 'XML', 'Yosi', 150, '2020-05-15') ;
insert into book values(0, 'AAA', 'Yosi', -150, '2020-05-15') ;

select * from book;




