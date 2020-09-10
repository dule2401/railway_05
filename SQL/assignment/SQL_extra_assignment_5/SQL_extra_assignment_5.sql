-- Exercise 1: Subquery 
-- Question 1: Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name
-- của ProductSubcategory là 'Saddles'.
use `adventureworks`;
SELECT 
    P.ProductID,P.`Name`,PR.`Name`
FROM
    `product` P
    join `productsubcategory` PR on P.ProductSubcategoryID =PR.ProductSubcategoryID
WHERE
    P.ProductSubcategoryID = (SELECT 
            ProductSubcategoryID
        FROM
            `productsubcategory`
        WHERE
            `Name` = 'Saddles');
            
-- Question 2: Thay đổi câu Query 1 để lấy được kết quả sau.
-- In this exercise you can change the previous query to deliver the following result set. 
select P.`name`
FROM
    `product` P
    join `productsubcategory` PR on P.ProductSubcategoryID =PR.ProductSubcategoryID
WHERE P.`name` like '%Bo%';


-- Question 3:
-- Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) và Touring
-- Bike (nghĩa là ProductSubcategoryID = 3) 
use `adventureworks`;
SELECT 
    `Name`
FROM
    product
WHERE
    StandardCost = (SELECT 
            *
        FROM
            (SELECT 
                MIN(StandardCost)
            FROM
                product
            WHERE
                ProductSubcategoryID = 3) AS min_StandardCost);
                
--------------------------------------------------------------------
-- Exercise 2: JOIN nhiều bảng
-- Question 1: Viết query lấy danh sách tên country và provicountryregionnce được lưu trong
-- AdventureWorks2008sample database.

use `adventureworks`;
SELECT 
    CT.`Name` AS Country, ST.`Name` AS Province
FROM
    `countryregion` CT
        JOIN
    stateprovince ST ON CT.CountryRegionCode = ST.CountryRegionCode;
--------------------------------------------------------------------------
-- Question 2: Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country
-- Germany và Canada
use `adventureworks`;
SELECT 
    CT.`Name` AS Country, ST.`Name` AS Province
FROM
    `countryregion` CT
        JOIN
    stateprovince ST ON CT.CountryRegionCode = ST.CountryRegionCode
   
   WHERE CT.`Name`= 'Germany' or CT.`Name`= 'Canada';
   
-------------------------------------------------------------
-- Question 3:
-- SalesOrderID, OrderDate and SalesPersonID. Từ bảng SalesPerson, chúng ta lấy cột
-- BusinessEntityID (là định danh của người sales), Bonus and the SalesYTD (là đã sale
-- được bao nhiêu người trong năm nay)

use `adventureworks`;
SELECT SS.SalesOrderID,SP.SalesPersonID,SS.OrderDate,SP.Bonus,SP.SalesYTD
from `salesperson` SP
join `salesorderheader` SS on SP.SalesPersonID= SS.SalesPersonID;

-----------------------------------------------------------------------
-- Question 4:
-- Sử dụng câu query, thêm cột JobTitle and xóa cột SalesPersonID và
-- BusinessEntityID.
use `adventureworks`;
create view sales_order as (
SELECT SS.SalesOrderID,SP.SalesPersonID,SS.OrderDate,SP.Bonus,SP.SalesYTD
from `salesperson` SP
join `salesorderheader` SS on SP.SalesPersonID= SS.SalesPersonID);
select SO.SalesOrderID,SO.OrderDate,SO.Bonus,SO.SalesYTD,E.Title
from sales_order SO
left join `employee` E on SO.SalesPersonID = E.EmployeeID;
-- dùng cte --

-----------------------------------------------------------------------
-- 

