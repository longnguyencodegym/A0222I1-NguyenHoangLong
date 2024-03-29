use quan_ly_sinh_vien;
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select *
from student s
where s.student_name like 'h%';
-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select *
from class c
where  month(c.start_date)=12;
-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select*
from subject
where credit between 3 and 5;
-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
update student
set class_id=2 where student_name='hung';
-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select student_name, sub_name,mark
from mark m
join `subject` sub on m.sub_id=sub.sub_id
join student s on m.student_id=s.student_id
order by mark desc,s.student_name;
