package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author nnniu
 * @email nnniuzy@gmail.com
 * @date 2021-12-13 20:33:17
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
