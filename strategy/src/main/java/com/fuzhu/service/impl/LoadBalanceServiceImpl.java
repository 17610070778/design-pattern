package com.fuzhu.service.impl;

import com.fuzhu.designpattern.model.ResultInfo;
import com.fuzhu.model.strateg.LoadBalanceContent;
import com.fuzhu.service.LoadBalanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/28 12:30
 */
@Service
@Slf4j
public class LoadBalanceServiceImpl implements LoadBalanceService {

    @Autowired
    private LoadBalanceContent loadBalanceContent;

    @Override
    public ResultInfo testLoadbalance() {
        // 获取目标机器
        String host = loadBalanceContent.nextHost();
        log.info("目标主机是: {}", host);
        return ResultInfo.buildSuccess("success");
    }
}
