package com.alibaba.csp.sentinel.dashboard.transpot.fetch.nacos;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.AuthorityRuleEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static com.alibaba.csp.sentinel.dashboard.Constants.AUTHORITY_RULE;
import static com.alibaba.csp.sentinel.dashboard.Constants.DATASOURCE_NACOS;
import static com.alibaba.csp.sentinel.dashboard.Constants.FETCHER;

/**
 * fetch authority rule by nacos
 *
 * @author longqiang
 */
@Component(DATASOURCE_NACOS + AUTHORITY_RULE + FETCHER)
@ConditionalOnProperty(name = "disableNacos", havingValue = "false", matchIfMissing = true)
public class NacosAuthorityRuleFetcher extends NacosFetchAdapter<AuthorityRuleEntity> {
}
