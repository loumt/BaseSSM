CREATE TABLE `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `product_num` varchar(50) NOT NULL COMMENT '产品编号',
  `product_name` varchar(50) DEFAULT NULL COMMENT '产品名称',
  `city_name` varchar(50) DEFAULT NULL COMMENT '出发城市',
  `departure_time` timestamp NULL DEFAULT NULL COMMENT '出发时间',
  `product_price` double DEFAULT NULL COMMENT '产品价格',
  `product_desc` varchar(256) DEFAULT NULL COMMENT '产品描述',
  `product_status` int(2) DEFAULT NULL COMMENT '产品状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品表';
