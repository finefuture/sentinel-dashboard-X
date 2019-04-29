package com.alibaba.csp.sentinel.dashboard.provider.publish;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.RuleEntity;
import com.alibaba.csp.sentinel.dashboard.provider.RuleServiceProvider;
import com.alibaba.csp.sentinel.dashboard.provider.ServiceProviderAdapter;
import com.alibaba.csp.sentinel.dashboard.transpot.publish.Publisher;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Publisher provider adapter
 *
 * @author longqiang
 */
public abstract class PublisherProviderAdapter<T extends RuleEntity> extends ServiceProviderAdapter implements RuleServiceProvider<Publisher, T> {

    @Autowired
    private Map<String, Publisher<T>> publisherMap;

    @Override
    public Publisher get(T entity) {
        String dataSourceType = getDataSourceType(entity.getApp(), entity.getIp(), entity.getPort());
        String type = getType();
        String key = dataSourceType + type + Constants.PUBLISHER;
        return publisherMap.get(key);
    }

    /**
     * get rule entity type
     *
     * @return String service type of rule entity
     */
    protected abstract String getType();

}
