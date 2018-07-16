/*
Navicat MySQL Data Transfer

Source Server         : localhost_copy
Source Server Version : 50638
Source Host           : localhost:3306
Source Database       : stock

Target Server Type    : MYSQL
Target Server Version : 50638
File Encoding         : 65001

Date: 2018-07-16 20:59:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_dailystock
-- ----------------------------
DROP TABLE IF EXISTS `t_dailystock`;
CREATE TABLE `t_dailystock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `code` varchar(30) DEFAULT NULL,
  `name` varchar(40) DEFAULT NULL,
  `tclose` double DEFAULT NULL COMMENT '收盘价',
  `high` double DEFAULT NULL COMMENT '最高价',
  `low` double DEFAULT NULL COMMENT '最低价',
  `topen` double DEFAULT NULL COMMENT '开盘价',
  `lclose` double DEFAULT NULL COMMENT '前收盘',
  `chg` double DEFAULT NULL COMMENT '涨跌额',
  `pchg` double DEFAULT NULL COMMENT '涨跌幅',
  `turnover` double DEFAULT NULL COMMENT '换手率',
  `voturnover` double DEFAULT NULL COMMENT '成交量',
  `vaturnove` double DEFAULT NULL COMMENT '成交金额',
  `tcap` double DEFAULT NULL COMMENT '总市值',
  `mcap` double DEFAULT NULL COMMENT '流通市值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
