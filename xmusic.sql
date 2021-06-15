-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2021 at 09:28 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `xmusic`
--

-- --------------------------------------------------------

--
-- Table structure for table `acces`
--

CREATE TABLE `acces` (
  `Id` varchar(20) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Company` varchar(50) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price` float NOT NULL,
  `Sprice` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `acces`
--

INSERT INTO `acces` (`Id`, `Name`, `Company`, `Quantity`, `Price`, `Sprice`) VALUES
('T01', 'Test01', 'Test01', 98, 9000, 10000),
('T02', 'Test02', 'Test02', 99, 7000, 7000);

-- --------------------------------------------------------

--
-- Table structure for table `addrepire`
--

CREATE TABLE `addrepire` (
  `Name` varchar(20) NOT NULL,
  `ID` varchar(15) NOT NULL,
  `Gmail` varchar(30) NOT NULL,
  `Address` varchar(250) NOT NULL,
  `Telephone` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `addrepire`
--

INSERT INTO `addrepire` (`Name`, `ID`, `Gmail`, `Address`, `Telephone`) VALUES
('Test1', '11111', 'Test1@gmail.com', 'Test02', 1123456789),
('bhhh', 'hhhhh', 'hhhh', 'hhhh', 5555),
('test1', 't1', 'tset@gmail.com', 'tes		t', 1111111111);

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `ID` varchar(30) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Company` varchar(30) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price` float NOT NULL,
  `Sprice` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`ID`, `Name`, `Company`, `Quantity`, `Price`, `Sprice`) VALUES
('T01', 'Test01', 'Test01', 47, 8000, 10000),
('T02', 'Test02', 'Test02', 96, 15000, 15000);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Id` varchar(10) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Id`, `Password`) VALUES
('1', '123'),
('2', '12345'),
('t1', '1234567890');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `Id` varchar(20) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Company` varchar(30) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `No` int(11) NOT NULL,
  `TDate` date NOT NULL,
  `ID` varchar(20) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Price` float NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `report`
--

INSERT INTO `report` (`No`, `TDate`, `ID`, `Name`, `Price`, `Quantity`, `Total`) VALUES
(1, '2021-06-05', 'T01', 'Test01', 1000, 1, 1000),
(2, '2021-06-05', 'T01', 'Test01', 1000, 4, 4000),
(3, '2021-06-05', 'T01', 'Test01', 1000, 2, 2000),
(4, '2021-06-06', 'T01', 'Test01', 1000, 4, 4000),
(5, '2021-06-08', 'T01', 'Test01', 10000, 1, 10000),
(6, '2021-06-08', 'T01', 'Test01', 10000, 1, 10000),
(7, '2021-06-08', 'T01', 'Test01', 10000, 1, 10000),
(8, '2021-06-09', 'T01', 'Test01', 10000, 1, 10000),
(9, '2021-06-09', 'T01', 'Test01', 10000, 1, 10000),
(10, '2021-06-09', 'T01', 'Test01', 10000, 1, 10000),
(11, '2021-06-09', 'T01', 'Test01', 10000, 1, 10000),
(12, '2021-06-09', 'T01', 'Test01', 10000, 1, 10000),
(13, '2021-06-09', 'T01', 'Test01', 10000, 1, 10000),
(14, '2021-06-10', 'T01', 'Test01', 10000, 1, 10000),
(15, '2021-06-10', 'x', 'ss', 44, 10, 440),
(16, '2021-06-10', 'x', 'ss', 44, 1, 44),
(17, '2021-06-10', 'T01', 'Test01', 10000, 1, 10000),
(18, '2021-06-10', 'T02', 'Test02', 15000, 1, 15000),
(19, '2021-06-10', 'T01', 'Test01', 10000, 1, 10000),
(20, '2021-06-10', 'T02', 'Test02', 15000, 1, 15000),
(21, '2021-06-10', 'T02', 'Test02', 15000, 1, 15000),
(22, '2021-06-10', 'T01', 'Test01', 10000, 1, 10000),
(23, '2021-06-10', 'T01', 'Test01', 10000, 1, 10000),
(24, '2021-06-10', 'T02', 'Test02', 7000, 1, 7000),
(25, '2021-06-10', 'T01', 'Test01', 10000, 1, 10000),
(26, '2021-06-10', 'T02', 'Test02', 15000, 1, 15000);

-- --------------------------------------------------------

--
-- Table structure for table `reqrepire`
--

CREATE TABLE `reqrepire` (
  `Name` varchar(30) NOT NULL,
  `ID` varchar(20) NOT NULL,
  `Gmail` varchar(30) NOT NULL,
  `Address` varchar(250) NOT NULL,
  `Telephone` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reqrepire`
--

INSERT INTO `reqrepire` (`Name`, `ID`, `Gmail`, `Address`, `Telephone`) VALUES
('Test02', '11111', 'Test02@gmail.com', 'Test02	', 1234567890);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `acces`
--
ALTER TABLE `acces`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `addrepire`
--
ALTER TABLE `addrepire`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`No`);

--
-- Indexes for table `reqrepire`
--
ALTER TABLE `reqrepire`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `report`
--
ALTER TABLE `report`
  MODIFY `No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
