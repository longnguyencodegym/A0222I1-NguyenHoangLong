use co_so_du_lieu_quan_ly_ban_hang;
insert into customer(c_id,c_name,c_age)
values (1,'Minh Quan',10),
(2,'Ngoc Oanh',20),
(3,'Hong Ha',50);
insert into `order`(o_id,c_id,o_date)
values (1,1,'2006-3-21'),
(2,2,'2006-3-23'),
(3,1,'2006-3-16');
insert into product(p_id,p_name,p_price)
values (1,'May Giat',3),
(2,'Tu Lanh',5),
(3,'Dieu Hoa',7),
(4,'Quat',1),
(5,'Bep Dien',2);
insert into order_detail(o_id,p_id,od_quantity)
values(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select *
from `order`;
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c.c_name,p.p_name
from customer c join `order` o on c.c_id=o.c_id
join order_detail d on o.o_id=d.o_id
join product p on d.p_id=p.p_id;
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select c.c_name
from customer c left join `order` o on c.c_id=o.c_id
where o.o_id is null;

select * from customer where c_id not in (select c_id from `order`);
select * from customer where not exists (select 1 from `order` o where customer.c_id = o.c_id);
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select o.o_id,o.o_date,od_quantity*p_price as 'gia ban tung loai'
from `order` o join order_detail od on o.o_id=od.o_id
join product p on od.p_id=p.p_id;
