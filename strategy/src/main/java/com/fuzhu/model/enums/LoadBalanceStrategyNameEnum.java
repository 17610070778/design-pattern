package com.fuzhu.model.enums;

/**
 * 负载均衡名字
 *
 * @author 浪客
 * @version V2.1
 * @since 2022/1/27 21:49
 */
public enum LoadBalanceStrategyNameEnum {
    /**
     * 轮询
     */
    POLL,
    /**
     * 随机
     */
    RANDOM,
    /**
     * 权重
     */
    WEIGHT,;

}
