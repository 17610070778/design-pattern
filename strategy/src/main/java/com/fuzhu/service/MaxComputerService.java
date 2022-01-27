package com.fuzhu.service;

import com.fuzhu.designpattern.model.ResultInfo;

/**
 * @author 浪客
 * @version V2.1
 * @since 2022/1/27 22:04
 */
public interface MaxComputerService {

    public ResultInfo handlerTask(String taskId, String handlerType);
}
