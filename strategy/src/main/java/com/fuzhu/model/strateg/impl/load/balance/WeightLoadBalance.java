package com.fuzhu.model.strateg.impl.load.balance;

import com.fuzhu.model.strateg.AbstractLoadBalanceStrategy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 权重选择目标主机
 *
 * @author 辅助
 * @version 1.0
 * @date 2021/3/28 11:00
 */
public class WeightLoadBalance extends AbstractLoadBalanceStrategy {
    /**
     * ip 权重
     * 例: ["192.168.0.1", "192.168.0.1", "192.168.0.1", "192.168.0.2"]
     * 192.168.0.1 权重是3， 192.168.0.2 权重是1
     */
    private List<String> hostWeight;

    public WeightLoadBalance(List<String> hosts) {
        super(hosts);
        // 将每个主机ip，随机生成权重
        hostWeight = hosts.stream()
                .map(ip -> {
                    String[] ips = new String[(int) (Math.random() * 10)];
                    Arrays.fill(ips, ip);
                    return ips;
                })
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }
    @Override
    public String getHost() {
        Random random = new Random();
        int index = random.nextInt(hostWeight.size());
        System.out.println("权重策略");
        return hostWeight.get(index);
    }
}
