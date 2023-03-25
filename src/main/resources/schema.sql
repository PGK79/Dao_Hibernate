CREATE SCHEMA IF NOT EXISTS task_repository;

CREATE TABLE IF NOT EXISTS task_repository.person
(
    name           varchar(15) not null,
    surname        varchar(25) not null,
    age            int         not null,
    phone_number   varchar(20) not null,
    city_of_living varchar(15) not null,
    CONSTRAINT person_pkey PRIMARY KEY (name, surname, age)
);
