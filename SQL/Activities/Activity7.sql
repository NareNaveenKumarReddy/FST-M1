-- Activity7

-- Write an SQL statement to find the total purchase amount of all orders.
SELECT SUM(purchase_amount) FROM orders;

-- Write an SQL statement to find the average purchase amount of all orders.
SELECT AVG(purchase_amount) FROM orders;

-- Write an SQL statement to get the maximum purchase amount of all the orders.
SELECT MAX(purchase_amount) FROM orders;

-- Write an SQL statement to get the mininum purchase amount of all the orders.
SELECT MIN(purchase_amount) FROM orders;

-- Write an SQL statement to find the number of salesmen listed in the table.
SELECT COUNT(DISTINCT salesman_id) FROM orders;

SELECT * FROM orders;