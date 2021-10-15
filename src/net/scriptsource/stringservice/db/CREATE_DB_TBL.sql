-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Erstellungszeit: 12. Okt 2021 um 09:53
-- Server-Version: 8.0.26-0ubuntu0.20.04.3
-- PHP-Version: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Datenbank: `script-source.net`
--
CREATE DATABASE IF NOT EXISTS `script-source.net` DEFAULT CHARACTER SET utf32 COLLATE utf32_german2_ci;
USE `script-source.net`;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tbl_brand`
--

DROP TABLE IF EXISTS `tbl_brand`;
CREATE TABLE IF NOT EXISTS `tbl_brand` (
  `brand_id` int NOT NULL AUTO_INCREMENT,
  `brand_name` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci NOT NULL,
  PRIMARY KEY (`brand_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf32 COLLATE=utf32_german2_ci;

--
-- Daten für Tabelle `tbl_brand`
--

INSERT INTO `tbl_brand` (`brand_id`, `brand_name`) VALUES
(1, 'Pro\'s Pro'),
(2, 'Wilson'),
(3, 'Head'),
(4, 'Luxilon'),
(5, 'Babolat'),
(6, 'Kirschbaum'),
(7, 'Dunlop'),
(8, 'Gamma');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tbl_customers`
--

DROP TABLE IF EXISTS `tbl_customers`;
CREATE TABLE IF NOT EXISTS `tbl_customers` (
  `customers_id` int NOT NULL AUTO_INCREMENT,
  `customers_lastname` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci NOT NULL,
  `customers_firstname` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci NOT NULL,
  `customers_phone` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci DEFAULT NULL,
  `customers_mail` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci DEFAULT NULL,
  `customers_adresse` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci DEFAULT NULL,
  `customers_adresse_nr` varchar(40) CHARACTER SET utf32 COLLATE utf32_german2_ci DEFAULT NULL,
  `customers_postalcode` int DEFAULT NULL,
  `customers_city` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci DEFAULT NULL,
  PRIMARY KEY (`customers_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf32 COLLATE=utf32_german2_ci;

--
-- Daten für Tabelle `tbl_customers`
--

INSERT INTO `tbl_customers` (`customers_id`, `customers_lastname`, `customers_firstname`, `customers_phone`, `customers_mail`, `customers_adresse`, `customers_adresse_nr`, `customers_postalcode`, `customers_city`) VALUES
(1, 'Desax', 'Gion', '0798270098', 'gion.desax@script-source.net', 'Vogelsangweg', '24', 7000, 'Chur'),
(2, 'Fetz', 'Patrizia', '0796839666', 'titsli@bluewin.ch', 'Vogelsangweg', '24', 7000, 'Chur'),
(3, 'Fetz', 'Gion', '0774202180', 'gion.fetz@bluewin.ch', 'Friedaustrasse', '4', 7205, 'Zizers'),
(4, 'Fetz', 'Camilla', '0797311040', 'gion.fetz@bluewin.ch', 'Friedaustrasse', '4', 7205, 'Zizers');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tbl_login`
--

DROP TABLE IF EXISTS `tbl_login`;
CREATE TABLE IF NOT EXISTS `tbl_login` (
  `login_id` int NOT NULL AUTO_INCREMENT,
  `login_username` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci NOT NULL,
  `login_password` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci NOT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`login_id`),
  UNIQUE KEY `tbl_login_login_username_uindex` (`login_username`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf32 COLLATE=utf32_german2_ci;

--
-- Daten für Tabelle `tbl_login`
--

INSERT INTO `tbl_login` (`login_id`, `login_username`, `login_password`, `created_at`) VALUES
(1, 'jhonnyd', 'Gniffi1234.\r\n', '2020-11-22 14:25:26'),
(2, 'titsli', 'Gniffi1234\r\n', '2020-11-22 14:25:26');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tbl_login_users`
--

DROP TABLE IF EXISTS `tbl_login_users`;
CREATE TABLE IF NOT EXISTS `tbl_login_users` (
  `login_users_id` int NOT NULL AUTO_INCREMENT,
  `login_id` int NOT NULL,
  `users_id` int NOT NULL,
  PRIMARY KEY (`login_users_id`),
  UNIQUE KEY `tbl_login_users_login_id_uindex` (`login_id`),
  UNIQUE KEY `tbl_login_users_users_id_uindex` (`users_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf32 COLLATE=utf32_german2_ci;

--
-- Daten für Tabelle `tbl_login_users`
--

INSERT INTO `tbl_login_users` (`login_users_id`, `login_id`, `users_id`) VALUES
(1, 1, 1),
(2, 2, 2);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tbl_orders`
--

DROP TABLE IF EXISTS `tbl_orders`;
CREATE TABLE IF NOT EXISTS `tbl_orders` (
  `orders_id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int NOT NULL,
  `orders_date` date NOT NULL,
  `orders_finishdate` date DEFAULT NULL,
  `racket_id` int DEFAULT NULL,
  PRIMARY KEY (`orders_id`),
  KEY `tbl_orders_tbl_customers_customers_id_fk` (`customer_id`),
  KEY `tbl_orders_tbl_racket_racket_id_fk` (`racket_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf32 COLLATE=utf32_german2_ci;

--
-- Daten für Tabelle `tbl_orders`
--

INSERT INTO `tbl_orders` (`orders_id`, `customer_id`, `orders_date`, `orders_finishdate`, `racket_id`) VALUES
(1, 1, '2020-11-09', NULL, 1),
(2, 1, '2020-11-12', NULL, 1),
(3, 2, '2020-11-14', NULL, 2);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tbl_orders_cross`
--

DROP TABLE IF EXISTS `tbl_orders_cross`;
CREATE TABLE IF NOT EXISTS `tbl_orders_cross` (
  `orders_id` int NOT NULL,
  `orders_cross_tension` double NOT NULL,
  `string_cross_id` int NOT NULL,
  PRIMARY KEY (`orders_id`),
  KEY `tbl_orders_cross_tbl_strings_strings_id_fk` (`string_cross_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_german2_ci;

--
-- Daten für Tabelle `tbl_orders_cross`
--

INSERT INTO `tbl_orders_cross` (`orders_id`, `orders_cross_tension`, `string_cross_id`) VALUES
(1, 26.5, 7),
(2, 26.6, 6),
(3, 27.1, 4);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tbl_orders_detail`
--

DROP TABLE IF EXISTS `tbl_orders_detail`;
CREATE TABLE IF NOT EXISTS `tbl_orders_detail` (
  `orders_id` int NOT NULL,
  `main_strings_id` int DEFAULT NULL,
  `cross_strings_id` int DEFAULT NULL,
  `main_tension` double DEFAULT NULL,
  `cross_tension` double DEFAULT NULL,
  PRIMARY KEY (`orders_id`),
  KEY `fk_main_strings_id_idx` (`main_strings_id`),
  KEY `fk_cross_strings_id_idx` (`cross_strings_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_german2_ci;

--
-- Daten für Tabelle `tbl_orders_detail`
--

INSERT INTO `tbl_orders_detail` (`orders_id`, `main_strings_id`, `cross_strings_id`, `main_tension`, `cross_tension`) VALUES
(1, 5, 7, 23.5, 26.5),
(2, 5, 6, 24.5, 26.6),
(3, 1, 4, 25.5, 27.1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tbl_orders_main`
--

DROP TABLE IF EXISTS `tbl_orders_main`;
CREATE TABLE IF NOT EXISTS `tbl_orders_main` (
  `orders_id` int NOT NULL,
  `orders_main_tension` double NOT NULL,
  `string_main_id` int NOT NULL,
  PRIMARY KEY (`orders_id`),
  KEY `tbl_orders_main_tbl_strings_strings_id_fk` (`string_main_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_german2_ci;

--
-- Daten für Tabelle `tbl_orders_main`
--

INSERT INTO `tbl_orders_main` (`orders_id`, `orders_main_tension`, `string_main_id`) VALUES
(1, 23.5, 5),
(2, 24.1, 5),
(3, 25.5, 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tbl_racket`
--

DROP TABLE IF EXISTS `tbl_racket`;
CREATE TABLE IF NOT EXISTS `tbl_racket` (
  `racket_id` int NOT NULL AUTO_INCREMENT,
  `racket_name` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci NOT NULL,
  `racket_size` int NOT NULL,
  `racket_weight` double DEFAULT NULL,
  `racket_type` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci DEFAULT NULL,
  `brand_id` int NOT NULL,
  PRIMARY KEY (`racket_id`),
  KEY `tbl_racket_tbl_brand_brand_id_fk` (`brand_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf32 COLLATE=utf32_german2_ci;

--
-- Daten für Tabelle `tbl_racket`
--

INSERT INTO `tbl_racket` (`racket_id`, `racket_name`, `racket_size`, `racket_weight`, `racket_type`, `brand_id`) VALUES
(1, 'Pro Staff 97 RF', 97, 340, 'Pro', 2),
(2, 'Blade 98L', 98, 285, 'Pro', 2),
(3, 'Pure Aero', 100, 300, 'Pro', 5);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tbl_strings`
--

DROP TABLE IF EXISTS `tbl_strings`;
CREATE TABLE IF NOT EXISTS `tbl_strings` (
  `strings_id` int NOT NULL AUTO_INCREMENT,
  `strings_name` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci NOT NULL,
  `strings_color` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci NOT NULL,
  `strings_thickness` double NOT NULL,
  `strings_type` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci NOT NULL,
  `brand_id` int NOT NULL,
  PRIMARY KEY (`strings_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf32 COLLATE=utf32_german2_ci;

--
-- Daten für Tabelle `tbl_strings`
--

INSERT INTO `tbl_strings` (`strings_id`, `strings_name`, `strings_color`, `strings_thickness`, `strings_type`, `brand_id`) VALUES
(1, 'Kudeta', 'white', 1.25, 'Multifil', 1),
(2, 'Super Power', 'white', 1.3, 'Multifil', 1),
(3, 'Hi-Tec Mutipower', 'white', 1.3, 'Multifil', 1),
(4, 'Pure Aramid', 'yellow-black', 1.25, 'CoPoly', 1),
(5, 'Ichiban Spin Gold', 'yellow', 1.21, 'Multifil', 1),
(6, 'Cyclone Power', 'Graphite', 1.3, 'Multifil', 1),
(7, 'Hot Stuff', 'yellow', 1.4, 'CoPoly', 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `tbl_users`
--

DROP TABLE IF EXISTS `tbl_users`;
CREATE TABLE IF NOT EXISTS `tbl_users` (
  `users_id` int NOT NULL AUTO_INCREMENT,
  `users_lastname` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci NOT NULL,
  `users_firstname` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci NOT NULL,
  `users_addresse` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci NOT NULL,
  `users_addresse_nr` int DEFAULT NULL,
  `users_phone` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci DEFAULT NULL,
  `users_email` varchar(255) CHARACTER SET utf32 COLLATE utf32_german2_ci DEFAULT NULL,
  PRIMARY KEY (`users_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf32 COLLATE=utf32_german2_ci;

--
-- Daten für Tabelle `tbl_users`
--

INSERT INTO `tbl_users` (`users_id`, `users_lastname`, `users_firstname`, `users_addresse`, `users_addresse_nr`, `users_phone`, `users_email`) VALUES
(1, 'Desax', 'Gion', 'Vogelsangweg', 24, '0798270098', 'gion.desax@script-source.net'),
(2, 'Fetz', 'Patrizia', 'Vogelsangweg', 24, '0796839666', 'titsli@bluewin.ch');

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `tbl_login_users`
--
ALTER TABLE `tbl_login_users`
  ADD CONSTRAINT `tbl_login_users_tbl_login_login_id_fk` FOREIGN KEY (`login_id`) REFERENCES `tbl_login` (`login_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_login_users_tbl_users_users_id_fk` FOREIGN KEY (`users_id`) REFERENCES `tbl_users` (`users_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints der Tabelle `tbl_orders`
--
ALTER TABLE `tbl_orders`
  ADD CONSTRAINT `tbl_orders_tbl_customers_customers_id_fk` FOREIGN KEY (`customer_id`) REFERENCES `tbl_customers` (`customers_id`),
  ADD CONSTRAINT `tbl_orders_tbl_racket_racket_id_fk` FOREIGN KEY (`racket_id`) REFERENCES `tbl_racket` (`racket_id`);

--
-- Constraints der Tabelle `tbl_orders_cross`
--
ALTER TABLE `tbl_orders_cross`
  ADD CONSTRAINT `tbl_orders_cross_tbl_orders_orders_id_fk` FOREIGN KEY (`orders_id`) REFERENCES `tbl_orders` (`orders_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_orders_cross_tbl_strings_strings_id_fk` FOREIGN KEY (`string_cross_id`) REFERENCES `tbl_strings` (`strings_id`);

--
-- Constraints der Tabelle `tbl_orders_detail`
--
ALTER TABLE `tbl_orders_detail`
  ADD CONSTRAINT `fk_cross_strings_id` FOREIGN KEY (`cross_strings_id`) REFERENCES `tbl_strings` (`strings_id`),
  ADD CONSTRAINT `fk_main_strings_id` FOREIGN KEY (`main_strings_id`) REFERENCES `tbl_strings` (`strings_id`),
  ADD CONSTRAINT `fk_orders_id` FOREIGN KEY (`orders_id`) REFERENCES `tbl_orders` (`orders_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints der Tabelle `tbl_orders_main`
--
ALTER TABLE `tbl_orders_main`
  ADD CONSTRAINT `tbl_orders_main_tbl_orders_orders_id_fk` FOREIGN KEY (`orders_id`) REFERENCES `tbl_orders` (`orders_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_orders_main_tbl_strings_strings_id_fk` FOREIGN KEY (`string_main_id`) REFERENCES `tbl_strings` (`strings_id`);

--
-- Constraints der Tabelle `tbl_racket`
--
ALTER TABLE `tbl_racket`
  ADD CONSTRAINT `tbl_racket_tbl_brand_brand_id_fk` FOREIGN KEY (`brand_id`) REFERENCES `tbl_brand` (`brand_id`);
COMMIT;
