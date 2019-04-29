package com.alibaba.csp.sentinel.dashboard.provider.fetch;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.SystemRuleEntity;
import org.springframework.stereotype.Component;

/**
 * Getting system rule fetcher service in spring container through system rule entity generics
 *
 * @author longqiang
 */
@Component
public class SystemRuleFetcherProvider extends FetcherProviderAdapter<SystemRuleEntity> {

    @Override
    protected String getType() {
        return Constants.SYSTEM_RULE;
    }
}
