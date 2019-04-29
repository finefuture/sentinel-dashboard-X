package com.alibaba.csp.sentinel.dashboard.transpot.fetch.inmemory;

import com.alibaba.csp.sentinel.dashboard.client.SentinelApiClient;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.FlowRuleEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.alibaba.csp.sentinel.dashboard.Constants.DATASOURCE_IN_MEMORY;
import static com.alibaba.csp.sentinel.dashboard.Constants.FETCHER;
import static com.alibaba.csp.sentinel.dashboard.Constants.FLOW_RULE;

/**
 * Obtaining flow rules from Target Machines by http client
 *
 * @author longqiang
 */
@Component(DATASOURCE_IN_MEMORY + FLOW_RULE + FETCHER)
@ConditionalOnProperty(name = "disableInMemory", havingValue = "false", matchIfMissing = true)
public class InMemoryFlowRuleFetcher extends InMemoryFetchAdapter<FlowRuleEntity> {

    public InMemoryFlowRuleFetcher(SentinelApiClient sentinelApiClient) {
        super(sentinelApiClient);
    }

    @Override
    public List<FlowRuleEntity> fetch(String app, String ip, int port) {
        return sentinelApiClient.fetchFlowRuleOfMachine(app, ip, port);
    }

}
