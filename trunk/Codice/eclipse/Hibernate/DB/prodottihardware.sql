-- DBTools Manager Professional (Enterprise Edition)
-- Database Dump for: prodottihardware
-- Backup Generated in: 28/01/2009 11.04.05
-- Database Server Version: MySQL 5.1.26

-- USEGO

SET FOREIGN_KEY_CHECKS=0;
-- GO


--
-- Dumping Tables
--

--
-- Table: fornitori
--
CREATE TABLE `fornitori` 
(
	`FORNITORI_ID` bigint (20) NOT NULL AUTO_INCREMENT , 
	`Nome` varchar (50) NOT NULL,
	PRIMARY KEY (`FORNITORI_ID`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: fornitori
--
BEGIN;
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(3, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(4, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(5, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(6, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(7, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(8, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(9, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(10, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(11, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(12, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(13, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(14, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(15, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(16, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(17, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(18, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(19, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(20, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(21, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(22, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(23, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(24, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(25, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(26, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(27, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(28, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(29, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(30, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(31, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(32, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(33, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(34, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(35, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(36, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(37, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(38, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(39, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(40, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(41, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(42, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(43, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(44, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(45, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(46, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(47, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(48, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(49, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(50, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(51, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(52, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(53, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(54, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(55, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(56, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(57, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(58, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(59, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(60, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(61, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(62, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(63, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(64, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(65, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(66, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(67, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(68, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(69, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(70, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(71, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(72, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(73, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(74, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(75, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(76, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(77, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(78, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(79, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(80, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(81, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(82, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(83, 'MegaCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(84, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(85, 'SuperCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(86, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(87, 'SuperCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(88, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(89, 'SuperCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(90, 'MegaInc');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(91, 'SuperCorp');
-- GO
INSERT INTO `fornitori` (`FORNITORI_ID`, `Nome`) VALUES(92, 'MegaInc');
-- GO
COMMIT;
-- GO

--
-- Table: prodotti
--
CREATE TABLE `prodotti` 
(
	`PRODOTTI_ID` bigint (20) NOT NULL AUTO_INCREMENT , 
	`Nome` varchar (50) NOT NULL, 
	`Descrizione` varchar (50) NOT NULL, 
	`Prezzo` double (5,3) NOT NULL, 
	`FKFornitori` bigint (20),
	PRIMARY KEY (`PRODOTTI_ID`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: prodotti
--
BEGIN;
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(3, 'Web Browser', 'Blocks Pop-ups', 75.000, 3);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(4, 'Keyboard', '101 Keys', 30.000, 4);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(5, 'Email', 'Blocks spam', 49.990, 4);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(8, 'Web Browser', 'Blocks Pop-ups', 75.000, 5);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(9, 'Keyboard', '101 Keys', 30.000, 6);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(10, 'Email', 'Blocks spam', 49.990, 6);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(13, 'Web Browser', 'Blocks Pop-ups', 75.000, 7);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(14, 'Keyboard', '101 Keys', 30.000, 8);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(15, 'Email', 'Blocks spam', 49.990, 8);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(18, 'Web Browser', 'Blocks Pop-ups', 75.000, 9);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(19, 'Keyboard', '101 Keys', 30.000, 10);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(20, 'Email', 'Blocks spam', 49.990, 10);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(23, 'Web Browser', 'Blocks Pop-ups', 75.000, 11);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(24, 'Keyboard', '101 Keys', 30.000, 12);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(25, 'Email', 'Blocks spam', 49.990, 12);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(28, 'Web Browser', 'Blocks Pop-ups', 75.000, 13);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(29, 'Keyboard', '101 Keys', 30.000, 14);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(30, 'Email', 'Blocks spam', 49.990, 14);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(33, 'Web Browser', 'Blocks Pop-ups', 75.000, 15);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(34, 'Keyboard', '101 Keys', 30.000, 16);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(35, 'Email', 'Blocks spam', 49.990, 16);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(38, 'Web Browser', 'Blocks Pop-ups', 75.000, 17);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(39, 'Keyboard', '101 Keys', 30.000, 18);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(40, 'Email', 'Blocks spam', 49.990, 18);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(43, 'Web Browser', 'Blocks Pop-ups', 75.000, 19);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(44, 'Keyboard', '101 Keys', 30.000, 20);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(45, 'Email', 'Blocks spam', 49.990, 20);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(48, 'Web Browser', 'Blocks Pop-ups', 75.000, 21);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(49, 'Keyboard', '101 Keys', 30.000, 22);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(50, 'Email', 'Blocks spam', 49.990, 22);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(53, 'Web Browser', 'Blocks Pop-ups', 75.000, 23);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(54, 'Keyboard', '101 Keys', 30.000, 24);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(55, 'Email', 'Blocks spam', 49.990, 24);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(58, 'Web Browser', 'Blocks Pop-ups', 75.000, 25);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(59, 'Keyboard', '101 Keys', 30.000, 26);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(60, 'Email', 'Blocks spam', 49.990, 26);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(63, 'Web Browser', 'Blocks Pop-ups', 75.000, 27);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(64, 'Keyboard', '101 Keys', 30.000, 28);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(65, 'Email', 'Blocks spam', 49.990, 28);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(68, 'Web Browser', 'Blocks Pop-ups', 75.000, 29);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(69, 'Keyboard', '101 Keys', 30.000, 30);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(70, 'Email', 'Blocks spam', 49.990, 30);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(73, 'Web Browser', 'Blocks Pop-ups', 75.000, 31);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(74, 'Keyboard', '101 Keys', 30.000, 32);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(75, 'Email', 'Blocks spam', 49.990, 32);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(78, 'Web Browser', 'Blocks Pop-ups', 75.000, 33);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(79, 'Keyboard', '101 Keys', 30.000, 34);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(80, 'Email', 'Blocks spam', 49.990, 34);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(83, 'Web Browser', 'Blocks Pop-ups', 75.000, 35);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(84, 'Keyboard', '101 Keys', 30.000, 36);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(85, 'Email', 'Blocks spam', 49.990, 36);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(88, 'Web Browser', 'Blocks Pop-ups', 75.000, 37);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(89, 'Keyboard', '101 Keys', 30.000, 38);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(90, 'Email', 'Blocks spam', 49.990, 38);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(93, 'Web Browser', 'Blocks Pop-ups', 75.000, 39);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(94, 'Keyboard', '101 Keys', 30.000, 40);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(95, 'Email', 'Blocks spam', 49.990, 40);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(98, 'Web Browser', 'Blocks Pop-ups', 75.000, 41);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(99, 'Keyboard', '101 Keys', 30.000, 42);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(100, 'Email', 'Blocks spam', 49.990, 42);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(103, 'Web Browser', 'Blocks Pop-ups', 75.000, 43);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(104, 'Keyboard', '101 Keys', 30.000, 44);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(105, 'Email', 'Blocks spam', 49.990, 44);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(108, 'Web Browser', 'Blocks Pop-ups', 75.000, 45);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(109, 'Keyboard', '101 Keys', 30.000, 46);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(110, 'Email', 'Blocks spam', 49.990, 46);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(113, 'Web Browser', 'Blocks Pop-ups', 75.000, 47);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(114, 'Keyboard', '101 Keys', 30.000, 48);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(115, 'Email', 'Blocks spam', 49.990, 48);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(118, 'Web Browser', 'Blocks Pop-ups', 75.000, 49);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(119, 'Keyboard', '101 Keys', 30.000, 50);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(120, 'Email', 'Blocks spam', 49.990, 50);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(123, 'Web Browser', 'Blocks Pop-ups', 75.000, 51);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(124, 'Keyboard', '101 Keys', 30.000, 52);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(125, 'Email', 'Blocks spam', 49.990, 52);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(128, 'Web Browser', 'Blocks Pop-ups', 75.000, 53);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(129, 'Keyboard', '101 Keys', 30.000, 54);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(130, 'Email', 'Blocks spam', 49.990, 54);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(133, 'Web Browser', 'Blocks Pop-ups', 75.000, 55);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(134, 'Keyboard', '101 Keys', 30.000, 56);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(135, 'Email', 'Blocks spam', 49.990, 56);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(138, 'Web Browser', 'Blocks Pop-ups', 75.000, 57);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(139, 'Keyboard', '101 Keys', 30.000, 58);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(140, 'Email', 'Blocks spam', 49.990, 58);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(143, 'Web Browser', 'Blocks Pop-ups', 75.000, 59);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(144, 'Keyboard', '101 Keys', 30.000, 60);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(145, 'Email', 'Blocks spam', 49.990, 60);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(148, 'Web Browser', 'Blocks Pop-ups', 75.000, 61);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(149, 'Keyboard', '101 Keys', 30.000, 62);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(150, 'Email', 'Blocks spam', 49.990, 62);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(153, 'Web Browser', 'Blocks Pop-ups', 75.000, 63);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(154, 'Keyboard', '101 Keys', 30.000, 64);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(155, 'Email', 'Blocks spam', 49.990, 64);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(158, 'Web Browser', 'Blocks Pop-ups', 75.000, 65);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(159, 'Keyboard', '101 Keys', 30.000, 66);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(160, 'Email', 'Blocks spam', 49.990, 66);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(163, 'Web Browser', 'Blocks Pop-ups', 75.000, 67);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(164, 'Keyboard', '101 Keys', 30.000, 68);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(165, 'Email', 'Blocks spam', 49.990, 68);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(168, 'Web Browser', 'Blocks Pop-ups', 75.000, 69);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(169, 'Keyboard', '101 Keys', 30.000, 70);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(170, 'Email', 'Blocks spam', 49.990, 70);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(173, 'Web Browser', 'Blocks Pop-ups', 75.000, 71);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(174, 'Keyboard', '101 Keys', 30.000, 72);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(175, 'Email', 'Blocks spam', 49.990, 72);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(178, 'Web Browser', 'Blocks Pop-ups', 75.000, 73);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(179, 'Keyboard', '101 Keys', 30.000, 74);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(180, 'Email', 'Blocks spam', 49.990, 74);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(183, 'Web Browser', 'Blocks Pop-ups', 75.000, 75);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(184, 'Keyboard', '101 Keys', 30.000, 76);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(185, 'Email', 'Blocks spam', 49.990, 76);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(188, 'Web Browser', 'Blocks Pop-ups', 75.000, 77);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(189, 'Keyboard', '101 Keys', 30.000, 78);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(190, 'Email', 'Blocks spam', 49.990, 78);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(193, 'Web Browser', 'Blocks Pop-ups', 75.000, 79);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(194, 'Keyboard', '101 Keys', 30.000, 80);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(195, 'Email', 'Blocks spam', 49.990, 80);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(198, 'Web Browser', 'Blocks Pop-ups', 75.000, 81);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(199, 'Keyboard', '101 Keys', 30.000, 82);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(200, 'Email', 'Blocks spam', 49.990, 82);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(203, 'Web Browser', 'Blocks Pop-ups', 75.000, 83);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(204, 'Keyboard', '101 Keys', 30.000, 84);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(205, 'Email', 'Blocks spam', 49.990, 84);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(208, 'Web Browser', 'Blocks Pop-ups', 75.000, 85);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(209, 'Keyboard', '101 Keys', 30.000, 86);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(210, 'Email', 'Blocks spam', 49.990, 86);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(213, 'Web Browser', 'Blocks Pop-ups', 75.000, 87);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(214, 'Keyboard', '101 Keys', 30.000, 88);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(215, 'Email', 'Blocks spam', 49.990, 88);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(218, 'Web Browser', 'Blocks Pop-ups', 75.000, 89);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(219, 'Keyboard', '101 Keys', 30.000, 90);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(220, 'Email', 'Blocks spam', 49.990, 90);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(223, 'Web Browser', 'Blocks Pop-ups', 75.000, 91);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(224, 'Keyboard', '101 Keys', 30.000, 92);
-- GO
INSERT INTO `prodotti` (`PRODOTTI_ID`, `Nome`, `Descrizione`, `Prezzo`, `FKFornitori`) VALUES(225, 'Email', 'Blocks spam', 49.990, 92);
-- GO
COMMIT;
-- GO

--
-- Index: FK_prodotti_Fornitori
--
ALTER TABLE `prodottihardware`.`prodotti` ADD INDEX FK_prodotti_Fornitori (FKFornitori );
-- GO

--
-- Table: software
--
CREATE TABLE `software` 
(
	`PRODOTTI_ID` bigint (20) NOT NULL, 
	`Versione` varchar (50),
	PRIMARY KEY (`PRODOTTI_ID`)
) TYPE=InnoDB CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- GO

--
-- Dumping Table Data: software
--
BEGIN;
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(3, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(5, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(8, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(10, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(13, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(15, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(18, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(20, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(23, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(25, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(28, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(30, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(33, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(35, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(38, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(40, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(43, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(45, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(48, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(50, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(53, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(55, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(58, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(60, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(63, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(65, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(68, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(70, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(73, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(75, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(78, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(80, '4.1 RMX Edition');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(83, '2.0');
-- GO
INSERT INTO `software` (`PRODOTTI_ID`, `Versione`) VALUES(85, '4.1 RMX Edition');
-- GO
COMMIT;
-- GO

--
-- Dumping Tables Foreign Keys
--

--
-- Foreign Key Constraint: FK_prodotti_Fornitori
--
ALTER TABLE `prodotti` ADD CONSTRAINT FK_prodotti_Fornitori FOREIGN KEY (FKFornitori) REFERENCES `fornitori`(FORNITORI_ID);
-- GO

--
-- Foreign Key Constraint: FK_software_Prodotti
--
ALTER TABLE `software` ADD CONSTRAINT FK_software_Prodotti FOREIGN KEY (PRODOTTI_ID) REFERENCES `prodotti`(PRODOTTI_ID);
-- GO

--
-- Dumping Triggers
--
SET FOREIGN_KEY_CHECKS=1;
-- GO

