# Write your MySQL query statement below
SELECT c.name As Customers from Customers c
left join Orders o on  c.id=o.Customerid
 where o.id is null;
 