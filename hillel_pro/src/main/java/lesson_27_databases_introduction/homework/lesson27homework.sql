--SAGAIDAK VASYL LESSON 27 HOMEWORK

-- code for database creation:
CREATE DATABASE my_database;

-- code for creating table with requested fields:
CREATE TABLE users (
                       pk_id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                       user_name VARCHAR(64) NOT NULL,
                       user_age INT NOT NULL,
                       user_email VARCHAR(256)
);

-- code for inserting necessary values:
INSERT INTO users (user_name, user_age, user_email)
VALUES
    ('John', 30, 'john@example.com'),
    ('Alice', 25, 'alice@example.com'),
    ('Bob', 35, 'bob@example.com');

-- code for requesting all table data:
SELECT *
FROM users;

-- code to delete user with name 'Bob'
DELETE FROM users
WHERE user_name = 'Bob';