use case_study_modul_3;
select * from nhan_vien;
-- 2.Hiển thị thông tin tất cả nhân viên tên bắt đầu là 'H', 'T','K', tối đa 15 kí tự:
select * from nhan_vien
where ho_ten regexp '^[HTK].{1,14}$';
-- 3.Hiển thị khách hàng tuổi 18-50,địa chỉ đà nẵng hoặc quảng trị.
select *,YEAR(now()) - YEAR(ngay_sinh) - ( DAYOFYEAR(now()) < DAYOFYEAR(ngay_sinh) ) as age 
from khach_hang
where dia_chi regexp 'Quảng Trị|Đà Nẵng'
having age between 18 and 50;
-- 4.Đếm khách hàng diamond đặt phòng bao nhiêu lần và sắp xếp tăng dần số lần đặt.
select k.ho_ten,l.ten_loai_khach,count(h.ma_khach_hang) as so_lan_dat
from khach_hang k join loai_khach l on k.ma_loai_khach=l.ma_loai_khach
join hop_dong h on k.ma_khach_hang=h.ma_khach_hang
where l.ten_loai_khach='diamond'
group by h.ma_khach_hang
order by so_lan_dat;
-- 5.Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
select k.ma_khach_hang, k.ho_ten, l.ten_loai_khach, h.ma_hop_dong, d.ten_dich_vu, h.ngay_lam_hop_dong, h.ngay_ket_thuc,(d.chi_phi_thue + sum(ifnull(dvdk.gia*hdct.so_luong,0))) as tong_tien 
from khach_hang k 
 left join hop_dong h on h.ma_khach_hang = k.ma_khach_hang
 left join loai_khach l on l.ma_loai_khach = k.ma_loai_khach
left join dich_vu d on d.ma_dich_vu = h.ma_dich_vu
left join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = h.ma_hop_dong
left join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
 group by h.ma_hop_dong;


-- 6.Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
select d.ma_dich_vu,d.ten_dich_vu,d.dien_tich,d.chi_phi_thue,l.ten_loai_dich_vu
from dich_vu d 
join loai_dich_vu l on d.ma_loai_dich_vu=l.ma_loai_dich_vu
join hop_dong h on d.ma_dich_vu=h.ma_dich_vu
where d.ma_dich_vu not in(
 select h.ma_dich_vu
 from hop_dong h
 where month(h.ngay_lam_hop_dong) in(1,2,3)  and year(h.ngay_lam_hop_dong) = 2021)
 group by h.ma_dich_vu;
 -- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue,
 -- ten_loai_dich_vu của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 
 -- nhưng chưa từng được khách hàng đặt phòng trong năm 2021.
 select d.ma_dich_vu,d.ten_dich_vu,d.dien_tich,d.so_nguoi_toi_da,d.chi_phi_thue,l.ten_loai_dich_vu
 from dich_vu d 
 join loai_dich_vu l on d.ma_loai_dich_vu=l.ma_loai_dich_vu
 join hop_dong h on d.ma_dich_vu=h.ma_dich_vu
 where d.ma_dich_vu not in 
 (select h.ma_dich_vu from hop_dong h 
 where year(h.ngay_lam_hop_dong)<>2020 )
 group by h.ma_dich_vu;
-- 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten trùng nhau.
SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
select * , count(*) as so_lan_lap
from khach_hang k
group by ho_ten
having so_lan_lap>1;
SELECT *
FROM khach_hang
WHERE ho_ten IN (
SELECT ho_ten
FROM khach_hang
GROUP BY ho_ten
HAVING COUNT(ho_ten) > 1);
-- Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten khong trùng nhau.

SELECT 
    *
FROM
    khach_hang
GROUP BY ho_ten
HAVING COUNT(ho_ten) >= 1;
SELECT DISTINCT
    ho_ten
FROM
    khach_hang;
    select * 
    from khach_hang
    group by ho_ten;
    -- 9.	Thực hiện thống kê doanh thu theo tháng,
    -- nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
    select*from hop_dong;
    select month(h.ngay_lam_hop_dong) as thang, count(month(h.ngay_lam_hop_dong))as luot_dat_phong
from hop_dong h
group by month(h.ngay_lam_hop_dong)
order by month(h.ngay_lam_hop_dong);
-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm.
--  Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem 
-- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).
select h.ma_hop_dong, h.ngay_lam_hop_dong, h.ngay_ket_thuc, h.tien_dat_coc, SUM(so_luong) AS so_luong_dich_vu_di_kem 
from hop_dong h
        LEFT JOIN
    hop_dong_chi_tiet hdct ON hdct.ma_hop_dong = h.ma_hop_dong
GROUP BY h.ma_hop_dong;
-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” 
-- và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
select dvdk.ma_dich_vu_di_kem ,dvdk.ten_dich_vu_di_kem
from dich_vu_di_kem dvdk join hop_dong_chi_tiet hdct on dvdk.ma_dich_vu_di_kem=hdct.ma_dich_vu_di_kem
join hop_dong h on h.ma_hop_dong=hdct.ma_hop_dong
join khach_hang k on k.ma_khach_hang=h.ma_khach_hang
join loai_khach l on l.ma_loai_khach=k.ma_loai_khach
where l.ten_loai_khach='diamond' and (k.dia_chi like '%Vinh' or k.dia_chi like '%Quảng Ngãi');
-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng),
 -- ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), 
 -- tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 
 -- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
select h.ma_hop_dong, nv.ho_ten, k.ho_ten , k.so_dien_thoai,d.ten_dich_vu,
 SUM(hdct.so_luong) AS so_luong_dich_vu_di_kem,h.tien_dat_coc
 from hop_dong h
 left join nhan_vien nv on h.ma_nhan_vien=nv.ma_nhan_vien 
 left join dich_vu d on d.ma_dich_vu=h.ma_dich_vu
 left join hop_dong_chi_tiet hdct on hdct.ma_hop_dong=h.ma_hop_dong
 left join khach_hang k on k.ma_khach_hang=h.ma_khach_hang
 where quarter(h.ngay_lam_hop_dong)=4 and year(h.ngay_lam_hop_dong)=2020 and h.ma_hop_dong not in (select h.ma_hop_dong from hop_dong h where quarter(h.ngay_lam_hop_dong) in (1,2) and year(h.ngay_lam_hop_dong)=2021)
 group by hdct.ma_hop_dong;
-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dich vụ có số lần sử dụng nhiều như nhau).

select *,sum(so_luong)as so_lan_thue_nhieu_nhat
from dich_vu_di_kem dvdk join hop_dong_chi_tiet hdct on hdct.ma_dich_vu_di_kem=dvdk.ma_dich_vu_di_kem
group by dvdk.ma_dich_vu_di_kem
 having  so_lan_thue_nhieu_nhat  = (select sum(so_luong)from hop_dong_chi_tiet
 group by ma_dich_vu_di_kem
order by ma_dich_vu_di_kem desc limit 1);


-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung 
-- (được tính dựa trên việc count các ma_dich_vu_di_kem).
select h.ma_hop_dong, ldv.ten_loai_dich_vu, dvdk.ten_dich_vu_di_kem, count(dvdk.ma_dich_vu_di_kem) as so_lan_su_dung
from hop_dong h 
join hop_dong_chi_tiet hdct on h.ma_hop_dong=hdct.ma_hop_dong
join dich_vu_di_kem dvdk on hdct.ma_dich_vu_di_kem=dvdk.ma_dich_vu_di_kem
join dich_vu d on d.ma_dich_vu=h.ma_dich_vu
join loai_dich_vu ldv on ldv.ma_loai_dich_vu=d.ma_loai_dich_vu
group by dvdk.ma_dich_vu_di_kem
having so_lan_su_dung=1
order by h.ma_hop_dong;
-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, 
-- so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
select nv.ma_nhan_vien, nv.ho_ten, t.ten_trinh_do, b.ten_bo_phan, nv.so_dien_thoai, nv.dia_chi,count(h.ma_nhan_vien) as so_lan_co_hop_dong
from nhan_vien nv 
 join trinh_do t on nv.ma_trinh_do=t.ma_trinh_do
join bo_phan b on nv.ma_bo_phan=b.ma_bo_phan
join hop_dong h on h.ma_nhan_vien=nv.ma_nhan_vien and year(h.ngay_lam_hop_dong) between 2020 and 2021
group by h.ma_nhan_vien
having so_lan_co_hop_dong<=3 ;
-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
delete from nhan_vien
where ma_nhan_vien not in 
(select distinct ma_nhan_vien from hop_dong where year(ngay_lam_hop_dong) between 2019 and 2021);
SET SQL_SAFE_UPDATES = 0;
-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
-- (d.chi_phi_thue + sum(ifnull(dvdk.gia*hdct.so_luong,0))) as tong_tien 
update khach_hang k
join hop_dong h on h.ma_khach_hang=k.ma_khach_hang
join hop_dong_chi_tiet hdct on hdct.ma_hop_dong=h.ma_hop_dong
join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem=hdct.ma_dich_vu_di_kem
join dich_vu d on d.ma_dich_vu=h.ma_dich_vu
set k.ma_loai_khach=1
where k.ma_loai_khach=2 and (d.chi_phi_thue + (dvdk.gia*hdct.so_luong))>=1000000;

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
delete from khach_hang
where ma_khach_hang in (select ma_khach_hang from hop_dong where year(ngay_lam_hop_dong)<2021);
/* trigger 
delimiter $$
create trigger delete_khach_hang
 before delete on khach_hang
for each row
begin
delete from hop_dong_chi_tiet hdct where hdct.ma_hop_dong in (select ma_hop_dong from hop_dong hd where hd.ma_khach_hang = old.ma_khach_hang);
delete from hop_dong where ma_khach_hang = old.ma_khach_hang;
end $$
delimiter ;
*/
-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
update dich_vu_di_kem dvdk
set gia=gia*2
where ma_dich_vu_di_kem=
(select ma_dich_vu_di_kem 
from hop_dong_chi_tiet hdct 
join hop_dong h on hdct.ma_hop_dong=h.ma_hop_dong
where year(h.ngay_lam_hop_dong)=2020
group by ma_dich_vu_di_kem
having sum(so_luong) > 10);

-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm id 
-- (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
select ma_nhan_vien as id,ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi from nhan_vien
union all
select ma_khach_hang as id, ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi from khach_hang;


