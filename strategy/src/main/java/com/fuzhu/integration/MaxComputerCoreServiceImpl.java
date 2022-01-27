package com.fuzhu.integration;

import org.springframework.stereotype.Service;

/**
 * @author 浪客
 * @version V2.1
 * @since 2022/1/27 22:22
 */
@Service
public class MaxComputerCoreServiceImpl implements MaxComputerCoreService {
    @Override
    public void process() {
        System.out.println("大数据计算平台为你提供服务");
    }
}
