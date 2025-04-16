-- LESSON 28 SAGAIDAK V. HOMEWORK:
--1: Створення бази:
CREATE DATABASE sales_database;

--2: Створення таблиці:
CREATE TABLE sales (
                       id SERIAL PRIMARY KEY NOT NULL,
                       product VARCHAR(128) NOT NULL,
                       price INTEGER NOT NULL,
                       quantity INT
);

--3: Вставка даних:
INSERT INTO sales (product, price, quantity)
VALUES
    ('Laptop', 1000,5),
    ('Phone', 700, 3),
    ('Tablet', 500, 2),
    ('Printer', 300, 4);

--4: Вибірка даних:
SELECT *
FROM sales;

--5: Вибірка за лімітом:
SELECT *
FROM sales
         LIMIT 2;

--6: Обчислення суми:
SELECT SUM(price) AS total_products_price
FROM sales;

--7: Групування даних:
SELECT product AS product_name,
       SUM(quantity) AS units,
       AVG(price) AS price
FROM sales
GROUP BY product_name
ORDER BY price DESC;