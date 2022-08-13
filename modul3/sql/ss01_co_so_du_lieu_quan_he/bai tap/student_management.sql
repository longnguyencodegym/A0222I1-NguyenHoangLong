create database `student_management`;
use student_management;
create table class(
id int primary key,
name varchar(30)
);
create table teacher(
id int primary key,
name varchar(30),
age int,
country varchar(30)
);
