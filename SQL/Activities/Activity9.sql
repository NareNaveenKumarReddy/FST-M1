-- Activity9

-- Create the customers table
create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

-- Insert values into it
INSERT into customers values(3002, 'Nick Rimando', 'New York', 100, 5001);
Insert into customers values(3007, 'Brad Davis', 'New York', 200, 5001);
insert into customers values(3005, 'Graham Zusi', 'California', 200, 5002);
insert into customers values(3008, 'Julian Green', 'London', 300, 5002);
insert into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006);
insert into customers values(3009, 'Geoff Cameron', 'Berlin', 100, 5003);
insert into customers values(3003, 'Jozy Altidor', 'Moscow', 200, 5007);
insert into customers values(3001, 'Brad Guzan', 'London', 300, 5005);

-- Write an SQL statement to know which salesman are working for which customer
SELECT s.salesman_name,c.customer_name FROM salesman s
INNER JOIN customers c
ON s.salesman_id = c.salesman_id;

-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman.
SELECT c.customer_id,c.customer_name,s.salesman_name,c.grade FROM salesman s
LEFT JOIN customers c
ON s.salesman_id = c.salesman_id WHERE c.grade < 300 
ORDER BY c.customer_id;

SELECT * FROM orders;

-- Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.
SELECT s.salesman_name,c.customer_name,s.commision FROM salesman s
INNER JOIN customers c
ON s.salesman_id = c.salesman_id
WHERE s.commision > 12;

--Write an SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works for that customer and commission rate he gets for an order
SELECT o.order_no,o.order_date,o.purchase_amount,c.customer_name,s.salesman_name,s.commision FROM orders o
INNER join salesman s ON o.salesman_id = s.salesman_id
INNER join customers c ON c.salesman_id = o.salesman_id;