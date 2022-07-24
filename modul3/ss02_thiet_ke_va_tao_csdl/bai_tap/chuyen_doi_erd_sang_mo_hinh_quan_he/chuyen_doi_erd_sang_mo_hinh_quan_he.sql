create database if not exists `chuyen_doi_erd_sang_mo_hinh_quan_he`;
use `chuyen_doi_erd_sang_mo_hinh_quan_he`;

create table nha_cung_cap(
ma_ncc int auto_increment primary key,
ten_ncc varchar(20),
dia_chi varchar(30)
);
create table sdt(
id int auto_increment primary key,
sdt varchar(10),
nha_cung_cap_id int,
 foreign key(nha_cung_cap_id) references nha_cung_cap(ma_ncc)
);
create table don_dat_hang(
so_dh int auto_increment primary key,
ngay_dh date,
nha_cung_cap_id int,
 foreign key(nha_cung_cap_id) references nha_cung_cap(ma_ncc)
);
create table vat_tu(
ma_vt int auto_increment primary key,
ten_vt varchar(10)
);
create table vat_tu_don_dat_hang(
vat_tu_id int,
don_dat_hang_id int,
primary key(vat_tu_id,don_dat_hang_id),
foreign key(vat_tu_id) references vat_tu(ma_vt),
foreign key(don_dat_hang_id) references don_dat_hang(so_dh)
);
create table phieu_xuat(
so_px int auto_increment primary key,
ngay_xuat date
);
create table chi_tiet_phieu_xuat(
phieu_xuat_id int,
vat_tu_id int,
don_gia_xuat float,
so_luong_xuat int,
primary key(phieu_xuat_id,vat_tu_id),
foreign key(phieu_xuat_id) references phieu_xuat(so_px),
foreign key(vat_tu_id) references vat_tu(ma_vt)
);
create table phieu_nhap(
so_pn int auto_increment primary key,
ngay_nhap date
);
create table chi_tiet_phieu_nhap(
phieu_nhap_id int,
vat_tu_id int,
don_gia_nhap float,
so_luong_nhap int,
primary key(phieu_nhap_id,vat_tu_id),
foreign key(phieu_nhap_id) references phieu_nhap(so_pn),
foreign key(vat_tu_id) references vat_tu(ma_vt)
);






