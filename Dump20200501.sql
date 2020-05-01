CREATE DATABASE  IF NOT EXISTS `cad_detran` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `cad_detran`;
-- MariaDB dump 10.17  Distrib 10.4.10-MariaDB, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: cad_detran
-- ------------------------------------------------------
-- Server version	10.4.11-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `estado`
--

DROP TABLE IF EXISTS `estado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estado` (
  `id_abreviatura` varchar(2) NOT NULL,
  `nome_estado` varchar(30) NOT NULL,
  PRIMARY KEY (`id_abreviatura`),
  UNIQUE KEY `nome_estado` (`nome_estado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado`
--

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` VALUES ('BA','Bahia'),('MG','Minas Gerais'),('PR','Paraná'),('PE','Pernambuco'),('RJ','Rio de Janeiro'),('SP','São Paulo');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loja`
--

DROP TABLE IF EXISTS `loja`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `loja` (
  `id_loja` varchar(15) NOT NULL,
  `nome_loja` varchar(30) NOT NULL,
  PRIMARY KEY (`id_loja`),
  UNIQUE KEY `nome_loja` (`nome_loja`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loja`
--

LOCK TABLES `loja` WRITE;
/*!40000 ALTER TABLE `loja` DISABLE KEYS */;
INSERT INTO `loja` VALUES ('lj-carrao','Auto Car'),('lj-auto','Auto Shop'),('lj-fast','Fast Cars'),('lj-vc','Grand Veículo'),('lj-wheels','Hot Wheels Veículos'),('lj-sport','Sport CAR');
/*!40000 ALTER TABLE `loja` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca_modelo`
--

DROP TABLE IF EXISTS `marca_modelo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `marca_modelo` (
  `nome_marca` varchar(20) NOT NULL,
  `nome_modelo` varchar(20) NOT NULL,
  PRIMARY KEY (`nome_marca`,`nome_modelo`),
  UNIQUE KEY `nome_modelo` (`nome_modelo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca_modelo`
--

LOCK TABLES `marca_modelo` WRITE;
/*!40000 ALTER TABLE `marca_modelo` DISABLE KEYS */;
INSERT INTO `marca_modelo` VALUES ('Chevrolet','Corsa'),('Fiat','Uno'),('Ford','Fiesta'),('Toyota','Corolla'),('Volkswagen','Gol');
/*!40000 ALTER TABLE `marca_modelo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id_login` int(5) NOT NULL AUTO_INCREMENT,
  `login` varchar(60) NOT NULL,
  `nome_usuario` varchar(30) NOT NULL,
  `senha` varchar(15) NOT NULL,
  PRIMARY KEY (`id_login`),
  UNIQUE KEY `login` (`login`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'augusto@gmail.com','Augusto','123456'),(3,'brandon@gmail.com','Brandon','123456'),(4,'vinicius@gmail.com','Vinicius','123456'),(5,'andre@gmail.com','André','123456'),(6,'augustosouza@gmail.com','Augusto Souza','123456');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `veiculo`
--

DROP TABLE IF EXISTS `veiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `veiculo` (
  `id_veiculo` int(5) NOT NULL AUTO_INCREMENT,
  `preco` float unsigned NOT NULL,
  `ano` date NOT NULL,
  `marca` varchar(20) NOT NULL,
  `modelo` varchar(20) NOT NULL,
  `placa` varchar(8) NOT NULL,
  `estado` varchar(2) NOT NULL,
  `loja_veic` varchar(15) NOT NULL,
  PRIMARY KEY (`id_veiculo`),
  UNIQUE KEY `placa` (`placa`),
  KEY `marca` (`marca`,`modelo`),
  KEY `estado` (`estado`),
  KEY `loja_veic` (`loja_veic`),
  CONSTRAINT `veiculo_ibfk_1` FOREIGN KEY (`marca`, `modelo`) REFERENCES `marca_modelo` (`nome_marca`, `nome_modelo`),
  CONSTRAINT `veiculo_ibfk_2` FOREIGN KEY (`estado`) REFERENCES `estado` (`id_abreviatura`),
  CONSTRAINT `veiculo_ibfk_3` FOREIGN KEY (`loja_veic`) REFERENCES `loja` (`id_loja`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veiculo`
--

LOCK TABLES `veiculo` WRITE;
/*!40000 ALTER TABLE `veiculo` DISABLE KEYS */;
INSERT INTO `veiculo` VALUES (4,23000,'2003-05-23','Chevrolet','Corsa','UIO-789','SP','lj-vc'),(5,19000,'2000-08-16','Fiat','Uno','VGH-857','MG','lj-carrao'),(6,30000,'2010-04-01','Volkswagen','Gol','UHT-267','PR','lj-sport'),(7,35000,'2009-07-10','Ford','Fiesta','RTW-612','RJ','lj-auto'),(8,45000,'2005-09-21','Toyota','Corolla','DFR-193','BA','lj-wheels'),(15,150000,'2020-05-01','Toyota','Corolla','UHU-123','SP','lj-vc');
/*!40000 ALTER TABLE `veiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-01 20:52:23
