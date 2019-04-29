package com.alibaba.csp.sentinel.dashboard.transpot.fetch.inmemory;

import com.alibaba.csp.sentinel.dashboard.client.SentinelApiClient;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.SystemRuleEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.alibaba.csp.sentinel.dashboard.Constants.DATASOURCE_IN_MEMORY;
import static com.alibaba.csp.sentinel.dashboard.Constants.FETCHER;
import static com.alibaba.csp.sentinel.dashboard.Constants.SYSTEM_RULE;

/**
 * Obtaining system rules from Target Machines by http client
 *
 * @author longqiang
 */
@Component(DATASOURCE_IN_MEMORY + SYSTEM_RULE + FETCHER)
@ConditionalOnProperty(name = "disableInMemory", havingValue = "false", matchIfMissing = true)
public class InMemorySystemRuleFetcher extends InMemoryFetchAdapter<SystemRuleEntity> {

    public InMemorySystemRuleFetcher(SentinelApiClient sentinelApiClient) {
        super(sentinelApiClient);
    }

    @Override
    public List<SystemRuleEntity> fetch(String app, String ip, int port) {
        return sentinelApiClient.fetchSystemRuleOfMachine(app, ip, port);
    }
}
