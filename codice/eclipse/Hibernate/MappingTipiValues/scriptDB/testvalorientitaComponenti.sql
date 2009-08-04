-- DBTools Manager Professional (Enterprise Edition)
-- Database Dump for: testvalorientita
-- Backup Generated in: 03/06/04 20.34.55
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
INSERT INTO `articoli` (`ItemID`, `Nome`, `Descrizione`) VALUES(5, 'ND Envidia', 'Scheda Video');
-- GO
COMMIT;
-- GO

--
-- Table: immagini
--
CREATE TABLE `immagini` 
(
	`NomeImmagine` varchar (50) NOT NULL, 
	`PathImmagine` varchar (50) NOT NULL, 
	`FKArticoli` bigint (20) NOT NULL, 
	`SizeX` integer (11) NOT NULL, 
	`SizeY` integer (11) NOT NULL,
	PRIMARY KEY (`PathImmagine`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: immagini
--
BEGIN;
-- GO
INSERT INTO `immagini` (`NomeImmagine`, `PathImmagine`, `FKArticoli`, `SizeX`, `SizeY`) VALUES('nomeImmagine1', 'img1', 1, 120, 120);
-- GO
INSERT INTO `immagini` (`NomeImmagine`, `PathImmagine`, `FKArticoli`, `SizeX`, `SizeY`) VALUES('nomeImmagine2', 'img2', 2, 200, 160);
-- GO
INSERT INTO `immagini` (`NomeImmagine`, `PathImmagine`, `FKArticoli`, `SizeX`, `SizeY`) VALUES('nomeImmagine3', 'img3', 3, 100, 180);
-- GO
INSERT INTO `immagini` (`NomeImmagine`, `PathImmagine`, `FKArticoli`, `SizeX`, `SizeY`) VALUES('nomeImmagine4', 'img4', 5, 100, 210);
-- GO
COMMIT;
-- GO

--
-- Index: FK_immagini_articoli
--
ALTER TABLE `testvalorientita`.`immagini` ADD INDEX FK_immagini_articoli (FKArticoli );
-- GO

--
-- Dumping Tables Foreign Keys
--

--
-- Foreign Key Constraint: FK_immagini_articoli
--
ALTER TABLE `immagini` ADD CONSTRAINT FK_immagini_articoli FOREIGN KEY (FKArticoli) REFERENCES `articoli`(ItemID);
-- GO

--
-- Dumping Triggers
--
SET FOREIGN_KEY_CHECKS=1;
-- GO

