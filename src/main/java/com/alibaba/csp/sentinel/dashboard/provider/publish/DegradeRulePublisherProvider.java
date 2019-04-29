package com.alibaba.csp.sentinel.dashboard.provider.publish;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.DegradeRuleEntity;
import org.springframework.stereotype.Component;

/**
 * Getting degrade rule publisher service in spring container through degrade rule entity generics
 *
 * @author longqiang
 */
@Component
public class DegradeRulePublisherProvider extends PublisherProviderAdapter<DegradeRuleEntity> {

    @Override
    protected String getType() {
        return Constants.DEGRADE_RULE;
    }
}
