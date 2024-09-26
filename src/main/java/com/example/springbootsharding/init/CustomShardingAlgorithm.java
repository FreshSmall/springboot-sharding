package com.example.springbootsharding.init;

import org.apache.shardingsphere.sharding.api.sharding.ShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

/**
 * @author: yinchao
 * @ClassName: CommontaskShardingAlgorithm
 * @Description:
 * @team wuhan operational dev.
 * @date: 2024/9/25 11:14
 */
public class CustomShardingAlgorithm implements StandardShardingAlgorithm<String> {


    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<String> rangeShardingValue) {
        // 7. 返回表路由结果
        return collection;
    }

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        final String sceneId = preciseShardingValue.getValue();
        final String newTableName = String.format("tmk_crm_common_task_%s", sceneId);
        if (!collection.contains(newTableName)) {
            collection.add(newTableName);
        }
        return newTableName;
    }

    @Override
    public String getType() {
        return "CUSTOM_SHARDING";
    }


    @Override
    public void init(Properties properties) {

    }
}
