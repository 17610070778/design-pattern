package com.fuzhu.designpattern.model.state.machine.impl;

import com.fuzhu.designpattern.model.enums.StateEnums;
import com.fuzhu.designpattern.model.state.machine.State;
import com.fuzhu.designpattern.model.state.machine.StateContent;

/**
 * “待评估状态”只能变更为“评估中”状态
 * @author 辅助
 * @version 1.0
 * @date 2021/3/22 16:13
 */
public class ToEvaluate implements State {
    @Override
    public String getName() {
        return StateEnums.TOEVALUATE.name();
    }

    @Override
    public void changeState(StateContent content, String stateName) {
        if (StateEnums.UNDEREVALUATION.name().equals(stateName)){
            // 如果传入的下一个状态为评估中，则变更状态
            content.setState(new UnderEvaluation());
        }else {
            throw new RuntimeException("不支持的状态变更");
        }
    }
}
