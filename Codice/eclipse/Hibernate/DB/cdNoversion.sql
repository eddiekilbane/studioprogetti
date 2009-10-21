-- DBTools Manager Professional (Enterprise Edition)
-- Database Dump for: negoziocd
-- Backup Generated in: 21/02/2009 20.13.39
-- Database Server Version: MySQL 5.1.26

-- USEGO

SET FOREIGN_KEY_CHECKS=0;
-- GO


--
-- Table: cdnoversion
--
CREATE TABLE `cdnoversion` 
(
	`idCd` bigint (20) NOT NULL AUTO_INCREMENT , 
	`Artista` varchar (255), 
	`Etichetta` varchar (255), 
	`Prezzo` decimal (13,2), 
	`Titolo` varchar (255), 
	`Nazione` varchar (255), 
	`Anno` integer (11), 
	`Quantita` integer (11),
	PRIMARY KEY (`idCd`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO
BEGIN;
-- GO

--
-- Dumping Table Data: cdnoversion
--
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(2, 'Bonnie Tyler', 'CBS Records', 9.90, 'Hide your heart', 'UK', 1982, 3);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(3, 'Dolly Parton', 'RCA', 9.90, 'Greatest Hits', 'USA', 1988, 4);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(4, 'Gary Moore', 'Virgin records', 10.20, 'Still got the blues', 'UK', 1990, 3);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(5, 'Eros Ramazzotti', 'BMG', 9.90, 'Eros', 'EU', 1997, 4);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(6, 'Bee Gees', 'Polydor', 10.90, 'One night only', 'UK', 1977, 5);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(7, 'Dr.Hook', 'CBS', 8.20, 'Sylvias Mother', 'UK', 1973, 3);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(8, 'Rod Stewart', 'Pickwick', 8.50, 'Maggie May', 'UK', 1990, 4);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(9, 'Andrea Bocelli', 'Polydor', 10.80, 'Romanza', 'EU', 1996, 3);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(10, 'Percy Sledge', 'Atlantic', 8.70, 'When a man loves a woman', 'USA', 1987, 2);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(11, 'Savage Rose', 'Mega', 10.90, 'Black angel', 'EU', 1995, 3);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(12, 'Many', 'Grammy', 10.20, '1999 Grammy Nominees', 'USA', 1999, 4);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(13, 'Kenny Rogers', 'Mucik Master', 8.70, 'For the good times', 'UK', 1995, 5);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(14, 'Will Smith', 'Columbia', 9.90, 'Big Willie style', 'USA', 1997, 3);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(15, 'Van Morrison', 'Polydor', 8.20, 'Tupelo Honey', 'UK', 1971, 4);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(16, 'Jorn Hoel', 'WEA', 7.90, 'Soulsville', 'Norway', 1996, 5);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(17, 'Cat Stevens', 'Island', 8.90, 'The very best of', 'UK', 1990, 3);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(18, 'Sam Brown', 'A and M', 8.90, 'Stop', 'UK', 1988, 4);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(19, 'T\'Pau', 'Siren', 7.90, 'Bridge OF Spies', 'UK', 1987, 3);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(20, 'Tina Turner', 'Capitol', 8.90, 'Private Dancer', 'UK', 1983, 2);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(21, 'Kim Larsen', 'Medley', 7.80, 'Midt om natten', 'EU', 1983, 3);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(22, 'Luciano Pavarotti', 'DECCA', 9.90, 'Pavarotti Gala Concert', 'UK', 1991, 4);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(23, 'Otis Redding', 'Atlantic', 7.90, 'The dock of the bay', 'USA', 1987, 3);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(24, 'Simply Red', 'Elektra', 7.20, 'Picture book', 'EU', 1985, 3);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(25, 'The Communards', 'London', 7.80, 'Red', 'UK', 1987, 2);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(26, 'Joe Cocker', 'EMI', 8.20, 'Unchain my heart', 'USA', 1987, 1);
-- GO
INSERT INTO `cdnoversion` (`idCd`, `Artista`, `Etichetta`, `Prezzo`, `Titolo`, `Nazione`, `Anno`, `Quantita`) VALUES(27, 'The Cure', 'Fiction', 20.34, 'Disintegration', 'UK', 1989, 0);
-- GO
COMMIT;
-- GO

--
-- Dumping Table Foreign Keys
--

--
-- Dumping Triggers
--
SET FOREIGN_KEY_CHECKS=1;
-- GO

