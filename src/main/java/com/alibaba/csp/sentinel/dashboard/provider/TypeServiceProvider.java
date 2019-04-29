package com.alibaba.csp.sentinel.dashboard.provider;

/**
 * Getting service in spring container by type
 *
 * @author longqiang
 */
public interface TypeServiceProvider<T> {

    /**
     * get service
     *
     * @param app project name
     * @param ip project deployment IP
     * @param port project deployment port
     * @param type service type name
     * @return T which service you need
     */
    T get(String app, String ip, Integer port, String type);

}
