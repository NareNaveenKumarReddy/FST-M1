-- Activity 11
-- Write a query that produces the name and number of each salesman and each customer with more than one current order. Put the results in alphabetical order
SELECT customer_id, customer_name FROM customers c
WHERE 1<(SELECT COUNT(*) FROM orders o WHERE c.customer_id = o.customer_id)
UNION
SELECT salesman_id, salesman_name FROM salesman s
WHERE 1<(SELECT COUNT(*) FROM orders o WHERE s.salesman_id = o.salesman_id)
ORDER BY customer_name;

-- Write a query to make a report of which salesman produce the largest and smallest orders on each date.Also add a column that shows "highest on" and "lowest on" values.
SELECT s.salesman_id, s.salesman_name, o.order_no, 'highest on', o.order_date FROM salesman s, orders o
WHERE s.salesman_id=o.salesman_id
AND o.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE o.order_date = c.order_date)
UNION
SELECT s.salesman_id, s.salesman_name, order_no, 'lowest on', order_date FROM salesman s, orders o
WHERE s.salesman_id=o.salesman_id
AND o.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = o.order_date);
