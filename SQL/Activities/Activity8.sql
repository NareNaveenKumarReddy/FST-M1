-- Activity8

-- Write an SQL statement to find the highest purchase amount ordered by the each customer with their ID and highest purchase amount
SELECT customer_id,max(purchase_amount) FROM orders GROUP BY customer_id;

-- Write an SQL statement to find the highest purchase amount on '2012-08-17' for each salesman with their ID.
SELECT salesman_id,max(purchase_amount) from orders WHERE order_date = TO_DATE('2012-08-17','YYYY-MM-DD') GROUP BY salesman_id;

-- Write an SQL statement to find the highest purchase amount with their ID and order date, for only those customers who have a higher purchase amount within the list [2030, 3450, 5760, 6000]
SELECT Customer_id,order_date,max(purchase_amount) FROM orders GROUP BY Customer_id,order_date HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);
