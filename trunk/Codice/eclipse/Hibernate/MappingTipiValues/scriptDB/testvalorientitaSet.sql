-- DBTools Manager Professional (Enterprise Edition)
-- Database Dump for: testvalorientita
-- Backup Generated in: 25/09/2008 7.34.29
-- Database Server Version: MySQL 5.1.26

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
	PRIMARY KEY (`ItemID`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: articoli
--
BEGIN;
-- GO
INSERT INTO `articoli` (`ItemID`, `Nome`, `Descrizione`) VALUES(1, 'NK099', 'VideoTelefono Nokia con tutti gli optional');
-- GO
INSERT INTO `articoli` (`ItemID`, `Nome`, `Descrizione`) VALUES(2, 'LG H32', 'Televisore al Plasma');
-- GO
INSERT INTO `articoli` (`ItemID`, `Nome`, `Descrizione`) VALUES(3, 'MAxtor G542', 'HardDisk 120 GB  7200x');
-- GO
INSERT INTO `articoli` (`ItemID`, `Nome`, `Descrizione`) VALUES(4, 'AMD P238', 'Lettore Mp3 1GB stereo');
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
	PRIMARY KEY (`FKArticoli`, `PathImmagine`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: immagini
--
BEGIN;
-- GO
INSERT INTO `immagini` (`FKArticoli`, `PathImmagine`) VALUES(1, 'img/Id01');
-- GO
INSERT INTO `immagini` (`FKArticoli`, `PathImmagine`) VALUES(2, 'img/Id02');
-- GO
INSERT INTO `immagini` (`FKArticoli`, `PathImmagine`) VALUES(3, 'img/Id03');
-- GO
COMMIT;
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

