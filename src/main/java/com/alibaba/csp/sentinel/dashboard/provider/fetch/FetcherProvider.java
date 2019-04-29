package com.alibaba.csp.sentinel.dashboard.provider.fetch;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.provider.ServiceProviderAdapter;
import com.alibaba.csp.sentinel.dashboard.provider.TypeServiceProvider;
import com.alibaba.csp.sentinel.dashboard.transpot.fetch.Fetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Getting fetcher service in spring container through type
 *
 * @author longqiang
 */
@Component
public class FetcherProvider extends ServiceProviderAdapter implements TypeServiceProvider<Fetcher> {

    @Autowired
    private Map<String, Fetcher> fetcherMap;

    @Override
    public Fetcher get(String app, String ip, Integer port, String type) {
        String dataSourceType = getDataSourceType(app, ip, port);
        String key = dataSourceType + type + Constants.FETCHER;
        return fetcherMap.get(key);
    }
}
