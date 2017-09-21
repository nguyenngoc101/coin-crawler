-- Create database
create database coin;

-- Create tables
CREATE TABLE `coin` (
  `coin_id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) COLLATE utf8_bin NOT NULL,
  `code` varchar(25) NOT NULL,
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
  `price_id` int(20) NOT NULL AUTO_INCREMENT,
  `code_id` varchar(25) NOT NULL,
  `reg_pgm_id` varchar(32) COLLATE utf8_bin NOT NULL,
  `reg_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `upd_pgm_id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `upd_timestamp` timestamp NULL DEFAULT NULL,
  `volumn` double(20, 2),
  `market_cap` double(20, 2),
  `price` double(20, 2),
  `circulating_supply` double(20, 2),
  `percent_1_hour` double(10, 2),
  `percent_24_hour2` double(10, 2),
  `percent_7_days` double(10, 2),
  PRIMARY KEY (`price_id`),
  KEY `price_idx01` (`code_id`) USING BTREE,
  KEY `price_idx02` (`reg_timestamp`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
