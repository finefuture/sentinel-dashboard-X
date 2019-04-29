package com.alibaba.csp.sentinel.dashboard.transpot.fetch.nacos;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.SystemRuleEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static com.alibaba.csp.sentinel.dashboard.Constants.DATASOURCE_NACOS;
import static com.alibaba.csp.sentinel.dashboard.Constants.FETCHER;
import static com.alibaba.csp.sentinel.dashboard.Constants.SYSTEM_RULE;

/**
 * fetch system rule by nacos
 *
 * @author longqiang
 */
@Component(DATASOURCE_NACOS + SYSTEM_RULE + FETCHER)
@ConditionalOnProperty(name = "disableNacos", havingValue = "false", matchIfMissing = true)
public class NacosSystemRuleFetcher extends NacosFetchAdapter<SystemRuleEntity> {
}
