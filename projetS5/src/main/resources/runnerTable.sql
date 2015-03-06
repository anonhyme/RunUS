DROP TABLE runner;
CREATE TABLE `runner` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `height` int(6),
  `average_speed` int(2),
  `last_run` VARCHAR(200), #last run date (avg, dst...)
  `mac_id` varchar(64),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

DROP TABLE mbed;
CREATE TABLE `mbed` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `source` VARCHAR(30),
  `time` TIMESTAMP,
  `data` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

DROP TABLE account;
CREATE TABLE `account` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(60),
  `password` VARCHAR(60),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

