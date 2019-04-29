package com.alibaba.csp.sentinel.dashboard.provider;

import com.alibaba.csp.sentinel.dashboard.datasource.management.DataSourceMachineInfo;
import com.alibaba.csp.sentinel.dashboard.datasource.management.DataSourceType;
import com.alibaba.csp.sentinel.dashboard.discovery.AppManagement;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Service provider adapter
 *
 * @author longqiang
 */
public abstract class ServiceProviderAdapter {

    @Autowired
    AppManagement appManagement;

    protected String getDataSourceType(String app, String ip, Integer port) {
        return Optional.ofNullable(appManagement.getDetailApp(app))
                        .flatMap(appInfo -> appInfo.getMachine(ip, port))
                        .map(machineInfo -> ((DataSourceMachineInfo)machineInfo).getDataSourceType())
                        .map(DataSourceType::name)
                        .orElseThrow(() -> new NoSuchElementException("Not provider datasource"));
    }

}
