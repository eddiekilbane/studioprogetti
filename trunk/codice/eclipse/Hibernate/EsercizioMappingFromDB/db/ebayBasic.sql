-- DBTools Manager Professional (Enterprise Edition)
-- Database Dump for: ebay
-- Backup Generated in: 10/02/2009 12.50.42
-- Database Server Version: MySQL 5.1.26

-- USEGO

SET FOREIGN_KEY_CHECKS=0;
-- GO

CREATE DATABASE `ebay`;
-- GO
USE `ebay`;
-- GO


--
-- Dumping Tables
--

--
-- Table: bid
--
CREATE TABLE `bid` 
(
	`BID_ID` bigint (20) NOT NULL AUTO_INCREMENT , 
	`NomeOfferente` varchar (50), 
	`Prezzo` double (13,5),
	PRIMARY KEY (`BID_ID`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: bid
--
BEGIN;
-- GO
COMMIT;
-- GO

--
-- Table: item
--
CREATE TABLE `item` 
(
	`ITEM_ID` bigint (20) NOT NULL AUTO_INCREMENT , 
	`Descrizione` varchar (100),
	`Nome` varchar (100),
	PRIMARY KEY (`ITEM_ID`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: item
--
BEGIN;
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

