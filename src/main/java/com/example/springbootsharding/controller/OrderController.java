package com.example.springbootsharding.controller;

import com.example.springbootsharding.entity.OrderEntity;
import com.example.springbootsharding.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author: yinchao
 * @ClassName: OrderController
 * @Description:
 * @team wuhan operational dev.
 * @date: 2024/9/24 12:22
 */
@RestController
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/saveOrder")
    public String saveOrder() {
        for (int i = 0; i < 10; i++) {
            final OrderEntity order = new OrderEntity();
            order.setUserId(1L);
            order.setState(0);
            order.setTotalPrice(new BigDecimal((i + 1) * 5));
            order.setCreateTime(LocalDateTime.now());
            order.setUpdateTime(order.getCreateTime());
            orderMapper.insert(order);
        }
        return "saveOrder";
    }
}
