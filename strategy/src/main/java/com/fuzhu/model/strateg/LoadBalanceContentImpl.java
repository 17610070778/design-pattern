package com.fuzhu.model.strateg;

import com.fuzhu.model.enums.LoadBalanceStrategyNameEnum;
import com.fuzhu.model.strateg.impl.load.balance.PollLoadBalance;
import com.fuzhu.model.strateg.impl.load.balance.RandomLoadBalance;
import com.fuzhu.model.strateg.impl.load.balance.WeightLoadBalance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 浪客
 * @version V2.1
 * @since 2022/1/27 21:40
 */
@Component
public class LoadBalanceContentImpl implements LoadBalanceContent {
    @Value("${loadBalanceName}")
    private String loadBalanceName;

    private HashMap<String, LoadBalanceStrategy> loadBalanceMap;

    public LoadBalanceContentImpl() {
        // 假如初始化 3台机器
        ArrayList<String> hosts = new ArrayList<>();
        hosts.add("192.168.0.1");
        hosts.add("192.168.0.2");
        hosts.add("192.168.0.3");
        // 初始化负载均衡器
        loadBalanceMap = new HashMap<>();
        loadBalanceMap.put(LoadBalanceStrategyNameEnum.POLL.name(), new PollLoadBalance(hosts));
        loadBalanceMap.put(LoadBalanceStrategyNameEnum.WEIGHT.name(), new WeightLoadBalance(hosts));
        loadBalanceMap.put(LoadBalanceStrategyNameEnum.RANDOM.name(), new RandomLoadBalance(hosts));
    }

    @Override
    public String nextHost() {
        return loadBalanceMap.get(loadBalanceName).getHost();
    }


    private enum LoadBalanceName {

    }
}
