-- DBTools Manager Professional (Enterprise Edition)
-- Database Dump for: testcaveaut
-- Backup Generated in: 22/09/2008 23.02.55
-- Database Server Version: MySQL 5.1.26

-- USEGO

SET FOREIGN_KEY_CHECKS=0;
-- GO

CREATE DATABASE `testcaveaut`;
-- GO
USE `testcaveaut`;
-- GO


--
-- Dumping Tables
--

--
-- Table: indirizzo
--
CREATE TABLE `indirizzo` 
(
	`idIndirizzo` bigint (20) NOT NULL AUTO_INCREMENT , 
	`Citta` varchar (50) NOT NULL, 
	`Via` varchar (50) NOT NULL, 
	`CAP` varchar (50) NOT NULL, 
	`FKUtente` bigint (20) NOT NULL,
	PRIMARY KEY (`idIndirizzo`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: indirizzo
--
BEGIN;
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`, `FKUtente`) VALUES(1, 'Roma', ' Via della Bufalotta 123', '00123', 1);
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`, `FKUtente`) VALUES(2, 'Roma', 'Piazza di Spagna 28', '00120', 2);
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`, `FKUtente`) VALUES(4, 'Roma', 'Via Ostiense 256', '00120', 3);
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`, `FKUtente`) VALUES(5, 'Roma', 'Via San Saba 24', '00128', 4);
-- GO
COMMIT;
-- GO

--
-- Table: utente
--
CREATE TABLE `utente` 
(
	`idUser` bigint (20) NOT NULL AUTO_INCREMENT , 
	`Nome` varchar (50) NOT NULL, 
	`Cognome` varchar (50) NOT NULL, 
	`UserId` varchar (50) NOT NULL, 
	`PasswordUtente` varchar (50) NOT NULL, 
	`Email` varchar (50) NOT NULL, 
	`Punteggio` varchar (50) NOT NULL,
	PRIMARY KEY (`idUser`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: utente
--
BEGIN;
-- GO
INSERT INTO `utente` (`idUser`, `Nome`, `Cognome`, `UserId`, `PasswordUtente`, `Email`, `Punteggio`) VALUES(1, 'Marco', 'Vitali', 'vitali', 'vitali', 'marco.vitali@portale.it', '6');
-- GO
INSERT INTO `utente` (`idUser`, `Nome`, `Cognome`, `UserId`, `PasswordUtente`, `Email`, `Punteggio`) VALUES(2, 'Maria', 'Isola', 'maria', 'maria', 'maria@portale.it', '6');
-- GO
INSERT INTO `utente` (`idUser`, `Nome`, `Cognome`, `UserId`, `PasswordUtente`, `Email`, `Punteggio`) VALUES(3, 'Paolo', 'Casarotti', 'paoloCasarotti', 'paolo', 'paolo@ilias.it', '4');
-- GO
INSERT INTO `utente` (`idUser`, `Nome`, `Cognome`, `UserId`, `PasswordUtente`, `Email`, `Punteggio`) VALUES(4, 'Lucia', 'Marotta', 'lucia74', 'lucia', 'lucia@isis.it', '5');
-- GO
COMMIT;
-- GO

--
-- Table: utente_indirizzo
--
CREATE TABLE `utente_indirizzo` 
(
	`IdUtente` bigint (20) NOT NULL, 
	`IdIndirizzo` bigint (20) NOT NULL,
	PRIMARY KEY (`IdUtente`, `IdIndirizzo`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: utente_indirizzo
--
BEGIN;
-- GO
INSERT INTO `utente_indirizzo` (`IdUtente`, `IdIndirizzo`) VALUES(1, 1);
-- GO
INSERT INTO `utente_indirizzo` (`IdUtente`, `IdIndirizzo`) VALUES(2, 1);
-- GO
INSERT INTO `utente_indirizzo` (`IdUtente`, `IdIndirizzo`) VALUES(1, 2);
-- GO
INSERT INTO `utente_indirizzo` (`IdUtente`, `IdIndirizzo`) VALUES(2, 2);
-- GO
INSERT INTO `utente_indirizzo` (`IdUtente`, `IdIndirizzo`) VALUES(1, 4);
-- GO
INSERT INTO `utente_indirizzo` (`IdUtente`, `IdIndirizzo`) VALUES(2, 4);
-- GO
INSERT INTO `utente_indirizzo` (`IdUtente`, `IdIndirizzo`) VALUES(1, 5);
-- GO
INSERT INTO `utente_indirizzo` (`IdUtente`, `IdIndirizzo`) VALUES(3, 5);
-- GO
COMMIT;
-- GO

--
-- Index: FK_Indirizzo
--
ALTER TABLE `testcaveaut`.`utente_indirizzo` ADD INDEX FK_Indirizzo (IdIndirizzo );
-- GO

--
-- Dumping Tables Foreign Keys
--

--
-- Foreign Key Constraint: FK_Indirizzo
--
ALTER TABLE `utente_indirizzo` ADD CONSTRAINT FK_Indirizzo FOREIGN KEY (IdIndirizzo) REFERENCES `indirizzo`(idIndirizzo) ON UPDATE CASCADE;
-- GO

--
-- Foreign Key Constraint: FK_Utenti
--
ALTER TABLE `utente_indirizzo` ADD CONSTRAINT FK_Utenti FOREIGN KEY (IdUtente) REFERENCES `utente`(idUser) ON UPDATE CASCADE;
-- GO

--
-- Dumping Triggers
--
SET FOREIGN_KEY_CHECKS=1;
-- GO

