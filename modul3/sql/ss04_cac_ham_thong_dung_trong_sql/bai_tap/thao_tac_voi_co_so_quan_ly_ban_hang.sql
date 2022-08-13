use quan_ly_sinh_vien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * from `subject` s
where credit >=ALL (SELECT credit FROM `subject` );
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select * 
from `subject` s
join mark m on s.sub_id=m.sub_id
where m.mark = (select max(m.mark) from mark m);
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select s.student_id,s.student_name,avg(m.mark) as 'Diem trung binh'
from student s join mark m on s.student_id=m.student_id
group by s.student_id;