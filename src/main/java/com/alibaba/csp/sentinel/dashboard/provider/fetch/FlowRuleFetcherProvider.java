package com.alibaba.csp.sentinel.dashboard.provider.fetch;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.FlowRuleEntity;
import org.springframework.stereotype.Component;

/**
 * Getting flow rule fetcher service in spring container through flow rule entity generics
 *
 * @author longqiang
 */
@Component
public class FlowRuleFetcherProvider extends FetcherProviderAdapter<FlowRuleEntity> {

    @Override
    protected String getType() {
        return Constants.FLOW_RULE;
    }
}
