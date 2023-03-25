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

INSERT INTO task_repository.person(name, surname, age, phone_number, city_of_living)
VALUES ('Ivan', 'Ivanov', '18', '111-222-333-444', 'MOSCOW');

INSERT INTO task_repository.person(name, surname, age, phone_number, city_of_living)
VALUES ('Petr', 'Petrov', '19', '222-333-444-555', 'BERLIN');

INSERT INTO task_repository.person(name, surname, age, phone_number, city_of_living)
VALUES ('Sidor', 'Sidorov', '20', '333-444-555-666', 'MOSCOW');

INSERT INTO task_repository.person(name, surname, age, phone_number, city_of_living)
VALUES ('Vasilii', 'Vasiliev', '21', '444-555-666-777', 'KIROV');

INSERT INTO task_repository.person(name, surname, age, phone_number, city_of_living)
VALUES ('Olga', 'Ivanova', '22', '555-666-777-888', 'Mexico');

INSERT INTO task_repository.person(name, surname, age, phone_number, city_of_living)
VALUES ('Irina', 'Petrova', '50', '666-777-888-999', 'MOSCOW');

INSERT INTO task_repository.person(name, surname, age, phone_number, city_of_living)
VALUES ('Ivan', 'Petrov', '40', '777-888-999-000', 'SPB');

INSERT INTO task_repository.person(name, surname, age, phone_number, city_of_living)
VALUES ('Vladimir', 'Vladimirov', '28', '122-233-344-455', 'MOSCOW');

INSERT INTO task_repository.person(name, surname, age, phone_number, city_of_living)
VALUES ('Gans', 'Muller', '39', '123-222-456-444', 'BERLIN');

INSERT INTO task_repository.person(name, surname, age, phone_number, city_of_living)
VALUES ('Olga', 'Sidorova', '30', '567-678-333-444', 'MOSCOW');

INSERT INTO task_repository.person(name, surname, age, phone_number, city_of_living)
VALUES ('Vasilisa', 'Wise', '21', '945-575-366-727', 'KIROV');

CREATE TABLE task_repository.users
(
    username varchar(15),
    password varchar(100),
    enabled  tinyint(1),
    PRIMARY KEY (username)
);

CREATE TABLE task_repository.authorities
(
    username  varchar(15),
    authority varchar(25),
    FOREIGN KEY (username) references users (username)
);

INSERT INTO task_repository.users (username, password, enabled)
VALUES ('Ivan', '{noop}ivan', 1),
       ('petr', '{noop}petr', 1),
       ('sidor', '{noop}sidor', 1),
       ('olga', '{noop}olga', 1),
       ('john', '{noop}olga', 0),
       ('irina', '{noop}irina', 1);

INSERT INTO task_repository.authorities (username, authority)
VALUES ('Ivan', 'ROLE_READ'),
       ('petr', 'ROLE_WRITE'),
       ('sidor', 'ROLE_READ'),
       ('olga', 'ROLE_DELETE'),
       ('john', 'ROLE_DELETE'),
       ('irina', 'ROLE_WRITE'),
       ('irina', 'ROLE_DELETE'),
       ('irina', 'ROLE_READ');