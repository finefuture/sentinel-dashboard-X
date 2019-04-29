package com.alibaba.csp.sentinel.dashboard.transpot.publish.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.AuthorityRuleEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static com.alibaba.csp.sentinel.dashboard.Constants.AUTHORITY_RULE;
import static com.alibaba.csp.sentinel.dashboard.Constants.DATASOURCE_APOLLO;
import static com.alibaba.csp.sentinel.dashboard.Constants.PUBLISHER;

/**
 * publish authority rule by apollo
 *
 * @author longqiang
 */
@Component(DATASOURCE_APOLLO + AUTHORITY_RULE + PUBLISHER)
@ConditionalOnProperty(name = "disableApollo", havingValue = "false", matchIfMissing = true)
public class ApolloAuthorityRulePublisher extends ApolloPublishAdapter<AuthorityRuleEntity> {
}
