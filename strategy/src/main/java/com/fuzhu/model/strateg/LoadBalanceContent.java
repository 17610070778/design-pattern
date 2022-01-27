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

public interface LoadBalanceContent {


    /**
     * 获取下一台主机
     * @return
     */
    public String nextHost();
}
