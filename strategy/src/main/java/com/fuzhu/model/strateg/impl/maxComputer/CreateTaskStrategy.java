package com.fuzhu.model.strateg.impl.maxComputer;

import com.fuzhu.model.enums.MaxComputerStrategyNameEnum;
import com.fuzhu.model.strateg.MaxComputerStrategy;
import org.springframework.stereotype.Component;

/**
 * @author 浪客
 * @version V2.1
 * @since 2022/1/27 21:53
 */
@Component
public class CreateTaskStrategy implements MaxComputerStrategy {
    @Override
    public String getName() {
        return MaxComputerStrategyNameEnum.CREATE.name();
    }

    @Override
    public void execute(String taskId) {
        System.out.println("任务：" + taskId + " 创建中。。。");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务：" + taskId + " 创建完成。。。");
    }
}
