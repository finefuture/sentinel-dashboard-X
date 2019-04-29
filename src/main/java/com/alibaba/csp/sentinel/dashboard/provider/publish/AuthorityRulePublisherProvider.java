package com.alibaba.csp.sentinel.dashboard.provider.publish;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.AuthorityRuleEntity;
import org.springframework.stereotype.Component;

/**
 * Getting authority rule publisher service in spring container through authority rule entity generics
 *
 * @author longqiang
 */
@Component
public class AuthorityRulePublisherProvider extends PublisherProviderAdapter<AuthorityRuleEntity> {

    @Override
    protected String getType() {
        return Constants.AUTHORITY_RULE;
    }
}
