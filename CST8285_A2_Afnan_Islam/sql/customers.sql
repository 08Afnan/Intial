/**
 * Afnan Islam
 * Id: 041082073
 * Description:  creating the database structure by creating a table 
 * with required information to get the information 
 * of customers
 * Assignment 2
 */
--
-- Database: `demo` and php web application user
CREATE DATABASE cemo;
GRANT USAGE ON *.* TO 'appuser'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON cemo.* TO 'appuser'@'localhost';
FLUSH PRIVILEGES;

USE cemo;
--
-- Table structure for table `employees`
--

CREATE TABLE IF NOT EXISTS `customers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `address` varchar(255) NOT NULL,
  `payment` int(10) NOT NULL,
  `service` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `employees`
--

INSERT INTO `customers` (`id`, `name`, `address`, `payment`, `service`) VALUES
(1, 'Roland Mendel', 'C/ Araquil, 67, Madrid', 5000, '<img src="\pic\images.jpeg">'),
(2, 'Victoria Ashworth', '35 King George, London', 6500,  '<img src="\pic\images.jpeg">'),
(3, 'Martin Blank', '25, Rue Lauriston, Paris', 8000,  '<img src="\pic\images.jpeg">');

