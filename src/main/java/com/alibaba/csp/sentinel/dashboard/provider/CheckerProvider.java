package com.alibaba.csp.sentinel.dashboard.provider;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.controller.config.check.Checker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Getting checker service in spring container
 *
 * @author longqiang
 */
@Component
public class CheckerProvider extends ServiceProviderAdapter implements ServiceProvider<Checker> {

    @Autowired
    private Map<String, Checker> checkerMap;

    @Override
    public Checker get(String app, String ip, Integer port) {
        String dataSourceType = getDataSourceType(app, ip, port);
        return checkerMap.get(dataSourceType + Constants.CONFIG_CHANGE_CHECKER);
    }
}
