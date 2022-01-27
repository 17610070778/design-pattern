package com.fuzhu.controller;

import com.fuzhu.designpattern.model.ResultInfo;
import com.fuzhu.service.LoadBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/28 12:29
 */
@RestController
@RequestMapping("/fuzhu/simple")
public class LoadBalanceController {

    @Autowired
    private LoadBalanceService loadBalanceService;


    /**
     * 测试负载均衡请查看配置文件
     * @return
     */
    @GetMapping("/testLoadbalance")
    public ResultInfo testLoadbalance(){
        return loadBalanceService.testLoadbalance();
    }
}
