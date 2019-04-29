package com.alibaba.csp.sentinel.dashboard.provider.fetch;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.ParamFlowRuleEntity;
import org.springframework.stereotype.Component;

/**
 * Getting param flow rule fetcher service in spring container through param flow rule entity generics
 *
 * @author longqiang
 */
@Component
public class ParamFlowRuleFetcherProvider extends FetcherProviderAdapter<ParamFlowRuleEntity> {

    @Override
    protected String getType() {
        return Constants.PARAM_FLOW_RULE;
    }
}
