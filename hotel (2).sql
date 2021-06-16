-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 11, 2020 at 03:36 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'Pranavan', '123');

-- --------------------------------------------------------

--
-- Table structure for table `banquet`
--

CREATE TABLE `banquet` (
  `id` int(11) NOT NULL,
  `guest` varchar(110) NOT NULL,
  `mobile` int(11) NOT NULL,
  `additional` varchar(666) NOT NULL,
  `decoration` varchar(100) NOT NULL,
  `Date` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `banquet`
--

INSERT INTO `banquet` (`id`, `guest`, `mobile`, `additional`, `decoration`, `Date`) VALUES
(1, 'Raja', 778954562, 'Music Band', 'Grand', '22/08/2021'),
(3, 'Tempor harum aliquam', 9, 'Inventore qui ullamc', 'Nesciunt mollitia l', '1998-03-02'),
(4, 'Pranavan', 779563652, 'high', 'music', '22/10/2020');

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `id` int(11) NOT NULL,
  `employeename` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `mobile` int(11) NOT NULL,
  `position` varchar(50) DEFAULT NULL,
  `Salary` int(50) DEFAULT NULL,
  `joineddate` varchar(50) DEFAULT NULL,
  `filename` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`id`, `employeename`, `address`, `mobile`, `position`, `Salary`, `joineddate`, `filename`, `path`) VALUES
(1, 'Kajan', 'Jaffna', 77456324, 'Senior', 45000, '22/02/2015', '', ''),
(7, 'Charles Burt', 'Et vel qui molestiae', 779563651, 'Manager', 500000, '23-Mar-2006', 'pexels-photo-1149137.jpeg', 'D:\\Users\\PC\\eclipse-workspace\\Test2\\WebContent\\EmpImg\\pexels-photo-1149137.jpeg'),
(8, 'Charles Burt', 'Et vel qui molestiae', 779563651, 'Manager', 500000, '23-Mar-2006', 'pexels-photo-1149137.jpeg', 'D:\\Users\\PC\\eclipse-workspace\\Test2\\WebContent\\EmpImg\\pexels-photo-1149137.jpeg'),
(9, 'Charles Burt', 'Vero eos vitae et qu', 55, 'Manager', 500000, '23-Mar-2006', 'VELWNXXpexels-photo-1149137.jpeg', '/Test2/images/rooms/VELWNXXpexels-photo-1149137.jpeg');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `id` int(3) NOT NULL,
  `inventoryname` varchar(120) NOT NULL,
  `suppliername` varchar(220) NOT NULL,
  `supllierid` int(3) NOT NULL,
  `supplierdate` varchar(220) NOT NULL,
  `quantity` int(3) NOT NULL,
  `price` int(3) NOT NULL,
  `filename` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`id`, `inventoryname`, `suppliername`, `supllierid`, `supplierdate`, `quantity`, `price`, `filename`, `path`) VALUES
(1, 'Inventory1', 'Supplier1', 1, '22/2/2020', 200, 2000, '', ''),
(5, 'Kennan Dejesus', 'Jordan Hardin', 1, '07-Jun-1981', 662, 176, 'ppQthYS.jpg', 'D:\\Users\\PC\\eclipse-workspace\\Test2\\WebContent\\Veichleimg\\ppQthYS.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `restaurant`
--

CREATE TABLE `restaurant` (
  `id` int(11) NOT NULL,
  `user` varchar(60) NOT NULL,
  `juice` varchar(100) NOT NULL,
  `main` varchar(1500) NOT NULL,
  `dessert` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `restaurant`
--

INSERT INTO `restaurant` (`id`, `user`, `juice`, `main`, `dessert`) VALUES
(5, 'Pranavan', 'Banana Juice', 'seasonalfish', 'seasonalfish');

-- --------------------------------------------------------

--
-- Table structure for table `events`
--

CREATE TABLE `events` (
  `id` int(11) NOT NULL,
  `eventtype` varchar(200) DEFAULT NULL,
  `NoHours` int(11) NOT NULL,
  `Facilities` varchar(200) NOT NULL,
  `CostPerHour` int(11) NOT NULL,
  `filename` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `events`
--

INSERT INTO `events` (`id`, `eventtype`, `NoHours`, `Facilities`, `CostPerHour`, `filename`, `path`) VALUES
(13, 'Normal', 1, 'Tv', 1000, 'Deluxe-Room-at-Yara-Galle-Fort.jpg', 'D:\\Users\\PC\\eclipse-workspace\\Test2\\WebContent\\RoomImg\\Deluxe-Room-at-Yara-Galle-Fort.jpg'),
(14, 'Luxary', 2, 'Tv , Ac , Wifi ', 5000, 'images.jpg', 'D:\\Users\\PC\\eclipse-workspace\\Test2\\WebContent\\RoomImg\\images.jpg'),
(15, 'Luxary', 2, 'Tv , Ac , Wifi ', 5000, '205684046.jpg', 'D:\\Users\\PC\\eclipse-workspace\\Test2\\WebContent\\RoomImg\\205684046.jpg'),
(16, 'Luxary', 2, 'Tv , Ac , Wifi ', 5500, 'Superior-Room-1.jpg', 'D:\\Users\\PC\\eclipse-workspace\\Test2\\WebContent\\RoomImg\\Superior-Room-1.jpg'),
(17, 'Luxary', 2, 'Tv , Ac , Wifi ', 10000, 'rose-floor-rooms-mob-header-1-1.jpg', 'D:\\Users\\PC\\eclipse-workspace\\Test2\\WebContent\\RoomImg\\rose-floor-rooms-mob-header-1-1.jpg'),
(18, 'Luxary', 3, 'Tv , Ac , Wifi ', 4000, '102951494.jpg', 'D:\\Users\\PC\\eclipse-workspace\\Test2\\WebContent\\RoomImg\\102951494.jpg'),
(19, 'room2', 3, 'Tv , Ac , Wifi ', 5000, 'rose-floor-rooms-mob-header-1-1.jpg', 'D:\\Users\\PC\\eclipse-workspace\\Test2\\WebContent\\RoomImg\\rose-floor-rooms-mob-header-1-1.jpg'),
(20, 'room3', 5, 'Tv , Ac , Wifi ', 5000, 'rose-floor-rooms-mob-header-1-1.jpg', 'D:\\Users\\PC\\eclipse-workspace\\Test2\\WebContent\\RoomImg\\rose-floor-rooms-mob-header-1-1.jpg'),
(21, 'room', 5, 'Tv , Ac , Wifi ', 5000, '205684046.jpg', 'C:\\Users\\94779\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\Test2\\\\images\\205684046.jpg'),
(22, 'Luxary', 5, 'Tv , Ac , Wifi ', 5000, '205684046.jpg', 'C:\\Users\\94779\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\Test2\\\\images205684046.jpg'),
(23, 'Luxary', 5, 'Tv , Ac , Wifi ', 5000, 'rose-floor-rooms-mob-header-1-1.jpg', 'C:\\Users\\94779\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\Test2\\\\imagesrose-floor-rooms-mob-header-1-1.jpg'),
(24, 'Luxary', 5, 'Tv , Ac , Wifi ', 4000, '102951494.jpg', 'C:\\Users\\94779\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\Test2\\images102951494.jpg'),
(25, 'room', 5, 'Tv , Ac , Wifi ', 5000, 'Deluxe-Room-at-Yara-Galle-Fort.jpg', 'C:\\Users\\94779\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\Test2\\imagesDeluxe-Room-at-Yara-Galle-Fort.jpg'),
(26, 'room', 1, 'Hybrid', 25000000, 'Superior-Room-1.jpg', 'C:\\Users\\94779\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\Test2\\\\images\\Superior-Room-1.jpg'),
(27, 'Luxary', 5, 'Tv , Ac , Wifi ', 5000, 'Superior-Room-1.jpg', 'C:\\Users\\94779\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\Test2\\\\imagesSuperior-Room-1.jpg'),
(28, 'room', 5, 'Tv , Ac , Wifi ', 5000, 'Deluxe-Room-at-Yara-Galle-Fort.jpg', 'C:\\Users\\94779\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\Test2\\\\imagesDeluxe-Room-at-Yara-Galle-Fort.jpg'),
(29, 'room', 252, 'Tv , Ac , Wifi ', 2500, 'Superior-Room-1.jpg', 'C:\\Users\\94779\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\Test2\\\\images\\Superior-Room-1.jpg'),
(30, 'room', 2, 'Tv , Ac , Wifi ', 5000, 'Superior-Room-1.jpg', 'C:\\Users\\94779\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\Test2\\\\images\\Superior-Room-1.jpg'),
(31, 'Luxary', 5, 'Tv , Ac , Wifi ', 4000, 'download.jpg', 'C:\\Users\\94779\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\Test2\\\\images\\download.jpg'),
(32, 'Hello', 5, 'Tv , Ac , Wifi ', 1000, 'ppQthYS.jpg', '\\images/rooms\\ppQthYS.jpg'),
(33, 'Ea nihil vel placeat', 5, 'Qui aliquam optio a', 555, 'Tata-Tiago-image-dynamic-performance.jpg', '\\images\\rooms\\Tata-Tiago-image-dynamic-performance.jpg'),
(34, 'room', 2, 'Tv , Ac , Wifi ', 1000, 'QQIZNMX', '\\Test2\\images\\rooms\\QQIZNMX'),
(35, 'room25', 2, 'Tv , Ac , Wifi ', 5000, 'QSXEZZMdepositphotos_205697786-stock-photo-chiangmai-thailand-july-2018-private.jpg', '\\Test2\\images\\rooms\\QSXEZZMdepositphotos_205697786-stock-photo-chiangmai-thailand-july-2018-private.jpg'),
(36, 'room45', 5, 'Tv , Ac , Wifi ', 4000, 'download.jpg', '\\Test2\\images\\rooms\\download.jpg'),
(37, 'room2565', 2, 'Tv , Ac , Wifi ', 5500, 'pexels-photo-1149137.jpeg', ';Test2\\images\\rooms;pexels-photo-1149137.jpeg'),
(38, 'room456', 5, 'Tv , Ac , Wifi ', 4000, 'ba3103ed38f01ed59ba153a1941362d0.png', 'Test2;images\\rooms;ba3103ed38f01ed59ba153a1941362d0.png'),
(39, 'room', 5, 'Tv , Ac , Wifi ', 5000, 'download.jpg', 'Test2/images\\rooms/download.jpg'),
(40, 'room4652', 5, 'Tv , Ac , Wifi ', 5000, 'FHYHZOEcuba-1197800__340.jpgcuba-1197800__340.jpg', 'Test2/images\\rooms/cuba-1197800__340.jpg'),
(41, 'Luxary', 3, 'Tv , Ac , Wifi ', 4000, 'LRDUEYKpexels-photo-1149137.jpegpexels-photo-1149137.jpeg', 'LRDUEYKpexels-photo-1149137.jpegTest2/images\\rooms/pexels-photo-1149137.jpeg'),
(42, 'Sed fu', 5, 'Id officiis et sit', 5, 'KHHJZNMphoto-1494976388531-d1058494cdd8.jpgphoto-1494976388531-d1058494cdd8.jpg', 'KHHJZNMphoto-1494976388531-d1058494cdd8.jpgTest2/images/rooms/photo-1494976388531-d1058494cdd8.jpg'),
(43, 'Luxary', 5, 'Tv , Ac , Wifi ', 4000, 'ECLXFJYrose-floor-rooms-mob-header-1-1.jpgrose-floor-rooms-mob-header-1-1.jpg', 'ECLXFJYrose-floor-rooms-mob-header-1-1.jpgTest2/images/rooms/rose-floor-rooms-mob-header-1-1.jpg'),
(44, 'Luxary', 5, 'Tv , Ac , Wifi ', 5000, 'BUAHNPCimages.jpg', 'Test2/images/rooms/images.jpg'),
(45, 'Luxary12', 5, 'Tv , Ac , Wifi ', 5000, 'KVIOHPOrose-floor-rooms-mob-header-1-1.jpg', 'Test2/images/rooms/KVIOHPOrose-floor-rooms-mob-header-1-1.jpg'),
(46, 'room', 5, 'asdfghj', 5000, 'QPGJBZLDeluxe-Room-at-Yara-Galle-Fort.jpg', '/Test2/images/rooms/QPGJBZLDeluxe-Room-at-Yara-Galle-Fort.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `eventsbooking`
--

CREATE TABLE `eventsbooking` (
  `id` int(11) NOT NULL,
  `User` varchar(100) NOT NULL,
  `Nic` varchar(15) NOT NULL,
  `mobile` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `eventdate` varchar(60) NOT NULL,
  `paymentdate` varchar(60) NOT NULL,
  `noofhours` int(11) NOT NULL,
  `guestmembers` int(11) NOT NULL,
  `AdvancedPayment` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `eventsbooking`
--

INSERT INTO `eventsbooking` (`id`, `User`, `Nic`, `mobile`, `email`, `eventdate`, `paymentdate`, `noofhours`, `guestmembers`, `AdvancedPayment`) VALUES
(1, 'Kirujan', '9702839936V', 778954562, 'nkiru@gmail.com', '22-01-2019', '25-01-2019', 5, 4, 1000),
(4, 'Est optio ullamco q', 'fhjk,', 5, 'wurifimun@mailinator.com', 'Ab sunt placeat et ', 'Mollit qui excepturi', 5, 5, 5),
(5, 'Maxime voluptates qu', 'Quia ali', 95, 'pyxe@mailinator.com', '1974-11-28', 'Rerum ipsum dolores ', 10, 68, 22),
(6, 'Pranavan ', '46004266565', 70323231, 'np@gmail.com', '22/10/2020', '22/10/2020', 5, 15, 5000);

-- --------------------------------------------------------

--
-- Table structure for table `transport`
--

CREATE TABLE `transport` (
  `id` int(11) NOT NULL,
  `v_name` varchar(60) NOT NULL,
  `facilities` varchar(60) NOT NULL,
  `costperday` int(11) NOT NULL,
  `veichletype` varchar(60) NOT NULL,
  `filename` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transport`
--

INSERT INTO `transport` (`id`, `v_name`, `facilities`, `costperday`, `veichletype`, `filename`, `path`) VALUES
(5, 'Anjolie Velez', 'Ut alias minim est ', 25, 'Vero officiis dolor ', 'photo-1494976388531-d1058494cdd8.jpg', 'D:\\Users\\PC\\eclipse-workspace\\Test2\\WebContent\\Veichleimg\\photo-1494976388531-d1058494cdd8.jpg'),
(6, 'TROPMVPpexels-photo-1149137.jpeg', 'Tv , Ac , Wifi ', 5000, 'HYbrid', 'TROPMVPpexels-photo-1149137.jpeg', '/Test2/images/rooms/TROPMVPpexels-photo-1149137.jpeg');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `fullname` varchar(600) NOT NULL,
  `username` varchar(60) NOT NULL,
  `mobile` int(12) NOT NULL,
  `address` varchar(600) NOT NULL,
  `mail` varchar(600) NOT NULL,
  `password` varchar(600) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `fullname`, `username`, `mobile`, `address`, `mail`, `password`) VALUES
(1, 'Prana', 'Pranavan', 772654544, 'jaffna', 'np@gmail.com', '1234'),
(2, 'Allistair Randall', 'raja', 55, 'Qui dolore est sint', 'asd@gmail.com', '1234 ');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(3) NOT NULL,
  `name` varchar(120) NOT NULL,
  `email` varchar(220) NOT NULL,
  `country` varchar(120) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `veichlereservation`
--

CREATE TABLE `veichlereservation` (
  `id` int(11) NOT NULL,
  `User` varchar(50) NOT NULL,
  `Nic` varchar(50) NOT NULL,
  `mobile` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `checkin` varchar(50) NOT NULL,
  `km` int(11) NOT NULL,
  `cost` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `veichlereservation`
--

INSERT INTO `veichlereservation` (`id`, `User`, `Nic`, `mobile`, `email`, `checkin`, `km`, `cost`) VALUES
(1, 'Ducimus ipsa anim ', '076565', 5, 'himecupax@mailinator.com', '22', 45, 4000),
(2, 'Pranavan ', '546032065V', 77852654, 'np@gmail.com', '22/10/2020', 20, 20000),
(3, 'Pranavan ', '546032065V', 77852654, 'np@gmail.com', '22/10/2020', 20, 20000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `banquet`
--
ALTER TABLE `banquet`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `restaurant`
--
ALTER TABLE `restaurant`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `events`
--
ALTER TABLE `events`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `eventsbooking`
--
ALTER TABLE `eventsbooking`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transport`
--
ALTER TABLE `transport`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `veichlereservation`
--
ALTER TABLE `veichlereservation`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `banquet`
--
ALTER TABLE `banquet`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `employees`
--
ALTER TABLE `employees`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `restaurant`
--
ALTER TABLE `restaurant`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `events`
--
ALTER TABLE `events`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT for table `eventsbooking`
--
ALTER TABLE `eventsbooking`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `transport`
--
ALTER TABLE `transport`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `veichlereservation`
--
ALTER TABLE `veichlereservation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
