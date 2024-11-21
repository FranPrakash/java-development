-- Module  3 
-- Excericse 3
/* 1. List the product id, product name, unit price and category name of all products. 
Order by category name and within that, by product name. */

SELECT P.ProductID, P.ProductName, P.UnitPrice, C.CategoryName
FROM products P -- table 1
INNER JOIN  categories C -- table 2
ON P.CategoryID = C.CategoryID -- join criteria 
ORDER BY CategoryName, ProductName;

/* 2. List the product id, product name, unit price and supplier name of all products that cost more than $75. 
Order by product name. */

SELECT P.ProductID, P.ProductName, P.UnitPrice, S.CompanyName  AS SupplierName
FROM products P 
INNER JOIN suppliers S
ON P.SupplierID = S.SupplierID	
WHERE P.UnitPrice > 75 -- join criteria 
ORDER BY P.ProductName;  




