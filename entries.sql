CREATE TABLE `entries` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `entrydate` datetime(6) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `userid` bigint NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci