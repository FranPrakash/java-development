-- Q1
SELECT ProductName, UnitPrice
FROM products
WHERE UnitPrice = (SELECT MAX(UnitPrice)
From products);

-- Q2
SELECT OrderID, ShipName, ShipAddress
FROM orders
WHERE ShipVia = (SELECT ShipperID
FROM shippers 
WHERE CompanyName = 'Federal Shipping');

-- Q3
SELECT OrderID
FROM `order details`
WHERE ProductID = ( SELECT ProductID
FROM products 
WHERE ProductName = 'Sasquatch Ale');

-- Q4
SELECT lastName, FirstName
FROM employees
WHERE EmployeeID = (SELECT EmployeeID
FROM orders 
WHERE orderID = 10266);


-- Q5
SELECT CompanyName
FROM customers 
WHERE CustomerID = (SELECT CustomerID
FROM orders
WHERE orderID = 10266);
