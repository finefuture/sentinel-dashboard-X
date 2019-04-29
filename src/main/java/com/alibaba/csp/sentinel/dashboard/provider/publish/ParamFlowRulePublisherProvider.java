package com.alibaba.csp.sentinel.dashboard.provider.publish;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.ParamFlowRuleEntity;
import org.springframework.stereotype.Component;

/**
 * Getting param flow rule publisher service in spring container through param flow rule entity generics
 *
 * @author longqiang
 */
@Component
public class ParamFlowRulePublisherProvider extends PublisherProviderAdapter<ParamFlowRuleEntity> {

    @Override
    protected String getType() {
        return Constants.PARAM_FLOW_RULE;
    }
}
