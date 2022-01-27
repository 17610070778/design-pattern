package com.fuzhu.designpattern.model.state.machine.impl;

import com.fuzhu.designpattern.model.enums.StateEnums;
import com.fuzhu.designpattern.model.state.machine.State;
import com.fuzhu.designpattern.model.state.machine.StateContent;

/**
 * “待变更”只能转变为“变更中” “待评估状态”
 * @author 辅助
 * @version 1.0
 * @date 2021/3/22 16:13
 */
public class ToChanged implements State {
    @Override
    public String getName() {
        return StateEnums.TOCHANGED.name();
    }

    @Override
    public void changeState(StateContent content, String targetStateName) {
        if (StateEnums.TOEVALUATE.name().equals(targetStateName)){
            // 如果传入的下一个状态为"待评估"，则变更状态
            content.setState(new UnderEvaluation());
        }if(StateEnums.CHANGING.name().equals(targetStateName)){
            // 如果传入的下一个状态为"变更中"，则变更状态
            content.setState(new Changing());
        }else {
            throw new RuntimeException("不支持的状态变更");
        }
    }
}
