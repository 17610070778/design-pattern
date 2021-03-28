package com.fuzhu.model.strateg;

import java.util.List;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/28 10:55
 */
public abstract class AbstractLoadBalanceStrategy implements LoadBalanceStrategy {
    /**
     * 维护的主机ip地址列表
     */
    protected List<String> hosts;

    public AbstractLoadBalanceStrategy(List<String> hosts) {
        this.hosts = hosts;
    }
}
