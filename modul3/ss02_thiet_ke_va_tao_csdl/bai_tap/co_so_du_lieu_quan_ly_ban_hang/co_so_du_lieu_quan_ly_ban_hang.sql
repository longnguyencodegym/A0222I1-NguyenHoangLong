create database  `co_so_du_lieu_quan_ly_ban_hang`;
use co_so_du_lieu_quan_ly_ban_hang;
create table customer(
c_id int auto_increment primary key,
c_name varchar(25),
c_age tinyint
);
create table `order`(
o_id int auto_increment primary key,
o_date date,
o_total_price float,
c_id int,
foreign key(c_id) references customer(c_id)
);
create table product(
p_id int auto_increment primary key,
p_name varchar(20),
p_price float
);
create table `order_detail`(
o_id int,
p_id int,
od_quantity int,
primary key(o_id,p_id),
foreign key(o_id) references `order`(o_id),
foreign key(p_id) references product(p_id)
);