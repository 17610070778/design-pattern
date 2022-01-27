package com.fuzhu.model.strateg.impl.load.balance;

import com.fuzhu.model.strateg.AbstractLoadBalanceStrategy;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 轮询选择目标主机
 * @author 辅助
 * @version 1.0
 * @date 2021/3/28 10:59
 */
public class PollLoadBalance extends AbstractLoadBalanceStrategy {
    final AtomicInteger atomicInteger = new AtomicInteger(0);

    public PollLoadBalance(List<String> hosts) {
        super(hosts);
    }

    @Override
    public String getHost() {
        synchronized (atomicInteger){
            atomicInteger.compareAndSet(hosts.size() - 1, 0);
            int index = atomicInteger.getAndIncrement();
            System.out.println("轮询策略");
            return hosts.get(index);
        }
    }
}
