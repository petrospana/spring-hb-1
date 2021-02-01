# spring-hb-1

# Basic info
We run the project on eclipse using TOMCAT apache version 9.0.
We use Docker as a container for MySQL database.
Java version 13.0.1

# With the following command we run our database through docker via command line

docker run --name mysqldatastorage -v mysqldbvol2:/var/lib/mysql -p 3308:3306 -e MYSQL_USER=hbstudent -e MYSQL_PASSWORD=changeit -e MYSQL_DATABASE=ergasia -e MYSQL_ROOT_PASSWORD=pass123 --rm -d mysql/mysql-server:latest

# With the following script we create the tables for our database and put some starting values:

CREATE TABLE IF NOT EXISTS `aitiseis` (
  `aitisi_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `etisioIsodima` int DEFAULT NULL,
  `dateOfBirth` date DEFAULT NULL,
  `onomaPatera` varchar(100) DEFAULT NULL,
  `onomaMiteras` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`aitisi_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `stathmoi` (
  `stathmos_id` int NOT NULL AUTO_INCREMENT,
  `max_capacity` int DEFAULT '25',
  `number_students` int DEFAULT NULL,
  `plithos_tmimaton` int DEFAULT NULL,
  PRIMARY KEY (`stathmos_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `diefthintes` (
  `username` varchar(100) NOT NULL,
  `first_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `stathmos_id` int NOT NULL,
  PRIMARY KEY (`username`),
  KEY `diefthintes_FK` (`stathmos_id`),
  CONSTRAINT `diefthintes_FK` FOREIGN KEY (`stathmos_id`) REFERENCES `stathmoi` (`stathmos_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE IF NOT EXISTS `ekpaideftikoi` (
  `first_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `stathmos_id` int NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`username`),
  KEY `ekpaideftikoi_FK` (`stathmos_id`),
  CONSTRAINT `ekpaideftikoi_FK` FOREIGN KEY (`stathmos_id`) REFERENCES `stathmoi` (`stathmos_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS tmimata (
  stathmos_id int NOT NULL,
  tmima_id int NOT NULL AUTO_INCREMENT,
  username varchar(100) NOT NULL,
  PRIMARY KEY (tmima_id),
  KEY tmimata_FK (stathmos_id),
  KEY tmimata_FK_1 (username),
  CONSTRAINT tmimata_FK FOREIGN KEY (stathmos_id) REFERENCES stathmoi (stathmos_id),
  CONSTRAINT tmimata_FK_1 FOREIGN KEY (username) REFERENCES ekpaideftikoi (username)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `mathites` (
  `mathitis_id` int NOT NULL AUTO_INCREMENT,
  `stathmos_id` int DEFAULT NULL,
  `tmima_id` int DEFAULT NULL,
  PRIMARY KEY (`mathitis_id`),
  KEY `mathites_FK` (`stathmos_id`),
  KEY `mathites_FK_1` (`tmima_id`),
  CONSTRAINT `mathites_FK` FOREIGN KEY (`stathmos_id`) REFERENCES `stathmoi` (`stathmos_id`),
  CONSTRAINT `mathites_FK_1` FOREIGN KEY (`tmima_id`) REFERENCES `tmimata` (`tmima_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO stathmoi VALUES
(123,25,0,2),
(149,25,0,1);

INSERT INTO `ekpaideftikoi` VALUES
('David','Adams','david@hua.gr', 123,'david','teacher4ever'),
('Mary','Papado','mary@hua.gr',123,'mary','TheTeacher');

INSERT INTO diefthintes VALUES
('mike','Michalis','Panousis','mikepanoussis@gmail.com','theBest',123),
('peter','Peter','Pan','peterpan@foreverland.com','p3t3r',149);

INSERT INTO tmimata VALUES
(123,01,'david'),
(123,02,'Mary');

# We use this script to put some roles in our database

CREATE TABLE IF NOT EXISTS `user` (
 `username` varchar(50) NOT NULL,
 `password` varchar(100) NOT NULL,
 `enabled` tinyint(1) NOT NULL,
 PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




CREATE TABLE IF NOT EXISTS `authorities` (
 `username` varchar(50) NOT NULL,
 `authority` varchar(50) NOT NULL,
 UNIQUE KEY `ix_auth_username` (`username`,`authority`),
 CONSTRAINT `fk_authorities_users` FOREIGN KEY (`username`) REFERENCES `user` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



INSERT INTO `user` (`username`, `password`, `enabled`) VALUES
   ('argiris', '$2a$04$DR/f..s1siWJc8Xg3eJgpeB28a4V6kYpnkMPeOuq4rLQ42mJUYFGC', 1),
   ('root', '$2a$04$DR/f..s1siWJc8Xg3eJgpeB28a4V6kYpnkMPeOuq4rLQ42mJUYFGC', 1);

INSERT INTO `authorities` (`username`, `authority`) VALUES
   ('root', 'ROLE_ADMIN'),
   ('argiris', 'ROLE_USER');




