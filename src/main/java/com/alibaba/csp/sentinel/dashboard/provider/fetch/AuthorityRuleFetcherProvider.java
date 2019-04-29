package com.alibaba.csp.sentinel.dashboard.provider.fetch;

import com.alibaba.csp.sentinel.dashboard.Constants;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.AuthorityRuleEntity;
import org.springframework.stereotype.Component;

/**
 * Getting authority rule fetcher service in spring container through authority rule entity generics
 *
 * @author longqiang
 */
@Component
public class AuthorityRuleFetcherProvider extends FetcherProviderAdapter<AuthorityRuleEntity> {

    @Override
    protected String getType() {
        return Constants.AUTHORITY_RULE;
    }
}
