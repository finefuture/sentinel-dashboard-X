package com.alibaba.csp.sentinel.dashboard.transpot.fetch.inmemory;

import com.alibaba.csp.sentinel.dashboard.client.SentinelApiClient;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.ParamFlowRuleEntity;
import com.alibaba.csp.sentinel.log.RecordLog;
import com.google.common.collect.Lists;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ExecutionException;

import static com.alibaba.csp.sentinel.dashboard.Constants.DATASOURCE_IN_MEMORY;
import static com.alibaba.csp.sentinel.dashboard.Constants.FETCHER;
import static com.alibaba.csp.sentinel.dashboard.Constants.PARAM_FLOW_RULE;

/**
 * Obtaining param flow rules from Target Machines by http client
 *
 * @author longqiang
 */
@Component(DATASOURCE_IN_MEMORY + PARAM_FLOW_RULE + FETCHER)
@ConditionalOnProperty(name = "disableInMemory", havingValue = "false", matchIfMissing = true)
public class InMemoryParamFlowRuleFetcher extends InMemoryFetchAdapter<ParamFlowRuleEntity> {

    public InMemoryParamFlowRuleFetcher(SentinelApiClient sentinelApiClient) {
        super(sentinelApiClient);
    }

    @Override
    public List<ParamFlowRuleEntity> fetch(String app, String ip, int port) {
        try {
            return sentinelApiClient.fetchParamFlowRulesOfMachine(app, ip, port).get();
        } catch (InterruptedException e) {
            RecordLog.warn("[InMemoryParamFlowRulePublisher] Error when publish with InterruptedException ", e);
        } catch (ExecutionException e) {
            RecordLog.warn("[InMemoryParamFlowRulePublisher] Error when publish with ExecutionException ", e);
        }
        return Lists.newArrayList();
    }
}
