package com.example.springbootsharding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootsharding.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * @author: yinchao
 * @ClassName: OrderMapper
 * @Description:
 * @team wuhan operational dev.
 * @date: 2024/9/24 09:13
 */
@Mapper
@Service
public interface OrderMapper extends BaseMapper<OrderEntity> {
}
