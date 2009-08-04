-- DBTools Manager Professional (Enterprise Edition)
-- Database Dump for: ricerchedb
-- Backup Generated in: 11/02/2009 17.21.50
-- Database Server Version: MySQL 5.1.26

-- USEGO

SET FOREIGN_KEY_CHECKS=0;
-- GO

CREATE DATABASE `ricerchedb`;
-- GO
USE `ricerchedb`;
-- GO


--
-- Dumping Tables
--

--
-- Table: employees
--
CREATE TABLE `employees` 
(
	`EmployeeID` integer (10) NOT NULL AUTO_INCREMENT , 
	`LastName` varchar (20), 
	`FirstName` varchar (10), 
	`Title` varchar (30), 
	`Address` varchar (60), 
	`City` varchar (15), 
	`Region` varchar (15), 
	`PostalCode` varchar (10), 
	`Country` varchar (15), 
	`HomePhone` varchar (24),
	PRIMARY KEY (`EmployeeID`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: employees
--
BEGIN;
-- GO
INSERT INTO `employees` (`EmployeeID`, `LastName`, `FirstName`, `Title`, `Address`, `City`, `Region`, `PostalCode`, `Country`, `HomePhone`) VALUES(1, 'Davolio', 'Nancy', 'Sales Representative', '507 - 20th Ave. E.\r\nApt. 2A', 'Seattle', 'WA', '98122', 'USA', '(206) 555-9857');
-- GO
INSERT INTO `employees` (`EmployeeID`, `LastName`, `FirstName`, `Title`, `Address`, `City`, `Region`, `PostalCode`, `Country`, `HomePhone`) VALUES(2, 'Fuller', 'Andrew', 'Vice President, Sales', '908 W. Capital Way', 'Tacoma', 'WA', '98401', 'USA', '(206) 555-9482');
-- GO
INSERT INTO `employees` (`EmployeeID`, `LastName`, `FirstName`, `Title`, `Address`, `City`, `Region`, `PostalCode`, `Country`, `HomePhone`) VALUES(3, 'Leverling', 'Janet', 'Sales Representative', '722 Moss Bay Blvd.', 'Kirkland', 'WA', '98033', 'USA', '(206) 555-3412');
-- GO
INSERT INTO `employees` (`EmployeeID`, `LastName`, `FirstName`, `Title`, `Address`, `City`, `Region`, `PostalCode`, `Country`, `HomePhone`) VALUES(4, 'Peacock', 'Margaret', 'Sales Representative', '4110 Old Redmond Rd.', 'Redmond', 'WA', '98052', 'USA', '(206) 555-8122');
-- GO
INSERT INTO `employees` (`EmployeeID`, `LastName`, `FirstName`, `Title`, `Address`, `City`, `Region`, `PostalCode`, `Country`, `HomePhone`) VALUES(5, 'Buchanan', 'Steven', 'Sales Manager', '14 Garrett Hill', 'London', NULL, 'SW1 8JR', 'UK', '(71) 555-4848');
-- GO
INSERT INTO `employees` (`EmployeeID`, `LastName`, `FirstName`, `Title`, `Address`, `City`, `Region`, `PostalCode`, `Country`, `HomePhone`) VALUES(6, 'Suyama', 'Michael', 'Sales Representative', 'Coventry House\r\nMiner Rd.', 'London', NULL, 'EC2 7JR', 'UK', '(71) 555-7773');
-- GO
INSERT INTO `employees` (`EmployeeID`, `LastName`, `FirstName`, `Title`, `Address`, `City`, `Region`, `PostalCode`, `Country`, `HomePhone`) VALUES(7, 'King', 'Robert', 'Sales Representative', 'Edgeham Hollow\r\nWinchester Way', 'London', NULL, 'RG1 9SP', 'UK', '(71) 555-5598');
-- GO
INSERT INTO `employees` (`EmployeeID`, `LastName`, `FirstName`, `Title`, `Address`, `City`, `Region`, `PostalCode`, `Country`, `HomePhone`) VALUES(8, 'Callahan', 'Laura', 'Inside Sales Coordinator', '4726 - 11th Ave. N.E.', 'Seattle', 'WA', '98105', 'USA', '(206) 555-1189');
-- GO
INSERT INTO `employees` (`EmployeeID`, `LastName`, `FirstName`, `Title`, `Address`, `City`, `Region`, `PostalCode`, `Country`, `HomePhone`) VALUES(9, 'Dodsworth', 'Anne', 'Sales Representative', '7 Houndstooth Rd.', 'London', NULL, 'WG2 7LT', 'UK', '(71) 555-4444');
-- GO
COMMIT;
-- GO

--
-- Dumping Tables Foreign Keys
--

--
-- Dumping Triggers
--
SET FOREIGN_KEY_CHECKS=1;
-- GO

