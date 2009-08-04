-- DBTools Manager Professional (Enterprise Edition)
-- Database Dump for: testcaveaut
-- Backup Generated in: 10/02/2004 7.15.18
-- Database Server Version: MySQL 5.1.26

-- USEGO

SET FOREIGN_KEY_CHECKS=0;
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
	PRIMARY KEY (`idIndirizzo`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: indirizzo
--
BEGIN;
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(1, 'Roma', ' Via della Bufalotta 123', '00123');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(2, 'Roma', 'Piazza di Spagna 28', '00120');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(4, 'Roma', 'Via Ostiense 256', '00120');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(5, 'Roma', 'Via San Saba 24', '00128');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(6, 'Roma', 'Via Giulia 28', '00126');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(7, 'Roma', 'Piazza Navona 16', '00122');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(8, 'Roma', 'Via Giulia 28', '00126');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(9, 'Roma', 'Piazza Navona 16', '00122');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(16, 'Roma', 'Piazza Navona 16', '00122');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(17, 'Roma', 'Via Giulia 28', '00126');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(18, 'Roma', 'Piazza Navona 16', '00122');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(19, 'Roma', 'Via Giulia 28', '00126');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(20, 'Roma', 'Piazza Navona 16', '00122');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(21, 'Roma', 'Via Giulia 28', '00126');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(22, 'Roma', 'Piazza Navona 16', '00122');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(23, 'Roma', 'Via Giulia 28', '00126');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(24, 'Roma', 'Piazza Navona 16', '00122');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(25, 'Roma', 'Via Giulia 28', '00126');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(26, 'Roma', 'Via Giulia 28', '00126');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(27, 'Roma', 'Piazza Navona 16', '00122');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(28, 'Roma', 'Via Giulia 28', '00126');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(29, 'Roma', 'Piazza Navona 16', '00122');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(30, 'Roma', 'Via Giulia 28', '00126');
-- GO
INSERT INTO `indirizzo` (`idIndirizzo`, `Citta`, `Via`, `CAP`) VALUES(31, 'Roma', 'Piazza Navona 16', '00122');
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
INSERT INTO `utente` (`idUser`, `Nome`, `Cognome`, `UserId`, `PasswordUtente`, `Email`, `Punteggio`) VALUES(15, 'Stefano', 'Fiorenza', 'stefano', 'stefano', 'stefanofiorenza@portale.it', '6');
-- GO
INSERT INTO `utente` (`idUser`, `Nome`, `Cognome`, `UserId`, `PasswordUtente`, `Email`, `Punteggio`) VALUES(16, 'Stefano', 'Fiorenza', 'stefano', 'stefano', 'stefanofiorenza@portale.it', '6');
-- GO
INSERT INTO `utente` (`idUser`, `Nome`, `Cognome`, `UserId`, `PasswordUtente`, `Email`, `Punteggio`) VALUES(17, 'Stefano', 'Fiorenza', 'stefano', 'stefano', 'stefanofiorenza@portale.it', '6');
-- GO
INSERT INTO `utente` (`idUser`, `Nome`, `Cognome`, `UserId`, `PasswordUtente`, `Email`, `Punteggio`) VALUES(18, 'Stefano', 'Fiorenza', 'stefano', 'stefano', 'stefanofiorenza@portale.it', '6');
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
INSERT INTO `utente_indirizzo` (`IdUtente`, `IdIndirizzo`) VALUES(15, 24);
-- GO
INSERT INTO `utente_indirizzo` (`IdUtente`, `IdIndirizzo`) VALUES(15, 25);
-- GO
INSERT INTO `utente_indirizzo` (`IdUtente`, `IdIndirizzo`) VALUES(17, 28);
-- GO
INSERT INTO `utente_indirizzo` (`IdUtente`, `IdIndirizzo`) VALUES(17, 29);
-- GO
INSERT INTO `utente_indirizzo` (`IdUtente`, `IdIndirizzo`) VALUES(18, 30);
-- GO
INSERT INTO `utente_indirizzo` (`IdUtente`, `IdIndirizzo`) VALUES(18, 31);
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

