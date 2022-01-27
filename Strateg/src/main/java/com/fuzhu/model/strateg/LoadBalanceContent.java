package com.fuzhu.model.strateg;

import com.fuzhu.model.strateg.impl.PollLoadBalance;
import com.fuzhu.model.strateg.impl.RandomLoadBalance;
import com.fuzhu.model.strateg.impl.WeightLoadBalance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/28 12:32
 */
@Component
public class LoadBalanceContent {

    @Value("${loadBalanceName}")
    private String LoadBalanceName;

    private HashMap<String, LoadBalanceStrategy> loadBalanceMap;

    public LoadBalanceContent() {
        // 假如初始化 3台机器
        ArrayList<String> hosts = new ArrayList<>();
        hosts.add("192.168.0.1");
        hosts.add("192.168.0.2");
        hosts.add("192.168.0.3");
        // 初始化负载均衡器
        loadBalanceMap = new HashMap<>();
        loadBalanceMap.put("POLL", new PollLoadBalance(hosts));
        loadBalanceMap.put("WEIGHT", new WeightLoadBalance(hosts));
        loadBalanceMap.put("RANDOM", new RandomLoadBalance(hosts));
    }

    /**
     * 获取下一台主机
     * @return
     */
    public String nextHost() {
        return loadBalanceMap.get(LoadBalanceName).getHost();
    }
}