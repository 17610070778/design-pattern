package com.fuzhu.model.strateg;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/28 12:32
 */

public interface LoadBalanceContent {


    /**
     * 获取下一台主机
     * @return
     */
    public String nextHost();
}
