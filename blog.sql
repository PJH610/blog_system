/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-11-16 16:03:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `jh_articles`
-- ----------------------------
DROP TABLE IF EXISTS `jh_articles`;
CREATE TABLE `jh_articles` (
  `id` bigint(20) NOT NULL COMMENT '博文ID',
  `user_id` bigint(20) NOT NULL COMMENT '发表用户ID',
  `article_title` text NOT NULL COMMENT '博文标题',
  `article_content` longblob NOT NULL COMMENT '博文内容',
  `article_views` bigint(20) NOT NULL COMMENT '浏览量',
  `article_comment_count` bigint(20) NOT NULL COMMENT '评论总数',
  `article_date` datetime NOT NULL COMMENT '发表日期',
  `article_like_count` bigint(20) NOT NULL COMMENT '发表点赞数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jh_articles
-- ----------------------------

-- ----------------------------
-- Table structure for `jh_comments`
-- ----------------------------
DROP TABLE IF EXISTS `jh_comments`;
CREATE TABLE `jh_comments` (
  `id` bigint(20) NOT NULL COMMENT '评论ID',
  `user_id` bigint(20) NOT NULL COMMENT '发表用户ID',
  `article_id` bigint(20) NOT NULL COMMENT '评论文字ID',
  `comment_like_count` bigint(20) NOT NULL COMMENT '点赞数',
  `comment_date` datetime NOT NULL COMMENT '评论日期',
  `comment_content` text NOT NULL COMMENT '评论内容',
  `parent_comment_id` bigint(20) NOT NULL COMMENT '父评论ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jh_comments
-- ----------------------------

-- ----------------------------
-- Table structure for `jh_download_file`
-- ----------------------------
DROP TABLE IF EXISTS `jh_download_file`;
CREATE TABLE `jh_download_file` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `file_name` varchar(255) NOT NULL,
  `file_url` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jh_download_file
-- ----------------------------

-- ----------------------------
-- Table structure for `jh_floors`
-- ----------------------------
DROP TABLE IF EXISTS `jh_floors`;
CREATE TABLE `jh_floors` (
  `id` bigint(20) NOT NULL COMMENT '回帖ID',
  `user_id` bigint(20) NOT NULL COMMENT '回帖用户ID',
  `post_id` bigint(20) NOT NULL COMMENT '所属主贴ID',
  `floor_content` longtext NOT NULL COMMENT '回帖内容',
  `floor_date` datetime NOT NULL COMMENT '回帖时间',
  `parent_floor_id` bigint(20) NOT NULL COMMENT '父回帖ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jh_floors
-- ----------------------------

-- ----------------------------
-- Table structure for `jh_friend_links`
-- ----------------------------
DROP TABLE IF EXISTS `jh_friend_links`;
CREATE TABLE `jh_friend_links` (
  `id` bigint(20) NOT NULL COMMENT '友链ID',
  `friend_links` varchar(255) NOT NULL COMMENT '友链链接',
  `friend_link_name` varchar(20) NOT NULL COMMENT '友链名称',
  `friend_link_description` text NOT NULL COMMENT '友链描述',
  `friend_link_logo` varchar(255) NOT NULL COMMENT '友链Logo',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jh_friend_links
-- ----------------------------

-- ----------------------------
-- Table structure for `jh_labels`
-- ----------------------------
DROP TABLE IF EXISTS `jh_labels`;
CREATE TABLE `jh_labels` (
  `id` bigint(20) NOT NULL COMMENT '标签ID',
  `label_name` varchar(20) NOT NULL COMMENT '标签名称',
  `lable_alias` varchar(15) NOT NULL COMMENT '标签别名',
  `lable_description` text NOT NULL COMMENT '标签描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jh_labels
-- ----------------------------

-- ----------------------------
-- Table structure for `jh_menus`
-- ----------------------------
DROP TABLE IF EXISTS `jh_menus`;
CREATE TABLE `jh_menus` (
  `id` bigint(20) NOT NULL COMMENT '总菜单ID',
  `menu_name` varchar(20) NOT NULL COMMENT '总菜单名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jh_menus
-- ----------------------------

-- ----------------------------
-- Table structure for `jh_moderator`
-- ----------------------------
DROP TABLE IF EXISTS `jh_moderator`;
CREATE TABLE `jh_moderator` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '版主ID',
  `forum_id` bigint(20) NOT NULL COMMENT '论坛ID',
  `moderator_level` varchar(20) NOT NULL COMMENT '版主级别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='版主表';

-- ----------------------------
-- Records of jh_moderator
-- ----------------------------
INSERT INTO `jh_moderator` VALUES ('1', '2', '111');
INSERT INTO `jh_moderator` VALUES ('2', '3', '222');
INSERT INTO `jh_moderator` VALUES ('4', '4', '4');

-- ----------------------------
-- Table structure for `jh_options`
-- ----------------------------
DROP TABLE IF EXISTS `jh_options`;
CREATE TABLE `jh_options` (
  `id` int(11) NOT NULL COMMENT '选项ID',
  `option_name` varchar(255) NOT NULL COMMENT '选项名称',
  `option_values` longtext NOT NULL COMMENT '选项值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='这是网站管理表';

-- ----------------------------
-- Records of jh_options
-- ----------------------------

-- ----------------------------
-- Table structure for `jh_posts`
-- ----------------------------
DROP TABLE IF EXISTS `jh_posts`;
CREATE TABLE `jh_posts` (
  `id` bigint(20) NOT NULL COMMENT '主体ID',
  `forum_id` bigint(20) NOT NULL COMMENT '论坛ID',
  `user_id` bigint(20) NOT NULL COMMENT '回帖用户ID',
  `post_title` text NOT NULL COMMENT '帖子标题',
  `post_views` bigint(20) NOT NULL COMMENT '帖子浏览量',
  `post_content` longtext NOT NULL COMMENT '帖子内容',
  `post_date` datetime NOT NULL COMMENT '发帖时间',
  `post_status` varchar(20) NOT NULL COMMENT '帖子状态',
  `post_comment_count` bigint(20) NOT NULL COMMENT '回帖个数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jh_posts
-- ----------------------------

-- ----------------------------
-- Table structure for `jh_set_article_label`
-- ----------------------------
DROP TABLE IF EXISTS `jh_set_article_label`;
CREATE TABLE `jh_set_article_label` (
  `article_id` bigint(20) NOT NULL,
  `label` bigint(20) NOT NULL,
  PRIMARY KEY (`article_id`,`label`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jh_set_article_label
-- ----------------------------

-- ----------------------------
-- Table structure for `jh_set_artitle_sort`
-- ----------------------------
DROP TABLE IF EXISTS `jh_set_artitle_sort`;
CREATE TABLE `jh_set_artitle_sort` (
  `article_id` bigint(20) NOT NULL COMMENT '文章ID',
  `sort_id` bigint(20) NOT NULL COMMENT '分类ID',
  PRIMARY KEY (`article_id`,`sort_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jh_set_artitle_sort
-- ----------------------------

-- ----------------------------
-- Table structure for `jh_sorts`
-- ----------------------------
DROP TABLE IF EXISTS `jh_sorts`;
CREATE TABLE `jh_sorts` (
  `id` bigint(20) NOT NULL COMMENT '父类ID',
  `sort_name` varchar(50) NOT NULL COMMENT '分类名称',
  `sort_alias` varchar(15) NOT NULL COMMENT '分类别名',
  `sort_description` text NOT NULL COMMENT '分类描述',
  `parent_sort_id` bigint(20) NOT NULL COMMENT '父分类ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jh_sorts
-- ----------------------------

-- ----------------------------
-- Table structure for `jh_submenus`
-- ----------------------------
DROP TABLE IF EXISTS `jh_submenus`;
CREATE TABLE `jh_submenus` (
  `id` bigint(20) NOT NULL COMMENT '子菜单ID',
  `menu_id` bigint(20) NOT NULL COMMENT '总菜单ID',
  `link_name` varchar(255) NOT NULL COMMENT '子菜单名称',
  `link_target` varchar(255) NOT NULL COMMENT '子菜单链接',
  `link_open_way` varchar(20) NOT NULL COMMENT '子菜单打开方式',
  `parent_link_id` bigint(20) NOT NULL COMMENT '父菜单ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jh_submenus
-- ----------------------------

-- ----------------------------
-- Table structure for `jh_users`
-- ----------------------------
DROP TABLE IF EXISTS `jh_users`;
CREATE TABLE `jh_users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `name` varchar(255) NOT NULL COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `mobile_phone` varchar(20) NOT NULL COMMENT '手机号',
  `email` varchar(50) NOT NULL COMMENT '邮箱',
  `role_type` tinyint(4) NOT NULL COMMENT '角色值',
  `freeze` int(4) NOT NULL COMMENT '冻结',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jh_users
-- ----------------------------
INSERT INTO `jh_users` VALUES ('1', 'jh', '123456', '13025657208', '1@qq.com', '1', '1');
INSERT INTO `jh_users` VALUES ('2', '13025657206', 'c43a8bae0c30066eb6b8bf09de1d2f82', '13025657206', '2422553065@qq.com', '2', '1');
INSERT INTO `jh_users` VALUES ('3', '13432389883', '10eda5d00ed7073a69e63c989ec5d8af', '13432389883', '2422553065@qq.com', '2', '1');

-- ----------------------------
-- Table structure for `jh_user_friends`
-- ----------------------------
DROP TABLE IF EXISTS `jh_user_friends`;
CREATE TABLE `jh_user_friends` (
  `id` bigint(20) NOT NULL COMMENT '标识ID',
  `user_id` bigint(20) NOT NULL COMMENT '用户ID',
  `user_friends_id` bigint(20) NOT NULL COMMENT '好友ID',
  `user_note` varchar(20) NOT NULL COMMENT '好友备注',
  `user_status` varchar(20) NOT NULL COMMENT '好友状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jh_user_friends
-- ----------------------------
