-- MySQL dump 10.13  Distrib 8.0.25, for Linux (x86_64)
--
-- Host: localhost    Database: logintony
-- ------------------------------------------------------
-- Server version	8.0.29-0ubuntu0.22.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `contrato`
--

DROP TABLE IF EXISTS `contrato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contrato` (
  `NDEEMPLEADO` int NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(100) NOT NULL,
  `APELLIDO_PATERNO` varchar(100) NOT NULL,
  `APELLIDO_MATERNO` varchar(100) NOT NULL,
  `FECHA_DE_NACIMIENTO` varchar(50) NOT NULL,
  `DEPARTAMENTO` varchar(100) NOT NULL,
  `SEXO` varchar(100) NOT NULL,
  `FECHA_DE_INGRESO` varchar(50) NOT NULL,
  `ANTIGUEDAD` varchar(100) NOT NULL,
  PRIMARY KEY (`NDEEMPLEADO`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contrato`
--

LOCK TABLES `contrato` WRITE;
/*!40000 ALTER TABLE `contrato` DISABLE KEYS */;
INSERT INTO `contrato` VALUES (1,'Cecilia','Zambrano','Cordova','1/3/1988','RRHH','Femenino','2/4/2020','2 años'),(2,'Martin','Melgoza','Zendejas','2/3/2000','Almacen','Masculino','4/6/2020','2 años'),(3,'Antonio','MArtinez','Farias','2/3/2000','Ventas','Masculino','4/6/2020','2 años'),(4,'Jorge','Hernandez','Hernandez','3/7/1880','Produccion','Masculino','23/8/2020','2 años');
/*!40000 ALTER TABLE `contrato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `r_inventario`
--

DROP TABLE IF EXISTS `r_inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `r_inventario` (
  `No_orden` int NOT NULL,
  `fecha` varchar(45) DEFAULT NULL,
  `descripcion` varchar(80) DEFAULT NULL,
  `encargado` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`No_orden`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `r_inventario`
--

LOCK TABLES `r_inventario` WRITE;
/*!40000 ALTER TABLE `r_inventario` DISABLE KEYS */;
INSERT INTO `r_inventario` VALUES (1,'2/5/2022','PC Gamer','Jorge','Terminado'),(212,'2/6/2020','Impresora','Jorge','Reparada');
/*!40000 ALTER TABLE `r_inventario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registro_inventario`
--

DROP TABLE IF EXISTS `registro_inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registro_inventario` (
  `No_orden` int NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `descripcion` varchar(80) NOT NULL,
  `encargado` varchar(45) NOT NULL,
  `Status` varchar(45) NOT NULL,
  PRIMARY KEY (`No_orden`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro_inventario`
--

LOCK TABLES `registro_inventario` WRITE;
/*!40000 ALTER TABLE `registro_inventario` DISABLE KEYS */;
/*!40000 ALTER TABLE `registro_inventario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_general`
--

DROP TABLE IF EXISTS `tabla_general`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_general` (
  `ptllave1` int NOT NULL AUTO_INCREMENT,
  `pno_nota` int DEFAULT '0',
  `pcliente` varchar(100) DEFAULT NULL,
  `pentrega` varchar(10) DEFAULT NULL,
  `pcantidad` int DEFAULT NULL,
  `pdetalles` varchar(1500) DEFAULT NULL,
  `cofolio` int DEFAULT NULL,
  `cocliente` varchar(100) DEFAULT NULL,
  `coproductos` varchar(100) DEFAULT NULL,
  `cono_piezas` int DEFAULT NULL,
  `cofecha` varchar(50) DEFAULT NULL,
  `pvcantidad` int DEFAULT NULL,
  `pvproducto` varchar(150) DEFAULT NULL,
  `pvprecio` int DEFAULT NULL,
  `fanombre` varchar(80) DEFAULT NULL,
  `faapellidos` varchar(80) DEFAULT NULL,
  `farfc` varchar(45) DEFAULT NULL,
  `facfdi` varchar(80) DEFAULT NULL,
  `fadomicilio` varchar(250) DEFAULT NULL,
  `facorreo` varchar(50) DEFAULT NULL,
  `prclave` varchar(45) DEFAULT NULL,
  `prdescripcion` varchar(100) DEFAULT NULL,
  `prprecio` int DEFAULT NULL,
  `seide` int DEFAULT NULL,
  `sedetalles` varchar(100) DEFAULT NULL,
  `secosto` varchar(100) DEFAULT NULL,
  `clnombre` varchar(50) DEFAULT NULL,
  `clapellidos` varchar(100) DEFAULT NULL,
  `cldireccion` varchar(200) DEFAULT NULL,
  `ticliente` varchar(200) DEFAULT NULL,
  `tiasunto` varchar(150) DEFAULT NULL,
  `titecnico` varchar(150) DEFAULT NULL,
  `tidescripcion` varchar(200) DEFAULT NULL,
  `tiestado` varchar(45) DEFAULT NULL,
  `tifechainicio` varchar(20) DEFAULT NULL,
  `tifechafin` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ptllave1`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_general`
--

LOCK TABLES `tabla_general` WRITE;
/*!40000 ALTER TABLE `tabla_general` DISABLE KEYS */;
INSERT INTO `tabla_general` VALUES (1,0,'','',0,'',0,'','',0,'',0,'',0,'','','','','','','','',0,1,'Reparacion','500','','','','','','','','','',''),(2,0,'','',0,'',1001,'jose','reparacion',1,'11/6/2022',0,'',0,'','','','','','','','',0,0,'','0','','','','','','','','','',''),(3,0,'','',0,'',0,'','',0,'',0,'',0,'jose','martinez','678654345678','456787654567','bafar','josesito@bafar.com','','',0,0,'','0','','','','','','','','','',''),(4,0,'','',0,'',0,'','',0,'',0,'',0,'','','','','','','','',0,0,'','0','','','','jose','reparacion','jorge','reparacion','listo','11/6/2022','12/6/2022'),(5,0,'','',0,'',0,'','',0,'',0,'',0,'','','','','','','','',0,0,'','0','ivan','vaca','bafar','','','','','','','');
/*!40000 ALTER TABLE `tabla_general` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `idusers` int NOT NULL AUTO_INCREMENT,
  `user` varchar(45) NOT NULL,
  `password` blob NOT NULL,
  `nombreColaborador` varchar(45) NOT NULL,
  `ventas` int DEFAULT NULL,
  `almacen` int DEFAULT NULL,
  `RRHH` int DEFAULT NULL,
  `produccion` int DEFAULT NULL,
  PRIMARY KEY (`idusers`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Admin',_binary '1234','Roberto Vazquez',1,1,1,1),(2,'antonio',_binary 'antonio1234','Juan Antonio',1,0,0,0),(3,'jorge',_binary 'jorge1234','Jorge Hernandez',0,0,0,1),(4,'martin',_binary 'martin1234','Martin Melgoza',0,1,0,0),(5,'cecilia',_binary 'cecilia1234','Cecilia Zambrano',0,0,1,0),(6,'ivan',_binary 'ivan1234','Ivan Vaca',1,1,0,0);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-24 16:28:23
