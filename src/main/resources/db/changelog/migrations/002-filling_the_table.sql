-- liquibase formatted mysql

-- changeset pgk:1
INSERT INTO tables_for_task_three.migration_table_hibernate(name, surname, age, phone_number)
VALUES ('Alexey', 'Muller', '19', '397-222-456-444');
-- rollback;

-- changeset pgk:2
INSERT INTO tables_for_task_three.migration_table_hibernate(name, surname, age, phone_number)
VALUES ('Ivan', 'Ivanov', '18', '111-222-333-444');
-- rollback;

-- changeset pgk:3
INSERT INTO tables_for_task_three.migration_table_hibernate(name, surname, age, phone_number)
VALUES ('Alexey', 'Vladimirov', '28', '134-233-544-455');
-- rollback;

-- changeset pgk:4
INSERT INTO tables_for_task_three.migration_table_hibernate(name, surname, age, phone_number)
VALUES ('Petr', 'Petrov', '19', '222-333-444-555');
-- rollback;

-- changeset pgk:5
INSERT INTO tables_for_task_three.migration_table_hibernate(name, surname, age, phone_number)
VALUES ('Sidor', 'Sidorov', '20', '333-444-555-666');
-- rollback;

-- changeset pgk:6
INSERT INTO tables_for_task_three.migration_table_hibernate(name, surname, age, phone_number)
VALUES ('Vasilii', 'Vasiliev', '21', '444-555-666-777');
-- rollback;

-- changeset pgk:7
INSERT INTO tables_for_task_three.migration_table_hibernate(name, surname, age, phone_number)
VALUES ('Olga', 'Ivanova', '22', '555-666-777-888');
-- rollback;

-- changeset pgk:8
INSERT INTO tables_for_task_three.migration_table_hibernate(name, surname, age, phone_number)
VALUES ('Irina', 'Petrova', '50', '666-777-888-999');
-- rollback;

-- changeset pgk:9
INSERT INTO tables_for_task_three.migration_table_hibernate(name, surname, age, phone_number)
VALUES ('alexey', 'Sidorov', '20', '343-464-575-646');
-- rollback;

-- changeset pgk:10
INSERT INTO tables_for_task_three.migration_table_hibernate(name, surname, age, phone_number)
VALUES ('Ivan', 'Petrov', '40', '777-888-999-000');
-- rollback;