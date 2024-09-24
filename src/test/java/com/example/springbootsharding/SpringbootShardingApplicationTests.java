package com.example.springbootsharding;

import com.example.springbootsharding.entity.OrderEntity;
import com.example.springbootsharding.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootShardingApplication.class)
class SpringbootShardingApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private DataSource dataSource;


    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getConnection());
        for (int i = 0; i < 4; i++) {
            final OrderEntity order = new OrderEntity();
            order.setUserId(1L);
            order.setState(0);
            order.setTotalPrice(new BigDecimal((i + 1) * 5));
            order.setCreateTime(LocalDateTime.now());
            order.setUpdateTime(order.getCreateTime());
            orderMapper.insert(order);
        }
    }

}
