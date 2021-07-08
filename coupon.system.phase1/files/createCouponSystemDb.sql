create schema coupon_sys_db;

create table `company`(
`id` int primary key auto_increment,
`name` varchar(30),
`email` varchar(30),
`password` varchar(30)
);
create table `customer`(
`id` int primary key auto_increment,
`first_name` varchar(30),
`last_name` varchar(30),
`email` varchar(30),
`password` varchar(30)
);

create table `category`(
`id` int primary key,
`name` varchar(30)
);

insert into `category` values(0, 'FOOD');
insert into `category` values(1, 'ELECTRICITY');
insert into `category` values(2, 'RESTURANTS');
insert into `category` values(3, 'CAMPING');
insert into `category` values(4, 'TRAVEL');
insert into `category` values(5, 'CLOTHING');
select * from `category`;

create table `coupon`(
`id` int primary key auto_increment,
`company_id` int,
`category_id` int,
`title` varchar(50),
`description` varchar(255),
`start_date` date,
`end_date` date,
`amount` int,
`price` double,
`image` varchar(255),
foreign key(`company_id`) references company(`id`),
foreign key(`category_id`) references category(`id`)
);

create table `customer_vs_coupon`(
`customer_id` int,
`coupon_id` int,
primary key(`customer_id`, `coupon_id`),
foreign key(`customer_id`) references `customer`(`id`),
foreign key(`coupon_id`) references `coupon`(`id`)
);


