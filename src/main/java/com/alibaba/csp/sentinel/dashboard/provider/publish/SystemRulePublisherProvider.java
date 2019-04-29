package com.alibaba.csp.sentinel.dashboard.provider.publish;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.SystemRuleEntity;
import org.springframework.stereotype.Component;

/**
 * Getting system rule publisher service in spring container through system rule entity generics
 *
 * @author longqiang
 */
@Component
public class SystemRulePublisherProvider extends PublisherProviderAdapter<SystemRuleEntity> {

    @Override
    protected String getType() {
        return Constants.SYSTEM_RULE;
    }
}
