package com.alibaba.csp.sentinel.dashboard.transpot.fetch.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.DegradeRuleEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static com.alibaba.csp.sentinel.dashboard.Constants.DATASOURCE_APOLLO;
import static com.alibaba.csp.sentinel.dashboard.Constants.DEGRADE_RULE;
import static com.alibaba.csp.sentinel.dashboard.Constants.FETCHER;

/**
 * fetch degrade rule by apollo
 *
 * @author longqiang
 */
@Component(DATASOURCE_APOLLO + DEGRADE_RULE + FETCHER)
@ConditionalOnProperty(name = "disableApollo", havingValue = "false", matchIfMissing = true)
public class ApolloDegradeRuleFetcher extends ApolloFetchAdapter<DegradeRuleEntity> {
}
