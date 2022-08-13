create database view_index_procedure;
use view_index_procedure;
create table products(
id int primary key auto_increment,
product_code int,
product_name varchar(30),
product_price double,
product_amount int,
product_description varchar(30),
product_status varchar(30)
);
insert into products (id,product_code,product_name,product_price,product_amount,product_description,product_status)
values (1,1,'iphone',10,100,'for sale','used'),
(2,2,'samsung',20,200,'for sale','new'),
(3,3,'xiaomi',30,300,'for sale','new'),
(4,4,'bphone',40,400,'for sale','used');
-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
CREATE UNIQUE INDEX i_product_code ON products(product_code);

-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
CREATE UNIQUE INDEX i_product_name_price ON products(product_name,product_price);
-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
explain select* from products p
where p.product_code=3;
-- So sánh câu truy vấn trước và sau khi tạo index
drop index i_product_code on products;
-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
create view my_view as 
select product_code ,product_name,product_price, product_status
from products;
select* from my_view;
-- Tiến hành sửa đổi view
update my_view
set product_name='lenovo'
where product_price=40;
delete from my_view
where product_code=2;
-- Tiến hành xoá view
drop view my_view;
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure sp_find_all()
begin
select*from products;
end //
delimiter ;
call sp_find_all();
-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure sp_add(in id int,in product_code int,in product_name varchar(30),in product_price double,in product_amount int,in product_description varchar(30),in product_status varchar(30))
begin
insert into products values(id,product_code,product_name,product_price,product_amount,product_description,product_status);
end //
delimiter ;
call sp_add(5,5,'long',5000,500,'for rent','new');
-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure sp_edit(in edit_id int)
begin
update products
set product_code=10,product_name='one plus',product_price=1000,product_amount=10,product_description='for free',product_status='used'
where id=edit_id;
end //
delimiter ;
call sp_edit(5);
-- Tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure sp_remove(in remove_id int)
begin
delete from  products
where id=remove_id;
end //
delimiter ;
call sp_remove(5);

