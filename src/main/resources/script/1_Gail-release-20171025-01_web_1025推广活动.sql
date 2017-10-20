/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50634
Source Host           : test-web.mysql.rds.aliyuncs.com:3306
Source Database       : test_db_web

Target Server Type    : MYSQL
Target Server Version : 50634
File Encoding         : 65001

Date: 2017-10-20 14:16:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_prom_award
-- ----------------------------
DROP TABLE IF EXISTS `t_prom_award`;
CREATE TABLE `t_prom_award` (
  `AWARD_ID` varchar(50) NOT NULL COMMENT '奖品id',
  `PROM_ID` varchar(50) NOT NULL DEFAULT '' COMMENT '活动ID',
  `LOTTERY_ID` varchar(50) NOT NULL DEFAULT '' COMMENT '抽奖ID',
  `LOTTERY_CREATE_ID` varchar(50) NOT NULL DEFAULT '' COMMENT '奖品创建人ID',
  `AWARD_TOTAL` varchar(50) DEFAULT '' COMMENT '奖品总量',
  `AWARD_PROBALITY` varchar(50) DEFAULT '' COMMENT '奖品中奖概率',
  `AWARD_REMAIN` varchar(50) DEFAULT '奖品余量',
  `AWARD_NAME` varchar(50) DEFAULT '' COMMENT '奖品名称',
  `AWARD_NOTICE` varchar(255) DEFAULT '' COMMENT '中奖后，恭喜语',
  `AWARD_PIC` varchar(255) DEFAULT '' COMMENT '奖品图片',
  `ALIVE_FLAG` varchar(1) DEFAULT NULL COMMENT '删除标记',
  `MARKET_ID` varchar(1) DEFAULT NULL COMMENT '标记状态',
  `UPDATE_USER` varchar(50) DEFAULT NULL COMMENT '更新会员',
  `UPDATE_DATE` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `CREATE_USER` varchar(32) DEFAULT NULL COMMENT '创建会员',
  `CREATE_DATE` datetime DEFAULT NULL COMMENT '更新会员',
  `EXT1` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT2` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT3` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT4` varchar(50) DEFAULT NULL COMMENT '分享链接',
  `EXT5` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT6` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT7` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT8` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT9` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT10` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  PRIMARY KEY (`AWARD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='推广活动奖品配置配置';

-- ----------------------------
-- Records of t_prom_award
-- ----------------------------
INSERT INTO `t_prom_award` VALUES ('1', '1', '1', '1', '800', '2367', '0\n', '感谢参与', '感谢您的参与！不如换个姿势再试试，大奖正在路上...', '', '1', null, '1', '2017-10-19 11:07:26', '1', '2017-10-19 11:11:21', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_prom_award` VALUES ('2', '1', '1', '1', '800', '2367', '0\n', '感谢参与', '感谢您的参与！不如换个姿势再试试，大奖正在路上...', '', '1', null, '1', '2017-10-19 11:07:29', '1', '2017-10-19 11:11:24', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_prom_award` VALUES ('3', '1', '1', '1', '1000', '2959', '0', '5M', '恭喜您获得5M流量，稍后我们的工作人员将与您取得联系！', '', '1', null, '1', '2017-10-19 11:07:33', '1', '2017-10-19 11:11:27', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_prom_award` VALUES ('4', '1', '1', '1', '200', '592', '0', '10M', '恭喜您获得10M流量，稍后我们的工作人员将与您取得联系！', '', '1', null, '1', '2017-10-19 11:07:38', '1', '2017-10-19 11:11:30', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_prom_award` VALUES ('5', '1', '1', '1', '500', '1479', '0', '50M', '恭喜您获得50M流量，稍后我们的工作人员将与您取得联系！', '', '1', null, '1', '2017-10-19 11:09:50', '1', '2017-10-19 11:11:33', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_prom_award` VALUES ('6', '1', '1', '1', '30', '89', '0', '红酒', '恭喜您获得红酒，稍后我们的工作人员将与您取得联系！', '', '1', null, '1', '2017-10-19 11:10:03', '1', '2017-10-19 11:11:36', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_prom_award` VALUES ('7', '1', '1', '1', '20', '59', '0', '128GU盘', '恭喜您获得128G U盘，稍后我们的工作人员将与您取得联系！', '', '1', null, '1', '2017-10-19 11:10:08', '1', '2017-10-19 11:11:40', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `t_prom_award` VALUES ('8', '1', '1', '1', '30', '89', '0', '小米移动电源', '恭喜您获得小米移动电源，稍后我们的工作人员将与您取得联系！', '', '1', null, '1', '2017-10-19 11:10:22', '1', '2017-10-19 11:11:42', null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for t_prom_live
-- ----------------------------
DROP TABLE IF EXISTS `t_prom_live`;
CREATE TABLE `t_prom_live` (
  `PROM_ID` varchar(50) NOT NULL DEFAULT '' COMMENT '活动ID',
  `PROM_CREATE_ID` varchar(50) NOT NULL DEFAULT '' COMMENT '活动创建人ID',
  `ROOM_ID` varchar(50) DEFAULT NULL COMMENT '直播室id',
  `ROOM_TOPIC` varchar(50) DEFAULT '' COMMENT '房间主题',
  `ROOM_SUB_TOPIC` varchar(50) DEFAULT '' COMMENT '房间二级主题',
  `ROOM_DETAIL` varchar(50) DEFAULT '房间主题详细描述',
  `EMCEE` varchar(50) DEFAULT '' COMMENT '主持人姓名',
  `EMCEE_AVATAR` varchar(50) DEFAULT '主持人头像',
  `TYPE` varchar(10) DEFAULT NULL COMMENT '类型',
  `ALIVE_FLAG` varchar(1) DEFAULT NULL COMMENT '删除标记',
  `MARKET_ID` varchar(1) DEFAULT NULL COMMENT '标记状态',
  `UPDATE_USER` varchar(50) DEFAULT NULL COMMENT '更新会员',
  `UPDATE_DATE` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `CREATE_USER` varchar(32) DEFAULT NULL COMMENT '创建会员',
  `CREATE_DATE` datetime DEFAULT NULL COMMENT '更新会员',
  `EXT1` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT2` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT3` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT4` varchar(50) DEFAULT NULL COMMENT '分享链接',
  `EXT5` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT6` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT7` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT8` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT9` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT10` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `ROOM_URL` varchar(255) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`PROM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='推广活动直播室配置';

-- ----------------------------
-- Records of t_prom_live
-- ----------------------------

-- ----------------------------
-- Table structure for t_prom_lottery
-- ----------------------------
DROP TABLE IF EXISTS `t_prom_lottery`;
CREATE TABLE `t_prom_lottery` (
  `LOTTERY_ID` varchar(50) NOT NULL COMMENT 'id',
  `PROM_ID` varchar(50) NOT NULL DEFAULT '' COMMENT '活动ID',
  `LOTTERY_CREATE_ID` varchar(50) NOT NULL DEFAULT '' COMMENT '抽奖创建人ID',
  `AWARD_COUNT` varchar(50) DEFAULT '' COMMENT '奖品种类数',
  `LOTTERY_LIMIT` varchar(50) DEFAULT '' COMMENT '抽奖次数',
  `ALIVE_FLAG` varchar(1) DEFAULT NULL COMMENT '删除标记',
  `MARKET_ID` varchar(1) DEFAULT NULL COMMENT '标记状态',
  `UPDATE_USER` varchar(50) DEFAULT NULL COMMENT '更新会员',
  `UPDATE_DATE` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `CREATE_USER` varchar(32) DEFAULT NULL COMMENT '创建会员',
  `CREATE_DATE` datetime DEFAULT NULL COMMENT '更新会员',
  `EXT1` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT2` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT3` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT4` varchar(50) DEFAULT NULL COMMENT '分享链接',
  `EXT5` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT6` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT7` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT8` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT9` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT10` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  PRIMARY KEY (`LOTTERY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='推广活动抽奖配置配置';

-- ----------------------------
-- Records of t_prom_lottery
-- ----------------------------
INSERT INTO `t_prom_lottery` VALUES ('1', '1', '1', '8', '1', '1', null, '1', '2017-10-19 11:06:46', '1', '2017-10-20 11:06:53', null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for t_prom_record
-- ----------------------------
DROP TABLE IF EXISTS `t_prom_record`;
CREATE TABLE `t_prom_record` (
  `ID` varchar(50) NOT NULL COMMENT 'id',
  `LOTTERY_ID` varchar(50) NOT NULL COMMENT 'id',
  `PROM_ID` varchar(50) NOT NULL DEFAULT '' COMMENT '活动ID',
  `EPOSIDE` varchar(50) DEFAULT '' COMMENT '抽奖轮数',
  `LOTTERY_CREATE_ID` varchar(50) NOT NULL DEFAULT '' COMMENT '抽奖创建人ID',
  `AWARD_ID` varchar(50) DEFAULT '' COMMENT '奖品ID',
  `PHONE` varchar(50) DEFAULT '' COMMENT '中奖人手机号码',
  `AWARD_NAME` varchar(50) DEFAULT '' COMMENT '奖品名称',
  `LOTTERY_LIMIT` varchar(50) DEFAULT '' COMMENT '抽奖次数',
  `ALIVE_FLAG` varchar(1) DEFAULT NULL COMMENT '删除标记',
  `MARKET_ID` varchar(1) DEFAULT NULL COMMENT '标记状态',
  `UPDATE_USER` varchar(50) DEFAULT NULL COMMENT '更新会员',
  `UPDATE_DATE` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `CREATE_USER` varchar(32) DEFAULT NULL COMMENT '创建会员',
  `CREATE_DATE` datetime DEFAULT NULL COMMENT '更新会员',
  `EXT1` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT2` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT3` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT4` varchar(50) DEFAULT NULL COMMENT '分享链接',
  `EXT5` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT6` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT7` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT8` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT9` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  `EXT10` varchar(50) DEFAULT NULL COMMENT '扩展字段',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户参与活动记录表';

-- ----------------------------
-- Records of t_prom_record
-- ----------------------------
