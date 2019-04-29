package com.alibaba.csp.sentinel.dashboard.datasource.management;

import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static com.alibaba.csp.sentinel.dashboard.Constants.DATASOURCE_IN_MEMORY;
import static com.alibaba.csp.sentinel.dashboard.Constants.MANAGEMENT;

/**
 * InMemory Management
 *
 * @author longqiang
 */
@Component(DATASOURCE_IN_MEMORY + MANAGEMENT)
@ConditionalOnProperty(name = "disableInMemory", havingValue = "false", matchIfMissing = true)
public class InMemoryManagement implements DataSourceManagement {

    @Override
    public Object getOrCreateClient(DataSourceMachineInfo dataSourceMachineInfo) {
        return null;
    }

    @Override
    public DataSourceMachineInfo transfer(JSONObject jsonObject) {
        return jsonObject.toJavaObject(DataSourceMachineInfo.class);
    }
}
