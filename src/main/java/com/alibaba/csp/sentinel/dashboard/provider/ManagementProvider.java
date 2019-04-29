package com.alibaba.csp.sentinel.dashboard.provider;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.datasource.management.DataSourceManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Getting management service in spring container
 *
 * @author longqiang
 */
@Component
public class ManagementProvider extends ServiceProviderAdapter implements ServiceProvider<DataSourceManagement> {

    @Autowired
    private Map<String, DataSourceManagement> managementMap;

    @Override
    public DataSourceManagement get(String app, String ip, Integer port) {
        String dataSourceType = getDataSourceType(app, ip, port);
        return managementMap.get(dataSourceType + Constants.MANAGEMENT);
    }
}
