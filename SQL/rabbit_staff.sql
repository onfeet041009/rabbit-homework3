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
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `username` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `password` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `job` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `address` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `birthday` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `mobile` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `tod` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (1,'BOSS改個名字試試','7pupu','777','老闆','QAQ','20230229','0227662000','forever'),(3,'BOSS',NULL,'7777','老闆','檢查甚麼好難','0000/00/00','0800092000','eceryday'),(4,'不要數字','','7777','老闆','請輸入至少個字如範例這表單好難做','0000/00/00','0800092000','0000/00/00'),(5,'最少輸入兩個字如範例r','777','7777',NULL,'請輸入至少個字如範例這表單好難做','0000/00/00','0800092000','0000/00/00'),(6,'最少輸入兩個字如範例','888','7777',NULL,'輸入三個字a111','0000/00/00','0800092000','0000/00/00'),(7,'範例:小兔砸','test7','Ni484Nb666',NULL,'範例:請輸入至少3個字如範例這表單好難做','0000/00/00','0800092000','0000/00/00'),(8,'範例:小兔砸','tese8','Ni484Nb666',NULL,'範例:請輸入至少3個字如範例這表單好難做','0000/00/00','0800092000','0000/00/00'),(9,'範例:小兔砸','test9','Ni484Nb666',NULL,'範例:請輸入至少3個字如範例這表單好難做','0000/00/00','0800092000','0000/00/00'),(14,'小兔砸','testQQ','Ni484Nb666','老闆','範例:請輸入至少3個字如範例這表單好難做','0000/00/00','0800092000','0000/00/00'),(15,'鍵盤甚麼太麻煩了啦','GGYY484','Ni484Nb666','老闆','巨匠電腦','1987/02/10','0800092000','2023/02/15'),(16,'小兔砸','testfinal','Ni484Nb666','老闆','無殼蝸牛','0000/00/00','0800092000','0000/00/00');
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
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
