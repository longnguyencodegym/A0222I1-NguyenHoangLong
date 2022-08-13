use case_study_modul_3;
/* 21. Tạo khung nhìn có tên là v_nhan_vien để lấy được thông tin của tất cả
các nhân viên có địa chỉ là “Hải Châu” và đã từng lập hợp đồng cho một
hoặc nhiều khách hàng bất kì với ngày lập hợp đồng là “12/12/2019”.*/
create view v_nhan_vien as
select nv.ho_ten as ten,nv.dia_chi as dia_chi,nv.so_dien_thoai as so_dien_thoai
from nhan_vien nv
join hop_dong h on h.ma_nhan_vien=nv.ma_nhan_vien
where nv.dia_chi like '%Hải Châu%' and h.ngay_lam_hop_dong = 12/12/2019;
/*22. Thông qua khung nhìn v_nhan_vien thực hiện cập nhật địa chỉ thành “Liên Chiểu” đối với tất cả các nhân viên
 được nhìn thấy bởi khung nhìn này.*/
 update v_nhan_vien
 set dia_chi ='Lien Chieu';
 /*23.	Tạo Stored Procedure sp_xoa_khach_hang dùng để xóa thông tin của một khách hàng nào đó với ma_khach_hang
 được truyền vào như là 1 tham số của sp_xoa_khach_hang.*/
 delimiter $$
 create procedure sp_xoa_khach_hang(ma_khach_hang int)
 begin
 delete from khach_hang
 where khach_hang.ma_khach_hang=ma_khach_hang;
 end $$
 delimiter ;
 select * from khach_hang;
 call sp_xoa_khach_hang(2);
 /* 24.	Tạo Stored Procedure sp_them_moi_hop_dong dùng để thêm mới vào bảng hop_dong với yêu cầu 
 sp_them_moi_hop_dong phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung, 
 với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.*/
 
 
 
 
 