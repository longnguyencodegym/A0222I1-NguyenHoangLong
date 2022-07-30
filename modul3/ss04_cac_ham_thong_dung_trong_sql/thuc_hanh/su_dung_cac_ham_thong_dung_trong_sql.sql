use quan_ly_sinh_vien;
SELECT address, COUNT(student_id) AS 'Số lượng học viên'
FROM student
GROUP BY address;
SELECT s.student_id,s.student_name, AVG(mark)
FROM student s join mark m on s.student_id = m.student_id
GROUP BY s.student_id, s.student_name
HAVING AVG(mark) > 15;
SELECT s.student_id,s.student_name, AVG(mark)
FROM student s join mark m on s.student_id = m.student_id
GROUP BY s.student_id, s.student_name
having avg(mark)>=all(select avg(mark) from mark group by mark.student_id)