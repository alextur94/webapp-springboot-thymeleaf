CREATE DATABASE testdb2
    WITH
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

CREATE TABLE employees (
   id SERIAL CONSTRAINT employees_pk PRIMARY KEY,
   name        VARCHAR(100),
   email       VARCHAR(100),
   department  VARCHAR(100)
);

INSERT INTO employees VALUES (1, 'Aleksey', 'aleksey@gmail.com', 'IT');
INSERT INTO employees VALUES (2, 'Oleg', 'oleg@gmail.com', 'HR');
INSERT INTO employees VALUES (3, 'Maksim', 'maksim@gmail.com', 'Sales');
INSERT INTO employees VALUES (4, 'Andrey', 'andrey@gmail.com', 'IT');
INSERT INTO employees VALUES (5, 'Dima', 'dima@gmail.com', 'Sales');
INSERT INTO employees VALUES (6, 'Aleksey', 'aleksey@mail.ru', 'IT');
INSERT INTO employees VALUES (7, 'Oleg', 'olge@mail.ru', 'HR');
INSERT INTO employees VALUES (8, 'Maksim', 'maksim@mail.ru', 'Sales');
INSERT INTO employees VALUES (9, 'Andrey', 'anderey@mail.ru', 'IT');
INSERT INTO employees VALUES (10, 'Dima', 'dima@mail.ru', 'IT');
INSERT INTO employees VALUES (11, 'Aleksey', 'aleksey@ya.by', 'HR');
INSERT INTO employees VALUES (12, 'Oleg', 'oleg@ya.by', 'IT');
INSERT INTO employees VALUES (13, 'Maksim', 'maksim@ya.by', 'IT');
INSERT INTO employees VALUES (14, 'Andrey', 'andrey@ya.by', 'Sales');
INSERT INTO employees VALUES (15, 'Dima', 'dima@ya.by', 'HR');