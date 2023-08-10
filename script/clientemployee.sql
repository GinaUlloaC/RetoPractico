-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-08-2023 a las 06:40:50
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clientemployee`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `client`
--

CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `account` varchar(20) NOT NULL,
  `date` date NOT NULL,
  `appointment` varchar(50) DEFAULT NULL,
  `balance_account` double DEFAULT NULL,
  `number_client` int(11) DEFAULT NULL,
  `type_account` varchar(255) DEFAULT NULL,
  `is_employee` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci COMMENT='Almacena clientes y empleados';

--
-- Volcado de datos para la tabla `client`
--

INSERT INTO `client` (`id`, `name`, `lastname`, `age`, `account`, `date`, `appointment`, `balance_account`, `number_client`, `type_account`, `is_employee`) VALUES
(1002870812, 'Gina', 'Ulloa', 36, '12345678', '2023-08-09', NULL, 10, 11111111, 'SAVINGS', b'0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movements`
--

CREATE TABLE `movements` (
  `id` int(11) NOT NULL,
  `value` double NOT NULL,
  `detail` varchar(50) NOT NULL,
  `type_movement` varchar(255) NOT NULL,
  `id_client` int(11) NOT NULL,
  `number_client` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci COMMENT='Movimientos de los clientes y empleados';

--
-- Volcado de datos para la tabla `movements`
--

INSERT INTO `movements` (`id`, `value`, `detail`, `type_movement`, `id_client`, `number_client`) VALUES
(1, 100, 'Depósito en caja', 'DEPOSITO', 1002870812, 11111111),
(2, 2, 'Depósito en caja', 'DEPOSITO', 1002870812, 11111111);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `movements`
--
ALTER TABLE `movements`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
