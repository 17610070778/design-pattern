package com.fuzhu.model.strateg;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author 浪客
 * @version V2.1
 * @since 2022/1/27 21:57
 */
@Component
public class MaxComputerStrategyContentImpl implements MaxComputerStrategyContent, ApplicationContextAware {


    private HashMap<String, MaxComputerStrategy> strategyHashMap = new HashMap<>();

    @Override
    public MaxComputerStrategy getStrategy(String Name) {
        return strategyHashMap.get(Name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        String[] beanNames = applicationContext.getBeanNamesForType(MaxComputerStrategy.class);
        for (int i = 0; i < beanNames.length; i++) {
            String beanName = beanNames[i];
            MaxComputerStrategy bean = (MaxComputerStrategy) applicationContext.getBean(beanName);
            strategyHashMap.put(bean.getName(), bean);
        }
    }
}
