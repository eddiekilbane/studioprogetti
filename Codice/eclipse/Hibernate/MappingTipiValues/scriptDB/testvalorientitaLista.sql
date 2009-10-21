-- DBTools Manager Professional (Enterprise Edition)
-- Database Dump for: testvalorientita
-- Backup Generated in: 25/09/2008 7.31.01
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
INSERT INTO `articoli` (`ItemID`, `Nome`, `Descrizione`) VALUES(5, 'ND Envidia', 'Scheda Video');
-- GO
COMMIT;
-- GO

--
-- Table: immagini
--
CREATE TABLE `immagini` 
(
	`FKArticolo` bigint (20) NOT NULL, 
	`PathImmagine` varchar (50) NOT NULL, 
	`Position` integer (50) NOT NULL,
	PRIMARY KEY (`FKArticolo`, `PathImmagine`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: immagini
--
BEGIN;
-- GO
INSERT INTO `immagini` (`FKArticolo`, `PathImmagine`, `Position`) VALUES(1, 'img.gif', 0);
-- GO
INSERT INTO `immagini` (`FKArticolo`, `PathImmagine`, `Position`) VALUES(2, 'img2.jpg', 0);
-- GO
INSERT INTO `immagini` (`FKArticolo`, `PathImmagine`, `Position`) VALUES(2, 'img3.jpg', 0);
-- GO
INSERT INTO `immagini` (`FKArticolo`, `PathImmagine`, `Position`) VALUES(2, 'img4.jpg', 0);
-- GO
INSERT INTO `immagini` (`FKArticolo`, `PathImmagine`, `Position`) VALUES(5, 'imgid90', 0);
-- GO
INSERT INTO `immagini` (`FKArticolo`, `PathImmagine`, `Position`) VALUES(5, 'imgid91', 2);
-- GO
INSERT INTO `immagini` (`FKArticolo`, `PathImmagine`, `Position`) VALUES(5, 'imgid92', 1);
-- GO
COMMIT;
-- GO

--
-- Dumping Tables Foreign Keys
--

--
-- Foreign Key Constraint: FK_immagini_articoli
--
ALTER TABLE `immagini` ADD CONSTRAINT FK_immagini_articoli FOREIGN KEY (FKArticolo) REFERENCES `articoli`(ItemID);
-- GO

--
-- Dumping Triggers
--
SET FOREIGN_KEY_CHECKS=1;
-- GO

