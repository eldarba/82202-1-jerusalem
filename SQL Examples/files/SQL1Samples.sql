SELECT * FROM employees;
SELECT EmployeeID, LastName, FirstName FROM employees;
SELECT * FROM employees where EmployeeID >= 5;
select * from employees where EmployeeID >= 5 order by FirstName;

select ProductName, UnitsInStock from products where UnitsInStock between 10 and 20;
select ProductName, UnitsInStock from products where UnitsInStock not between 10 and 20;

-- alias - give columns other names
-- use backticks `aaa` when identifiers conflicts with keywords 
SELECT EmployeeID as id, LastName as lastN, FirstName as firstN FROM employees;

-- concatenation
SELECT EmployeeID, concat(LastName, ' ', FirstName) as `full_name` FROM employees;

-- arithmetical operations
select ProductName, UnitPrice, UnitPrice * 1.17 as vat from products;

-- distinct results
select  EmployeeID from orders;
select distinct EmployeeID from orders;
select  CustomerID,  EmployeeID from orders;
select distinct CustomerID,  EmployeeID from orders;

-- in
select * from employees;
select * from employees where city = 'London' or city = 'Tacoma' or city = 'Kirkland';
select * from employees where city in ('London', 'Tacoma', 'Kirkland');
select * from employees where city not in ('London', 'Tacoma', 'Kirkland');

-- like
select * from customers;
-- starts with A
select * from customers where ContactName like 'A%';
-- second letter is A
select * from customers where ContactName like '_A%';

-- null
select CustomerID, CompanyName, Region from customers;
select CustomerID, CompanyName, Region from customers where region is null;
select CustomerID, CompanyName, Region from customers where region is not null;

-- order by
-- ascending order is default
select * from products order by ProductName;
select * from products order by ProductName asc;
-- descending order
select * from products order by ProductName desc;
-- order by column index
select * from products order by 2 desc;
-- order by alias
select ProductID, ProductName as `name` from products order by `name`;

-- limit number of results
select * from products;
select * from products order by ProductName limit 10;

-- join data from more than one table
select * from products;
select * from categories;
-- cartesian
select * from products join categories;

select p.ProductID, p.ProductName, p.CategoryID,
c.CategoryID, c.CategoryName
from products as p join categories as c
on p.CategoryID = c.CategoryID;

-- join 3 tables
select * from products;
select * from categories;
select * from suppliers;

select p.ProductID, p.ProductName, c.CategoryName, s.CompanyName as supplier
from categories as c
join products as p
on c.CategoryID = p.CategoryID
join suppliers as s
on p.SupplierID = s.SupplierID;







