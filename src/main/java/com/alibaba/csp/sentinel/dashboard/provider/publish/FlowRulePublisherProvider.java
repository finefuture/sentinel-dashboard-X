package com.alibaba.csp.sentinel.dashboard.provider.publish;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.FlowRuleEntity;
import org.springframework.stereotype.Component;

/**
 * Getting flow rule publisher service in spring container through flow rule entity generics
 *
 * @author longqiang
 */
@Component
public class FlowRulePublisherProvider extends PublisherProviderAdapter<FlowRuleEntity> {

    @Override
    protected String getType() {
        return Constants.FLOW_RULE;
    }
}
