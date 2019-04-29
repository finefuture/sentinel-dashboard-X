package com.alibaba.csp.sentinel.dashboard.transpot.fetch.nacos;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.DegradeRuleEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static com.alibaba.csp.sentinel.dashboard.Constants.DATASOURCE_NACOS;
import static com.alibaba.csp.sentinel.dashboard.Constants.DEGRADE_RULE;
import static com.alibaba.csp.sentinel.dashboard.Constants.FETCHER;

/**
 * fetch degrade rule by nacos
 *
 * @author longqiang
 */
@Component(DATASOURCE_NACOS + DEGRADE_RULE + FETCHER)
@ConditionalOnProperty(name = "disableNacos", havingValue = "false", matchIfMissing = true)
public class NacosDegradeRuleFetcher extends NacosFetchAdapter<DegradeRuleEntity> {
}
