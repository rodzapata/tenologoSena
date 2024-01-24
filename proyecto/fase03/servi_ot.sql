-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-01-2024 a las 19:30:47
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `servi_ot`
--
CREATE DATABASE IF NOT EXISTS `servi_ot` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `servi_ot`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actividades`
--

DROP TABLE IF EXISTS `actividades`;
CREATE TABLE `actividades` (
  `id_actividad` int(10) NOT NULL,
  `descrip` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `nitced` int(10) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `direccion` varchar(80) NOT NULL,
  `celular` varchar(50) NOT NULL,
  `correo` varchar(80) NOT NULL,
  `estado` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipos`
--

DROP TABLE IF EXISTS `equipos`;
CREATE TABLE `equipos` (
  `id_equipo` varchar(10) NOT NULL,
  `tipo_equipo` decimal(10,0) NOT NULL,
  `nitced` int(10) NOT NULL,
  `id_refrigerante` int(10) NOT NULL,
  `fecha_instalacion` datetime NOT NULL,
  `fecha_garantia` datetime NOT NULL,
  `estado` decimal(10,0) NOT NULL,
  `altura` decimal(10,0) DEFAULT NULL,
  `ancho` decimal(10,0) DEFAULT NULL,
  `profundidad` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ot`
--

DROP TABLE IF EXISTS `ot`;
CREATE TABLE `ot` (
  `consecutivo` int(10) NOT NULL,
  `tipo` decimal(10,0) NOT NULL,
  `fecha` datetime NOT NULL,
  `fecha_venc` datetime NOT NULL,
  `id_equipo` varchar(10) NOT NULL,
  `nitCliente` int(10) NOT NULL,
  `observa_antes` varchar(250) NOT NULL,
  `observa_despues` varchar(250) NOT NULL,
  `prioridad` int(10) NOT NULL,
  `ok_cliente` decimal(10,0) NOT NULL,
  `id_usuario` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `otdetalle`
--

DROP TABLE IF EXISTS `otdetalle`;
CREATE TABLE `otdetalle` (
  `consecutivo` int(10) NOT NULL,
  `id_actividad` int(10) NOT NULL,
  `resp_actividad` varchar(80) NOT NULL,
  `id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `refrigerante`
--

DROP TABLE IF EXISTS `refrigerante`;
CREATE TABLE `refrigerante` (
  `id_refrigerante` int(10) NOT NULL,
  `nombRefrigerante` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuestos`
--

DROP TABLE IF EXISTS `respuestos`;
CREATE TABLE `respuestos` (
  `id_repuesto` varchar(10) NOT NULL,
  `nombRepuesto` varchar(80) DEFAULT NULL,
  `referencia` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sysdiagrams`
--

DROP TABLE IF EXISTS `sysdiagrams`;
CREATE TABLE `sysdiagrams` (
  `name` varchar(128) NOT NULL,
  `principal_id` int(10) NOT NULL,
  `diagram_id` int(10) NOT NULL,
  `version` int(10) DEFAULT NULL,
  `definition` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tecnicoasignado`
--

DROP TABLE IF EXISTS `tecnicoasignado`;
CREATE TABLE `tecnicoasignado` (
  `consecutivo` int(10) NOT NULL,
  `cedula` int(10) NOT NULL,
  `id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tecnicos`
--

DROP TABLE IF EXISTS `tecnicos`;
CREATE TABLE `tecnicos` (
  `cedula` int(10) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `celular` varchar(50) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoequipo`
--

DROP TABLE IF EXISTS `tipoequipo`;
CREATE TABLE `tipoequipo` (
  `id_tipo_equipo` decimal(10,0) NOT NULL,
  `nombTipoEquipo` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `id_usuario` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `estado` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actividades`
--
ALTER TABLE `actividades`
  ADD PRIMARY KEY (`id_actividad`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`nitced`);

--
-- Indices de la tabla `equipos`
--
ALTER TABLE `equipos`
  ADD PRIMARY KEY (`id_equipo`);

--
-- Indices de la tabla `ot`
--
ALTER TABLE `ot`
  ADD PRIMARY KEY (`consecutivo`);

--
-- Indices de la tabla `otdetalle`
--
ALTER TABLE `otdetalle`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `refrigerante`
--
ALTER TABLE `refrigerante`
  ADD PRIMARY KEY (`id_refrigerante`);

--
-- Indices de la tabla `respuestos`
--
ALTER TABLE `respuestos`
  ADD PRIMARY KEY (`id_repuesto`);

--
-- Indices de la tabla `sysdiagrams`
--
ALTER TABLE `sysdiagrams`
  ADD PRIMARY KEY (`diagram_id`);

--
-- Indices de la tabla `tecnicoasignado`
--
ALTER TABLE `tecnicoasignado`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tecnicos`
--
ALTER TABLE `tecnicos`
  ADD PRIMARY KEY (`cedula`);

--
-- Indices de la tabla `tipoequipo`
--
ALTER TABLE `tipoequipo`
  ADD PRIMARY KEY (`id_tipo_equipo`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
