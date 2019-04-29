package com.alibaba.csp.sentinel.dashboard.transpot.publish.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.DegradeRuleEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static com.alibaba.csp.sentinel.dashboard.Constants.DATASOURCE_APOLLO;
import static com.alibaba.csp.sentinel.dashboard.Constants.DEGRADE_RULE;
import static com.alibaba.csp.sentinel.dashboard.Constants.PUBLISHER;

/**
 * publish degrade rule by apollo
 *
 * @author longqiang
 */
@Component(DATASOURCE_APOLLO + DEGRADE_RULE + PUBLISHER)
@ConditionalOnProperty(name = "disableApollo", havingValue = "false", matchIfMissing = true)
public class ApolloDegradeRulePublisher extends ApolloPublishAdapter<DegradeRuleEntity> {
}
