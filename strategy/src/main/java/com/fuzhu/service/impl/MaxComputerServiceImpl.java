package com.fuzhu.service.impl;

import com.fuzhu.designpattern.model.ResultInfo;
import com.fuzhu.model.strateg.MaxComputerStrategy;
import com.fuzhu.model.strateg.MaxComputerStrategyContent;
import com.fuzhu.service.MaxComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 浪客
 * @version V2.1
 * @since 2022/1/27 22:04
 */
@Service
public class MaxComputerServiceImpl implements MaxComputerService {

    @Autowired
    private MaxComputerStrategyContent computerStrategyContent;

    @Override
    public ResultInfo handlerTask(String taskId, String handlerType) {
        MaxComputerStrategy strategy = computerStrategyContent.getStrategy(handlerType);
        strategy.execute(taskId);
        return ResultInfo.buildSuccess("success");
    }
}
