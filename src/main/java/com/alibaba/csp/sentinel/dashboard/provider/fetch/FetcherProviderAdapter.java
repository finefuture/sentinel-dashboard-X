package com.alibaba.csp.sentinel.dashboard.provider.fetch;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.RuleEntity;
import com.alibaba.csp.sentinel.dashboard.provider.RuleServiceProvider;
import com.alibaba.csp.sentinel.dashboard.provider.ServiceProviderAdapter;
import com.alibaba.csp.sentinel.dashboard.transpot.fetch.Fetcher;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Fetcher provider adapter
 *
 * @author longqiang
 */
public abstract class FetcherProviderAdapter<T extends RuleEntity> extends ServiceProviderAdapter implements RuleServiceProvider<Fetcher, T> {

    @Autowired
    private Map<String, Fetcher<T>> fetcherMap;

    @Override
    public Fetcher get(T entity) {
        String dataSourceType = getDataSourceType(entity.getApp(), entity.getIp(), entity.getPort());
        String type = getType();
        String key = dataSourceType + type + Constants.FETCHER;
        return fetcherMap.get(key);
    }

    /**
     * get rule entity type
     *
     * @return String service type of rule entity
     */
    protected abstract String getType();
}
