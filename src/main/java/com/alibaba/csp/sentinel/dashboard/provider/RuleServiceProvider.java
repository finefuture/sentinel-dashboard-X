package com.alibaba.csp.sentinel.dashboard.provider;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.RuleEntity;

/**
 * Getting service in spring container by rule entity
 *
 * @author longqiang
 */
public interface RuleServiceProvider<T, R extends RuleEntity> {

    /**
     * get service by rule entity
     *
     * @param entity RuleEntity
     * @return T which service you need
     */
    T get(R entity);

}
