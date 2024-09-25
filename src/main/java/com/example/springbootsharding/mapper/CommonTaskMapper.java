package com.example.springbootsharding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootsharding.entity.CommonTaskEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * @author: yinchao
 * @ClassName: CommonTaskMapper
 * @Description:
 * @team wuhan operational dev.
 * @date: 2024/9/25 10:44
 */
@Mapper
@Service
public interface CommonTaskMapper extends BaseMapper<CommonTaskEntity> {
}
