-- Question1 
-- products 

-- Q2
SELECT productid, productname, unitprice
FROM products;

-- Q3
SELECT productid, productname, unitprice
FROM products
ORDER BY unitprice asc;

-- Q4
SELECT ProductName 
FROM products 
WHERE unitPrice <= 7.50;

-- Q5
SELECT ProductName, UnitsInStock, UnitPrice 
FROM products
WHERE UnitsInStock >=100 
ORDER BY UnitPrice DESC; 

-- Q6
SELECT ProductName, UnitsInStock, UnitPrice 
FROM products
WHERE UnitsInStock >=100 
ORDER BY UnitPrice DESC, ProductName ASC;
 
-- Q7 
SELECT productName 
FROM products
WHERE (UnitsInStock =0 OR UnitsInStock IS NULL) AND UnitsOnOrder >0
ORDER BY ProductName;

-- Q8
-- categories 

-- Q9
SELECT *
FROM categories;
-- PART2
SELECT CategoryID
FROM categories
WHERE CategoryName = 'seafood';

-- Q10 
SELECT ProductName
FROM products
WHERE CategoryID = 8;

-- Q11
SELECT FirstName, LastName
FROM employees;

-- Q12
SELECT FirstName, LastName 
FROM employees
WHERE title LIKE '%manager%';

-- Q13
SELECT DISTINCT Title
FROM northwind.employees;

-- Q14
SELECT salary 
FROM northwind.employees
WHERE salary BETWEEN 200 AND 2500;

-- Q15
SELECT *
FROM northwind.suppliers;

-- Q16
--  FIND OUT SUPPLIER ID OF "TOKYO tRADERS":
SELECT SupplierID
FROM suppliers
WHERE companyNAme ='Tokyo Traders';
-- PART2
SELECT productid, productname
FROM products
WHERE SupplierID = 4;
