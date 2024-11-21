-- Exercise page 106
-- 1 Add a new supplier
INSERT INTO suppliers 
VALUES(30, "My Supplier", "Fran Santos", "CEO", "123 James St", "San Francisco","CA", "98765", "USA", "123-456-7890","123-456-7890","www.mysupplier.com"); 

-- 2 Add a new product provided by that supplier 
INSERT INTO products
VALUES(78, "My Product",30, 2,	"12 boxes"	,13.0000,	32,	0,	15,	0); -- 30 is the Supplier ID that I created in the first question 

-- 3 List all products and their suppliers
SELECT ProductName, SupplierID
FROM products;

-- 4 Raise the price of your new product by 15%
UPDATE products
SET unitPrice = 1.15 * 13
WHERE productID = 78; 

-- 5 List the products and prices of all products from that supplier
SELECT ProductName, UnitPrice
FROM products
WHERE SupplierID = 30;

-- 6 Delete the new product.
DELETE FROM products
WHERE productID = 78;

-- 7 Delete the new supplier
DELETE FROM suppliers
WHERE SupplierID = 30;

-- 8 List all products
SELECT productNAme
FROM products;

-- 9 List all suppliers
SELECT CompanyName
FROM suppliers;
