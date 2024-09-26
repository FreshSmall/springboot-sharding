package com.example.springbootsharding;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.springbootsharding.entity.CommonTaskEntity;
import com.example.springbootsharding.entity.OrderEntity;
import com.example.springbootsharding.mapper.CommonTaskMapper;
import com.example.springbootsharding.mapper.OrderMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootShardingApplication.class)
class SpringbootShardingApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private CommonTaskMapper commonTaskMapper;

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

    @Test
    void saveTask() {
        final String sceneId = "5d97";
        final CommonTaskEntity entity = new CommonTaskEntity();
        entity.setSceneId(sceneId);
        entity.setTaskNumber("abc");
        commonTaskMapper.insert(entity);
    }

    @Test
    void searchTask() {
        final String sceneId = "ffc4";
        final LambdaQueryWrapper<CommonTaskEntity> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(CommonTaskEntity::getSceneId, sceneId);
        final List<CommonTaskEntity> entityList = commonTaskMapper.selectList(queryWrapper);
        Assert.assertNotNull(entityList);
    }

}
