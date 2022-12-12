package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * ����
 * 
 * @author djq
 * @email 3078524100@qq.com
 * @date 2022-12-12 19:31:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
