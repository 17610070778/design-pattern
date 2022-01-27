package com.fuzhu.controller;

import com.fuzhu.designpattern.model.ResultInfo;
import com.fuzhu.service.MaxComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 大数据计算平台策略
 *
 * @author 浪客
 * @version V2.1
 * @since 2022/1/27 21:44
 */
@RestController
@RequestMapping("/strategy")
public class MaxComputerController {

    @Autowired
    private MaxComputerService maxComputerService;

    @GetMapping("/handlerTask")
    public ResultInfo handlerTask(@RequestParam("taskId") String taskId, @RequestParam("handlerType") String handlerType) {
        return maxComputerService.handlerTask(taskId, handlerType);
    }
}
