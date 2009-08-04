-- DBTools Manager Professional (Enterprise Edition)
-- Database Dump for: testvalorientita
-- Backup Generated in: 03/06/04 16.25.50
-- Database Server Version: MySQL 5.0.24

-- USEGO

SET FOREIGN_KEY_CHECKS=0;
-- GO

CREATE DATABASE `testvalorientita`;
-- GO
USE `testvalorientita`;
-- GO


--
-- Dumping Tables
--

--
-- Table: articoli
--
CREATE TABLE `articoli` 
(
	`ItemID` bigint (20) NOT NULL AUTO_INCREMENT , 
	`Nome` varchar (50) NOT NULL, 
	`Descrizione` varchar (50) NOT NULL, 
	`immagini` varchar (50),
	PRIMARY KEY (`ItemID`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: articoli
--
BEGIN;
-- GO
INSERT INTO `articoli` (`ItemID`, `Nome`, `Descrizione`, `immagini`) VALUES(1, 'NK099', 'VideoTelefono Nokia con tutti gli optional', NULL);
-- GO
INSERT INTO `articoli` (`ItemID`, `Nome`, `Descrizione`, `immagini`) VALUES(2, 'LG H32', 'Televisore al Plasma', NULL);
-- GO
INSERT INTO `articoli` (`ItemID`, `Nome`, `Descrizione`, `immagini`) VALUES(3, 'MAxtor G542', 'HardDisk 120 GB  7200x', NULL);
-- GO
INSERT INTO `articoli` (`ItemID`, `Nome`, `Descrizione`, `immagini`) VALUES(4, 'AMD P238', 'Lettore Mp3 1GB stereo', NULL);
-- GO
COMMIT;
-- GO

--
-- Table: immagini
--
CREATE TABLE `immagini` 
(
	`FKArticoli` bigint (20) NOT NULL, 
	`PathImmagine` varchar (50) NOT NULL, 
	`ImmagineID` bigint (50) NOT NULL AUTO_INCREMENT ,
	PRIMARY KEY (`ImmagineID`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: immagini
--
BEGIN;
-- GO
INSERT INTO `immagini` (`FKArticoli`, `PathImmagine`, `ImmagineID`) VALUES(1, 'img/Id01', 1);
-- GO
INSERT INTO `immagini` (`FKArticoli`, `PathImmagine`, `ImmagineID`) VALUES(2, 'img/Id02', 2);
-- GO
INSERT INTO `immagini` (`FKArticoli`, `PathImmagine`, `ImmagineID`) VALUES(3, 'img/Id03', 3);
-- GO
COMMIT;
-- GO

--
-- Index: IXFK_immagini
--
ALTER TABLE `testvalorientita`.`immagini` ADD INDEX IXFK_immagini (FKArticoli );
-- GO

--
-- Dumping Tables Foreign Keys
--

--
-- Foreign Key Constraint: FK_immagini_Articoli
--
ALTER TABLE `immagini` ADD CONSTRAINT FK_immagini_Articoli FOREIGN KEY (FKArticoli) REFERENCES `articoli`(ItemID);
-- GO

--
-- Dumping Triggers
--
SET FOREIGN_KEY_CHECKS=1;
-- GO

