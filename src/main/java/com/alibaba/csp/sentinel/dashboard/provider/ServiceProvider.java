package com.alibaba.csp.sentinel.dashboard.provider;

/**
 * Getting service in spring container
 *
 * @author longqiang
 */
public interface ServiceProvider<T> {

    /**
     * get service
     *
     * @param app project name
     * @param ip project deployment IP
     * @param port project deployment port
     * @return T which service you need
     */
    T get(String app, String ip, Integer port);

}
