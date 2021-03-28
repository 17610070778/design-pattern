package com.fuzhu.model.strateg.impl;

import com.fuzhu.model.strateg.AbstractLoadBalanceStrategy;

import java.util.List;

/**
 * 随机选择目标主机
 * @author 辅助
 * @version 1.0
 * @date 2021/3/28 10:59
 */
public class RandomLoadBalance extends AbstractLoadBalanceStrategy {

    public RandomLoadBalance(List<String> hosts) {
        super(hosts);
    }

    @Override
    public String getHost() {
        // 随机选择目标主机
        int random = (int)(Math.random() * 10000);
        return hosts.get(random % hosts.size());
    }
}
