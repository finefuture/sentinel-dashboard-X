package com.alibaba.csp.sentinel.dashboard;

/**
 * @author longqiang
 */
public class Constants {

    private Constants() {
        throw new IllegalStateException("Constants class");
    }

    public static final String PARAM_FLOW_RULE_STORE = "ParamFlowRuleStore";

    public static final String SYSTEM_RULE_STORE = "SystemRuleStore";

    public static final String AUTHORITY_RULE_STORE = "AuthorityRuleStore";

    public static final String DEGRADE_RULE_STORE = "DegradeRuleStore";

    public static final String FLOW_RULE_STORE = "FlowRuleStore";

    public static final String FETCHER = "Fetcher";

    public static final String PUBLISHER = "Publisher";

    public static final String STORE = "Store";

    public static final String CONFIG_CHANGE_CHECKER = "ConfigChangeChecker";

    public static final String MANAGEMENT = "Management";

    public static final String FLOW_RULE = "FlowRule";

    public static final String DEGRADE_RULE = "DegradeRule";

    public static final String AUTHORITY_RULE = "AuthorityRule";

    public static final String SYSTEM_RULE = "SystemRule";

    public static final String PARAM_FLOW_RULE = "ParamFlowRule";

    public static final String DATASOURCE_APOLLO = "Apollo";

    public static final String DATASOURCE_NACOS = "Nacos";

    public static final String DATASOURCE_IN_MEMORY = "InMemory";

}
