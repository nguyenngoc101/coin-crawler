-- Create database
create database coin;

-- Create tables
CREATE TABLE `coin` (
  `coin_id` int(7) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) COLLATE utf8_bin NOT NULL,
  `code` varchar(10) NOT NULL,
  `max_supply` BIGINT DEFAULT NULL,
  `reg_pgm_id` varchar(32) COLLATE utf8_bin NOT NULL,
  `reg_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `upd_pgm_id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `upd_timestamp` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`coin_id`),
  KEY `coin_idx01` (`name`) USING BTREE,
  KEY `coin_idx02` (`code`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


CREATE TABLE `price` (
  `price_id` int(7) NOT NULL AUTO_INCREMENT,
  `coin_id` int(7) NOT NULL,
  `reg_pgm_id` varchar(32) COLLATE utf8_bin NOT NULL,
  `reg_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `upd_pgm_id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `upd_timestamp` timestamp NULL DEFAULT NULL,
  `volumn` double(20, 2),
  `market_cap` double(20, 2),
  `percent_1_hour` double(4, 2),
  `percent_24_hour2` double(4, 2),
  `percent_7_days` double(4, 2),
  PRIMARY KEY (`price_id`),
  KEY `price_idx01` (`coin_id`) USING BTREE,
  KEY `price_idx02` (`reg_timestamp`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
