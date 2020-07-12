/*
 Navicat Premium Data Transfer

 Source Server         : ZhengJiaWei
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : code-generate

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 12/07/2020 18:50:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for db_his_info
-- ----------------------------
DROP TABLE IF EXISTS `db_his_info`;
CREATE TABLE `db_his_info`  (
  `info_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据库历史信息表主键',
  `version_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '版本主键',
  `database_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据库主键',
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据库名称',
  `code` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据库编码',
  `collate_value` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '排列字符集',
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据库说明',
  `action` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '操作',
  `modifier` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  `modification_time` datetime(3) NOT NULL COMMENT '修改时间',
  `app_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '应用名称',
  `version` int(11) NULL DEFAULT NULL COMMENT 'hibernate乐观锁使用',
  `type` int(11) NULL DEFAULT 0 COMMENT '数据库类型：0->MYSQL,1->ORACAL, 2->SQLSERVER',
  PRIMARY KEY (`info_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '历史数据库信息记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for db_present_info
-- ----------------------------
DROP TABLE IF EXISTS `db_present_info`;
CREATE TABLE `db_present_info`  (
  `database_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据库主键',
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据库名称',
  `code` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据库编码',
  `collate_value` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '排列字符集',
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据库说明',
  `active` tinyint(1) NOT NULL COMMENT '状态:有效,无效,伪删除',
  `modifier` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  `modification_time` datetime(3) NOT NULL COMMENT '修改时间',
  `app_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '应用名称',
  `version` int(11) NULL DEFAULT NULL COMMENT 'hibernate乐观锁使用',
  `type` int(11) NULL DEFAULT 0 COMMENT '数据库类型：0->MYSQL,1->ORACAL, 2->SQLSERVER',
  PRIMARY KEY (`database_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '当前数据库信息记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for field_his_info
-- ----------------------------
DROP TABLE IF EXISTS `field_his_info`;
CREATE TABLE `field_his_info`  (
  `info_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字段历史信息主键',
  `version_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '版本主键',
  `database_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据库主键',
  `table_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '表主键',
  `field_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字段主键',
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段名称',
  `type_value` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段类型',
  `size_value` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段长度',
  `primary_key` tinyint(1) NULL DEFAULT NULL COMMENT '是否为主键',
  `null_value` tinyint(1) NULL DEFAULT NULL COMMENT '是否允许为空：0不允许为空，1允许为空',
  `auto_increment` tinyint(1) NULL DEFAULT NULL COMMENT '是否自增',
  `default_value` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '默认值',
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段说明',
  `action` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '操作',
  `modifier` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  `modification_time` datetime(3) NOT NULL COMMENT '修改时间',
  `version` int(11) NULL DEFAULT NULL COMMENT 'hibernate乐观锁使用',
  PRIMARY KEY (`info_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '历史字段信息记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for field_present_info
-- ----------------------------
DROP TABLE IF EXISTS `field_present_info`;
CREATE TABLE `field_present_info`  (
  `field_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字段主键',
  `database_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据库主键',
  `table_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '表主键',
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字段名称',
  `type_value` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字段类型',
  `size_value` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字段长度',
  `primary_key` tinyint(1) NULL DEFAULT NULL COMMENT '是否为主键',
  `null_value` tinyint(1) NULL DEFAULT NULL COMMENT '是否允许为空：0不允许为空，1允许为空',
  `auto_increment` tinyint(1) NULL DEFAULT NULL COMMENT '是否自增',
  `default_value` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '默认值',
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段说明',
  `active` tinyint(1) NOT NULL COMMENT '状态:有效,无效,伪删除',
  `modifier` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  `modification_time` datetime(3) NOT NULL COMMENT '修改时间',
  `version` int(11) NULL DEFAULT NULL COMMENT 'hibernate乐观锁使用',
  PRIMARY KEY (`field_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '当前字段信息记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for field_value_his_info
-- ----------------------------
DROP TABLE IF EXISTS `field_value_his_info`;
CREATE TABLE `field_value_his_info`  (
  `field_value_his_info_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '历史信息主键',
  `original_data_his_info_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '初始数据历史信息主键(外键)',
  `field_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段主键(外键)',
  `field_value` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段值',
  `insert_time` datetime(3) NULL DEFAULT NULL COMMENT '插入时间',
  `update_time` datetime(3) NULL DEFAULT NULL COMMENT '修改时间',
  `version` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  PRIMARY KEY (`field_value_his_info_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字段值历史表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for field_value_present_info
-- ----------------------------
DROP TABLE IF EXISTS `field_value_present_info`;
CREATE TABLE `field_value_present_info`  (
  `field_value_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字段值当前表主键',
  `original_data_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '初始数据主键(外键)',
  `field_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字段主键(外键)',
  `field_value` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段值',
  `insert_time` datetime(3) NULL DEFAULT NULL COMMENT '插入时间',
  `update_time` datetime(3) NULL DEFAULT NULL COMMENT '修改时间',
  `version` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  PRIMARY KEY (`field_value_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字段值当前表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for index_field_his_info
-- ----------------------------
DROP TABLE IF EXISTS `index_field_his_info`;
CREATE TABLE `index_field_his_info`  (
  `info_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字段索引联系历史信息主键',
  `field_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字段主键',
  `index_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '索引主键',
  `length_value` int(10) NULL DEFAULT NULL COMMENT '字段长度',
  `decline` tinyint(1) NULL DEFAULT NULL COMMENT '是否降序: 0为升序，1为降序',
  `position` int(5) NULL DEFAULT NULL COMMENT '索引字段位置',
  `action` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '操作',
  `index_info_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '索引历史信息表主键',
  `version` int(11) NULL DEFAULT NULL COMMENT 'hibernate乐观锁使用',
  PRIMARY KEY (`info_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '历史索引-字段联系表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for index_field_present_info
-- ----------------------------
DROP TABLE IF EXISTS `index_field_present_info`;
CREATE TABLE `index_field_present_info`  (
  `field_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字段主键',
  `index_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '索引主键',
  `length_value` int(10) NULL DEFAULT NULL COMMENT '字段长度',
  `decline` tinyint(1) NULL DEFAULT NULL COMMENT '是否降序: 0为升序，1为降序',
  `position` int(5) NULL DEFAULT NULL COMMENT '索引字段位置',
  `version` int(11) NULL DEFAULT NULL COMMENT 'hibernate乐观锁使用',
  PRIMARY KEY (`field_id`, `index_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '当前索引字段联系表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for index_his_info
-- ----------------------------
DROP TABLE IF EXISTS `index_his_info`;
CREATE TABLE `index_his_info`  (
  `info_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '索引历史信息表主键',
  `version_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '版本主键',
  `database_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据库主键',
  `table_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '表主键',
  `index_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '索引主键',
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '索引名称',
  `type_value` tinyint(1) NOT NULL COMMENT '索引类型',
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '索引说明',
  `action` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '操作',
  `modifier` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  `modification_time` datetime(3) NOT NULL COMMENT '修改时间',
  `version` int(11) NULL DEFAULT NULL COMMENT 'hibernate乐观锁使用',
  PRIMARY KEY (`info_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '历史索引信息记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for index_present_info
-- ----------------------------
DROP TABLE IF EXISTS `index_present_info`;
CREATE TABLE `index_present_info`  (
  `index_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '索引主键',
  `database_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据库主键',
  `table_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '表主键',
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '索引名称',
  `type_value` tinyint(1) NOT NULL COMMENT '索引类型',
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '索引说明',
  `modifier` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  `modification_time` datetime(3) NOT NULL COMMENT '修改时间',
  `active` tinyint(1) NOT NULL COMMENT '状态:有效,无效,伪删除',
  `version` int(11) NULL DEFAULT NULL COMMENT 'hibernate乐观锁使用',
  PRIMARY KEY (`index_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '当前索引信息记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for original_data_his_info
-- ----------------------------
DROP TABLE IF EXISTS `original_data_his_info`;
CREATE TABLE `original_data_his_info`  (
  `original_data_his_info_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '历史信息主键',
  `original_data_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '初始数据主键(外键)',
  `table_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '表主键(外键)',
  `action` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '操作行为',
  `insert_time` datetime(3) NULL DEFAULT NULL COMMENT '插入时间',
  `update_time` datetime(3) NULL DEFAULT NULL COMMENT '修改时间',
  `version` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `modifier` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  `version_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '版本主键(外键)',
  PRIMARY KEY (`original_data_his_info_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '初始数据历史表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for original_data_present_info
-- ----------------------------
DROP TABLE IF EXISTS `original_data_present_info`;
CREATE TABLE `original_data_present_info`  (
  `original_data_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '初始数据主键',
  `table_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '表主键(外键)',
  `insert_time` datetime(0) NULL DEFAULT NULL COMMENT '插入时间',
  `update_time` datetime(3) NULL DEFAULT NULL COMMENT '修改时间',
  `version` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `modifier` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  PRIMARY KEY (`original_data_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '初始数据当前表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sequence_his_info
-- ----------------------------
DROP TABLE IF EXISTS `sequence_his_info`;
CREATE TABLE `sequence_his_info`  (
  `version_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `info_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `database_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `table_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sequence_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `increament` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `start` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `max_value` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `modifier` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `action` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `insert_time` datetime(3) NULL DEFAULT NULL,
  `update_time` datetime(3) NULL DEFAULT NULL,
  `version` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`info_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sequence_present_info
-- ----------------------------
DROP TABLE IF EXISTS `sequence_present_info`;
CREATE TABLE `sequence_present_info`  (
  `sequence_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'sequence_id',
  `database_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `table_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `increament` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `start` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `max_value` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `modifier` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `active` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `insert_time` datetime(3) NULL DEFAULT NULL,
  `update_time` datetime(3) NULL DEFAULT NULL,
  `version` int(11) NOT NULL,
  PRIMARY KEY (`sequence_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for table_his_info
-- ----------------------------
DROP TABLE IF EXISTS `table_his_info`;
CREATE TABLE `table_his_info`  (
  `info_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '表历史信息表主键',
  `version_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '版本主键',
  `database_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据库主键',
  `table_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '表主键',
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表名称',
  `code` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表编码',
  `engine` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表引擎',
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表说明',
  `action` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '操作',
  `modifier` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  `modification_time` datetime(3) NOT NULL COMMENT '修改时间',
  `version` int(11) NULL DEFAULT NULL COMMENT 'hibernate乐观锁使用',
  PRIMARY KEY (`info_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '历史表信息记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for table_present_info
-- ----------------------------
DROP TABLE IF EXISTS `table_present_info`;
CREATE TABLE `table_present_info`  (
  `table_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '表主键',
  `database_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据库主键',
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '表名称',
  `code` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表编码',
  `engine` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表引擎',
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表说明',
  `active` tinyint(1) NOT NULL COMMENT '状态:有效,无效,伪删除',
  `modifier` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  `modification_time` datetime(3) NOT NULL COMMENT '修改时间',
  `version` int(11) NULL DEFAULT NULL COMMENT 'hibernate乐观锁使用',
  PRIMARY KEY (`table_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '当前表信息记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for version_info
-- ----------------------------
DROP TABLE IF EXISTS `version_info`;
CREATE TABLE `version_info`  (
  `version_id` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '版本主键',
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '版本名称',
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '版本说明',
  `modifier` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '修改人',
  `modification_time` datetime(3) NOT NULL COMMENT '修改时间',
  `active` tinyint(1) NOT NULL COMMENT '状态:有效,无效,伪删除',
  `status` tinyint(1) NOT NULL COMMENT '同一个应用，一个版本开放，其余关闭',
  `app_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '应用名称',
  `version` int(11) NULL DEFAULT NULL COMMENT 'hibernate乐观锁使用',
  `insert_time` datetime(3) NOT NULL COMMENT '版本信息插入时间',
  PRIMARY KEY (`version_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '版本记录表' ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
