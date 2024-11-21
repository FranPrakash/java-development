-- Q1
SELECT max(SupplierID)
FROM suppliers;

-- Q2
SELECT SUM(salary)
FROM employees;

-- Q3
SELECT min(UnitPrice)
FROM products;

-- Q4
SELECT AVG(UnitPrice)
FROM products;

-- Q5
SELECT max(UnitPrice)
FROM products;

-- Q6 
SELECT SupplierID, COUNT(productID) AS number_Of_Items
FROM Products
GROUP BY SupplierID;

-- Q7
SELECT CategoryID , AVG(UnitPrice) AS average_Unit_Price 
FROM Products
GROUP BY CategoryID;

-- Q8
SELECT SupplierID, COUNT(ProductID) AS items 
FROM Products
GROUP BY SupplierID
HAVING COUNT(ProductID) >=5;

-- Q9
SELECT ProductID, ProductName, UnitsInStock * UnitPrice AS Inventory_value
FROM Products
ORDER BY Inventory_value DESC, productName;