-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: rabbit
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `order2023ver2`
--

DROP TABLE IF EXISTS `order2023ver2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order2023ver2` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `address` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `a0` int DEFAULT NULL,
  `a1` int DEFAULT NULL,
  `a2` int DEFAULT NULL,
  `a3` int DEFAULT NULL,
  `a4` int DEFAULT NULL,
  `a5` int DEFAULT NULL,
  `a6` int DEFAULT NULL,
  `a7` int DEFAULT NULL,
  `a8` int DEFAULT NULL,
  `a9` int DEFAULT NULL,
  `odate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order2023ver2`
--

LOCK TABLES `order2023ver2` WRITE;
/*!40000 ALTER TABLE `order2023ver2` DISABLE KEYS */;
INSERT INTO `order2023ver2` VALUES (1,'Boss','test',1,2,3,4,5,6,7,8,9,10,NULL),(2,'Boss1','test2',1,2,3,4,5,6,7,8,9,10,NULL),(4,'BOSS','我家雞排沙漠',1,0,0,0,0,0,0,0,0,0,NULL),(5,'BOSS','我家雞排沙漠',0,0,0,0,0,0,0,0,0,1,NULL),(6,'BOSS','我家雞排沙漠',1,0,0,0,0,0,0,0,0,0,NULL),(7,'BOSS','我家雞排沙漠',0,0,0,0,0,0,0,0,0,1,NULL),(8,'BOSS','我家雞排沙漠',1,0,0,0,0,0,0,0,0,0,NULL),(9,'BOSS','我家雞排沙漠',1,0,0,0,0,0,0,0,0,0,NULL),(10,'BOSS','我家雞排沙漠',0,0,0,0,2,0,0,0,0,0,NULL),(11,'BOSS','我家雞排沙漠',0,0,0,0,0,0,0,1,0,0,'2023-02-19'),(12,'BOSS','我家雞排沙漠',0,0,0,0,0,1,0,0,0,0,'2023-02-19'),(13,'BOSS','我家雞排沙漠',0,0,0,1,0,0,0,0,0,0,'2023-02-19'),(14,'最終測試','我家沒好吃的雞排',0,0,0,0,0,0,0,0,1,0,'2023-02-19'),(15,'BOSS','我家雞排沙漠',0,0,0,0,0,0,0,0,1,0,'2023-02-19'),(16,'BOSS','我家雞排沙漠',0,0,0,0,1,0,0,0,0,0,'2023-02-19'),(17,'BOSS','我家雞排沙漠',1,0,0,0,0,0,0,0,0,0,'2023-02-19'),(18,'BOSS','我家雞排沙漠',0,1,0,0,0,0,0,0,0,0,'2023-02-19');
/*!40000 ALTER TABLE `order2023ver2` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-20 10:54:12
