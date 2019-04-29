package com.alibaba.csp.sentinel.dashboard.transpot.publish.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.SystemRuleEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static com.alibaba.csp.sentinel.dashboard.Constants.DATASOURCE_APOLLO;
import static com.alibaba.csp.sentinel.dashboard.Constants.PUBLISHER;
import static com.alibaba.csp.sentinel.dashboard.Constants.SYSTEM_RULE;

/**
 * publish system rule by apollo
 *
 * @author longqiang
 */
@Component(DATASOURCE_APOLLO + SYSTEM_RULE + PUBLISHER)
@ConditionalOnProperty(name = "disableApollo", havingValue = "false", matchIfMissing = true)
public class ApolloSystemRulePublisher extends ApolloPublishAdapter<SystemRuleEntity> {
}
