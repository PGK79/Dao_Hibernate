-- liquibase formatted mysql

-- changeset pgk:1
CREATE TABLE tables_for_task_three.migration_table_hibernate
(
    id      int         not null auto_increment primary key,
    name    varchar(20) not null,
    surname varchar(30) not null
);
-- rollback DROP TABLE tables_for_task_three.migration_table_hibernate;
