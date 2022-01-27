package com.fuzhu.model.strateg.impl;

import com.fuzhu.integration.MaxComputerCoreService;
import com.fuzhu.model.strateg.TaskStrategy;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 浪客
 * @version V2.1
 * @since 2022/1/27 22:20
 */
public abstract class AbstractTaskStrategy implements TaskStrategy {
    @Autowired
    protected MaxComputerCoreService maxComputerCoreService;

}
