-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: campeonato
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `equipos`
--

DROP TABLE IF EXISTS `equipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipos` (
  `ID` bigint NOT NULL AUTO_INCREMENT,
  `CIUDAD` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipos`
--

LOCK TABLES `equipos` WRITE;
/*!40000 ALTER TABLE `equipos` DISABLE KEYS */;
INSERT INTO `equipos` VALUES (1,'Barcelona','FC Barcelona Baloncesto'),(2,'Madrid','Real Madrid'),(3,'Badalona','Joventut Badalona'),(4,'Málaga','Unicaja Málaga'),(5,'Santa Cruz de Tenerife','Lenovo Tenerife'),(6,'Las Palmas de Gran Canaria','Dreamland Gran Canaria'),(7,'Lugo','Río Breogán'),(8,'Vitoria-Gasteiz','Saski Baskonia'),(9,'Manresa','BAXI Manresa'),(10,'Zaragoza','Casademont Zaragoza'),(11,'Girona','Bàsquet Girona'),(12,'Santiago de Compostela','Monbus Obradoiro'),(13,'Bilbao','Surne Bilbao Basket'),(14,'Andorra la Vella','Morabanc Andorra');
/*!40000 ALTER TABLE `equipos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partidos`
--

DROP TABLE IF EXISTS `partidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `partidos` (
  `ID` bigint NOT NULL AUTO_INCREMENT,
  `FECHAPARTIDO` date DEFAULT NULL,
  `RESULTL` int DEFAULT NULL,
  `RESULTV` int DEFAULT NULL,
  `equipoLocal` bigint DEFAULT NULL,
  `equipoVisitante` bigint DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_Partidos_equipoVisitante` (`equipoVisitante`),
  KEY `FK_Partidos_equipoLocal` (`equipoLocal`),
  CONSTRAINT `FK_Partidos_equipoLocal` FOREIGN KEY (`equipoLocal`) REFERENCES `equipos` (`ID`),
  CONSTRAINT `FK_Partidos_equipoVisitante` FOREIGN KEY (`equipoVisitante`) REFERENCES `equipos` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partidos`
--

LOCK TABLES `partidos` WRITE;
/*!40000 ALTER TABLE `partidos` DISABLE KEYS */;
INSERT INTO `partidos` VALUES (1,'2023-11-13',85,80,1,2),(2,'2023-11-18',78,69,13,6);
/*!40000 ALTER TABLE `partidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'campeonato'
--

--
-- Dumping routines for database 'campeonato'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-23  3:23:09
