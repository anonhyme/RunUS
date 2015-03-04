# DROP TABLE shops;

# CREATE TABLE `shops` (
#   `id` int(6) NOT NULL AUTO_INCREMENT,
#   `name` varchar(60) NOT NULL,
#   `employees_number` int(6) NOT NULL,
#   PRIMARY KEY (`id`)
# ) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

DROP TABLE runner;
CREATE TABLE `runner` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `height` int(6),
  `average_speed` int(2),
  `last_run` VARCHAR(200), #last run date (avg, dst
  `mac_id` varchar(64),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
