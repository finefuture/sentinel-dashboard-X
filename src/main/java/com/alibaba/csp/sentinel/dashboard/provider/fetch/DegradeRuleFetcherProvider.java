package com.alibaba.csp.sentinel.dashboard.provider.fetch;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.DegradeRuleEntity;
import org.springframework.stereotype.Component;

/**
 * Getting degrade rule fetcher service in spring container through degrade rule entity generics
 *
 * @author longqiang
 */
@Component
public class DegradeRuleFetcherProvider extends FetcherProviderAdapter<DegradeRuleEntity> {

    @Override
    protected String getType() {
        return Constants.DEGRADE_RULE;
    }
}
