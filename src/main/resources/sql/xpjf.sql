CREATE DATABASE  IF NOT EXISTS `xpjf`  DEFAULT CHARACTER SET utf8 ;
USE `xpjf`;

/*用户信息表*/
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `username` varchar(100) DEFAULT NULL COMMENT '用户名-手机号登录',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '用户信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家庭成员信息表*/
DROP TABLE IF EXISTS `household_member`;
CREATE TABLE `household_member` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `member_surname` varchar(50) DEFAULT NULL COMMENT '家庭成员姓',
  `member_name` varchar(50) DEFAULT NULL COMMENT '家庭成员名',
  `member_nickname` varchar(100) DEFAULT NULL COMMENT '昵称',
  `gender` int(2) DEFAULT NULL COMMENT '性别，1：男，2：女',
  `main_flag` int(2) DEFAULT NULL COMMENT '主干成员标识，0：非主干，1：主干',
  `phone` varchar(100) DEFAULT NULL COMMENT '手机号',
  `birthday_time` varchar(50) DEFAULT NULL COMMENT '出生日期',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭id',
  `household_name` varchar(100) DEFAULT NULL COMMENT '家庭的名称',
  `head_img_url` varchar(2048) DEFAULT NULL COMMENT '头像地址',
  `introduction` varchar(1048) DEFAULT NULL COMMENT '简介',
  `member_detail` varchar(2048) DEFAULT NULL COMMENT '内容详情',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `father_id` int(11) DEFAULT NULL COMMENT '父亲id',
  `father_name` varchar(100) DEFAULT NULL COMMENT '父亲的名称',
  `mother_id` int(11) DEFAULT NULL COMMENT '母亲id',
  `mother_name` varchar(100) DEFAULT NULL COMMENT '母亲的名称',
  `spouse_id` int(11) DEFAULT NULL COMMENT '配偶id',
  `spouse_name` varchar(100) DEFAULT NULL COMMENT '配偶的名称',
  `married` int(2) DEFAULT '0' COMMENT '结婚标志，0：未成家，1：成家，默认为0',
  `relation_list` varchar(100) DEFAULT NULL COMMENT '关系路由，记录一层层父级的id，以“-”分割，如 5-3-1',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭成员表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家庭成员关系表*/
DROP TABLE IF EXISTS `household_relationship`;
CREATE TABLE `household_relationship` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `ma_id` int(11) DEFAULT NULL COMMENT '家庭成员A的id',
  `mb_id` int(11) DEFAULT NULL COMMENT '家庭成员B的id',
  `relationship_type` int(4) DEFAULT NULL COMMENT '关系类型，1：子与父；2：配与主；3：子与母',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭成员关系表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家庭信息表*/
DROP TABLE IF EXISTS `household_info`;
CREATE TABLE `household_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `household_name` varchar(100) DEFAULT NULL COMMENT '家庭的名称',
  `household_detail` varchar(2048) DEFAULT NULL COMMENT '家庭的描述',
  `surname` varchar(100) DEFAULT NULL COMMENT '姓氏',
  `head_id` int(11) DEFAULT NULL COMMENT '家庭户主的id',
  `head_name` varchar(100) DEFAULT NULL COMMENT '户主的名称',
  `openid` varchar(255) DEFAULT NULL COMMENT '微信openid',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*家庭相册表*/
DROP TABLE IF EXISTS `household_album`;
CREATE TABLE `household_album` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `album_title` varchar(255) DEFAULT NULL COMMENT '相册的名称',
  `album_description` varchar(2048) DEFAULT NULL COMMENT '相册的描述',
  `album_cover` varchar(2048) DEFAULT NULL COMMENT '相册的封面图地址',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭的id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '家庭相册表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*相册图片列表*/
DROP TABLE IF EXISTS `album_image`;
CREATE TABLE `album_image` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `image_url` varchar(2048) DEFAULT NULL COMMENT '相册的图地址',
  `album_id` int(11) DEFAULT NULL COMMENT '相册的id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '相册图片列表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*文章表*/
DROP TABLE IF EXISTS `article_info`;
CREATE TABLE `article_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `article_title` varchar(100) DEFAULT NULL COMMENT '文章的标题',
  `hm_id` int(11) DEFAULT NULL COMMENT '作者的id',
  `article_writer` varchar(100) DEFAULT NULL COMMENT '文章的作者',
  `article_content` text  COMMENT '文章详细内容',
  `type_id` int(4) DEFAULT '0' COMMENT '文章类型id',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '文章表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*帖子表*/
DROP TABLE IF EXISTS `post_info`;
CREATE TABLE `post_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `post_name` varchar(100) DEFAULT NULL COMMENT '帖子的名称',
  `hm_id` int(11) DEFAULT NULL COMMENT '作者的id',
  `post_writer` varchar(100) DEFAULT NULL COMMENT '帖子的作者',
  `post_content` text  COMMENT '帖子的内容',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '帖子表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*评论表*/
DROP TABLE IF EXISTS `comment_info`;
CREATE TABLE `comment_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `comment_content` varchar(2048) DEFAULT NULL COMMENT '评论的内容',
  `hm_id` int(11) DEFAULT NULL COMMENT '评论人的id',
  `comment_writer` varchar(100) DEFAULT NULL COMMENT '评论人',
  `replier_id` int(11) DEFAULT NULL COMMENT '回复某人的id',
  `replier_name` varchar(100) DEFAULT NULL COMMENT '回复某人的姓名',
  `household_id` int(11) DEFAULT NULL COMMENT '家庭id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
  PRIMARY KEY (`id`)
) COMMENT = '评论表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

