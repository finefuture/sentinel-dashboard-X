package com.alibaba.csp.sentinel.dashboard.transpot.publish.nacos;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.ParamFlowRuleEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static com.alibaba.csp.sentinel.dashboard.Constants.DATASOURCE_NACOS;
import static com.alibaba.csp.sentinel.dashboard.Constants.PARAM_FLOW_RULE;
import static com.alibaba.csp.sentinel.dashboard.Constants.PUBLISHER;

/**
 * publish param flow rule by apollo
 *
 * @author longqiang
 */
@Component(DATASOURCE_NACOS + PARAM_FLOW_RULE + PUBLISHER)
@ConditionalOnProperty(name = "disableNacos", havingValue = "false", matchIfMissing = true)
public class NacosParamFlowRulePublisher extends NacosPublishAdapter<ParamFlowRuleEntity> {
}
