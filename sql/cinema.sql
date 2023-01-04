-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 25, 2022 at 07:15 PM
-- Server version: 5.7.24-log
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cinema`
--

-- --------------------------------------------------------

--
-- Table structure for table `action movie`
--

CREATE TABLE `action movie` (
  `film name` varchar(60) NOT NULL,
  `Movie  rate` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `action movie`
--

INSERT INTO `action movie` (`film name`, `Movie  rate`) VALUES
('batman', 'rated'),
('ben10', 'PG'),
('hitman', 'R');

-- --------------------------------------------------------

--
-- Table structure for table `actors`
--

CREATE TABLE `actors` (
  `id` int(11) NOT NULL,
  `class` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `actors`
--

INSERT INTO `actors` (`id`, `class`) VALUES
(11, 'pro'),
(22, 'pro'),
(33, 'combars'),
(44, 'combars'),
(55, 'pro'),
(66, 'pro');

-- --------------------------------------------------------

--
-- Table structure for table `cinema`
--

CREATE TABLE `cinema` (
  `CNAME` varchar(60) NOT NULL,
  `capacity` int(11) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `Tickets sold` int(11) DEFAULT NULL,
  `Cinema rate` float DEFAULT NULL,
  `No screens` int(11) DEFAULT NULL,
  `movieSched` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cinema`
--

INSERT INTO `cinema` (`CNAME`, `capacity`, `location`, `Tickets sold`, `Cinema rate`, `No screens`, `movieSched`) VALUES
('el-cima', 85, 'cairo', 85, 9.8, 12, 'all dayes'),
('goma', 100, 'alex', 80, 8, 11, 'all dayes'),
('moro', 37, 'giza', 20, 6.2, 3, 'mondayonly'),
('nemo', 20, 'cairo', 30, 7.3, 6, 'all dayes'),
('oplex', 50, 'suez', 25, 6.2, 5, 'all dayes'),
('shahed', 50, 'cairo', 30, 7.9, 5, 'mondayonly');

-- --------------------------------------------------------

--
-- Table structure for table `comedy movie`
--

CREATE TABLE `comedy movie` (
  `film name` varchar(60) NOT NULL,
  `subgenres` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `comedy movie`
--

INSERT INTO `comedy movie` (`film name`, `subgenres`) VALUES
('the fish', 'Dark Comedy '),
('zbider man', 'Action Comedy');

-- --------------------------------------------------------

--
-- Table structure for table `crew`
--

CREATE TABLE `crew` (
  `Id` int(11) NOT NULL,
  `salary` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `crew`
--

INSERT INTO `crew` (`Id`, `salary`, `name`) VALUES
(8, 7000, 'ibrahim'),
(9, 2000, 'mostafa'),
(10, 3000, 'mostafa'),
(11, 5000, 'hoda'),
(22, 3000, 'ahmed'),
(33, 8000, 'ahmed'),
(44, 2000, 'omar'),
(55, 9000, 'fady'),
(66, 8000, 'tamer'),
(77, 5000, 'ahmed');

-- --------------------------------------------------------

--
-- Table structure for table `director`
--

CREATE TABLE `director` (
  `id` int(11) NOT NULL,
  `Style` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `director`
--

INSERT INTO `director` (`id`, `Style`) VALUES
(8, 'The creative artist'),
(77, 'The negotiator');

-- --------------------------------------------------------

--
-- Table structure for table `drama movie`
--

CREATE TABLE `drama movie` (
  `film name` varchar(60) NOT NULL,
  `Level of drama` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `drama movie`
--

INSERT INTO `drama movie` (`film name`, `Level of drama`) VALUES
('lion king', 'farce'),
('nights', 'musical drama');

-- --------------------------------------------------------

--
-- Table structure for table `film`
--

CREATE TABLE `film` (
  `filmname` varchar(60) NOT NULL,
  `country` varchar(45) DEFAULT NULL,
  `released year` varchar(45) DEFAULT NULL,
  `language` varchar(45) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `film`
--

INSERT INTO `film` (`filmname`, `country`, `released year`, `language`, `cid`) VALUES
('batman', 'us', '2009', 'english', 8),
('ben10', 'qatar', '2020', 'arabic', 10),
('hitman', 'egypt', '2015', 'arabic', 10),
('lion king', 'england', '2000', 'english', 8),
('nights', 'us', '2010', 'english', 9),
('the fish', 'brazil', '1950', 'english', 10),
('zbider man', 'egypt', '2022', 'arabic', 9);

-- --------------------------------------------------------

--
-- Table structure for table `producer`
--

CREATE TABLE `producer` (
  `id` int(11) NOT NULL,
  `Level of casting` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `producer`
--

INSERT INTO `producer` (`id`, `Level of casting`) VALUES
(9, 'class S'),
(10, 'class B');

-- --------------------------------------------------------

--
-- Table structure for table `rate`
--

CREATE TABLE `rate` (
  `Film name` varchar(60) NOT NULL,
  `User id` int(11) NOT NULL,
  `Rating comments` varchar(45) DEFAULT NULL,
  `Rating no` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `rate`
--

INSERT INTO `rate` (`Film name`, `User id`, `Rating comments`, `Rating no`) VALUES
('batman', 1, 'very angry', 998),
('batman', 2, 'habby', 985),
('batman', 3, 'angry', 980),
('lion king', 8, 'habby', 973),
('lion king', 9, 'habby', 915);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `User id` int(11) NOT NULL,
  `interests` varchar(45) DEFAULT NULL,
  `User Country` varchar(45) DEFAULT NULL,
  `Watched Shows` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `repeats of attendance` int(11) DEFAULT NULL,
  `film attended` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`User id`, `interests`, `User Country`, `Watched Shows`, `age`, `repeats of attendance`, `film attended`) VALUES
(1, 'comedy', 'egypt', 'zbider/the fish', 20, 2, 'batman'),
(2, 'comedy', 'us', 'zbider/ben10', 22, 1, 'batman'),
(3, 'action', 'egypt', 'zbider/the fish', 17, 1, 'batman'),
(4, 'action', 'us', 'ben10/nights', 16, 8, 'the fish'),
(5, 'comedy', 'us', 'zbider/batman', 28, 1, 'nights'),
(6, 'comedy', 'brazil', 'zbider/hitman', 30, 3, 'nights'),
(7, 'drama', 'egypt', 'zbider/the fish', 52, 1, 'lion king'),
(8, 'drama', 'egypt', 'zbider/the fish', 49, 1, 'lion king'),
(9, 'drama', 'us', 'zbider/the fish', 62, 6, 'lion king');

-- --------------------------------------------------------

--
-- Table structure for table `watched on`
--

CREATE TABLE `watched on` (
  `User id` int(11) NOT NULL,
  `Cname` varchar(60) NOT NULL,
  `no of visits` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `watched on`
--

INSERT INTO `watched on` (`User id`, `Cname`, `no of visits`) VALUES
(1, 'goma', 2),
(2, 'shahed', 1),
(3, 'nemo', 1),
(4, 'oplex', 8),
(5, 'oplex', 1),
(6, 'nemo', 3),
(7, 'shahed', 1),
(8, 'shahed', 1),
(9, 'goma', 6);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `action movie`
--
ALTER TABLE `action movie`
  ADD PRIMARY KEY (`film name`);

--
-- Indexes for table `actors`
--
ALTER TABLE `actors`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cinema`
--
ALTER TABLE `cinema`
  ADD PRIMARY KEY (`CNAME`);

--
-- Indexes for table `comedy movie`
--
ALTER TABLE `comedy movie`
  ADD PRIMARY KEY (`film name`);

--
-- Indexes for table `crew`
--
ALTER TABLE `crew`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `director`
--
ALTER TABLE `director`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `drama movie`
--
ALTER TABLE `drama movie`
  ADD PRIMARY KEY (`film name`);

--
-- Indexes for table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`filmname`),
  ADD KEY `cid_idx` (`cid`);

--
-- Indexes for table `producer`
--
ALTER TABLE `producer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rate`
--
ALTER TABLE `rate`
  ADD PRIMARY KEY (`Film name`,`User id`),
  ADD KEY `user id_idx` (`User id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`User id`),
  ADD KEY `film name_idx` (`film attended`);

--
-- Indexes for table `watched on`
--
ALTER TABLE `watched on`
  ADD PRIMARY KEY (`User id`,`Cname`),
  ADD KEY `cname_idx` (`Cname`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `action movie`
--
ALTER TABLE `action movie`
  ADD CONSTRAINT `afname` FOREIGN KEY (`film name`) REFERENCES `film` (`filmname`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `actors`
--
ALTER TABLE `actors`
  ADD CONSTRAINT `actorid` FOREIGN KEY (`id`) REFERENCES `crew` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `comedy movie`
--
ALTER TABLE `comedy movie`
  ADD CONSTRAINT `cfname` FOREIGN KEY (`film name`) REFERENCES `film` (`filmname`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `director`
--
ALTER TABLE `director`
  ADD CONSTRAINT `directorid` FOREIGN KEY (`id`) REFERENCES `crew` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `drama movie`
--
ALTER TABLE `drama movie`
  ADD CONSTRAINT `dfname` FOREIGN KEY (`film name`) REFERENCES `film` (`filmname`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `film`
--
ALTER TABLE `film`
  ADD CONSTRAINT `cid` FOREIGN KEY (`cid`) REFERENCES `crew` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `producer`
--
ALTER TABLE `producer`
  ADD CONSTRAINT `producerid` FOREIGN KEY (`id`) REFERENCES `crew` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `rate`
--
ALTER TABLE `rate`
  ADD CONSTRAINT `film name` FOREIGN KEY (`Film name`) REFERENCES `film` (`filmname`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `user id` FOREIGN KEY (`User id`) REFERENCES `user` (`User id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `attended name` FOREIGN KEY (`film attended`) REFERENCES `film` (`filmname`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `watched on`
--
ALTER TABLE `watched on`
  ADD CONSTRAINT `cinema name` FOREIGN KEY (`Cname`) REFERENCES `cinema` (`CNAME`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `uid` FOREIGN KEY (`User id`) REFERENCES `user` (`User id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
