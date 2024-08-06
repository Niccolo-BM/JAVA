create database RiwiAcademyDB;
use RiwiAcademyDB;

select * from courses;
select * from students;
select * from inscriptions;
select * from qualifications;


/*Tabla de estudiantes en DB*/
create table students(
	id int primary key auto_increment,
    name varchar(25) not null,
    email varchar(50) unique not null,
    check (email Like '%_@_%._%'),
	activo boolean default true
);

/*Tabla de curso en DB*/
create table courses (
	id int primary key auto_increment,
    name varchar(255) not null,
	description text
);

/*Tabla de inscripciones en DB*/
create table inscriptions (
	id int primary key auto_increment,
    studentsId int,
	foreign key (studentsId) references students(id)on delete cascade,
    coursesId int,
    foreign key(coursesId) references courses(id) on delete cascade,
    unique (studentsId, coursesId)
);

/*Tabla de califiaciones en DB*/
create table qualifications (
	id int primary key auto_increment,
    inscriptionsId int,
    foreign key(inscriptionsId) references inscriptions(id) on delete cascade,
    note int check(note >= 0 and note <= 100),
    description text
);