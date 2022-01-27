package com.fuzhu.designpattern.model.state.machine.impl;

import com.fuzhu.designpattern.model.enums.StateEnums;
import com.fuzhu.designpattern.model.state.machine.State;
import com.fuzhu.designpattern.model.state.machine.StateContent;

/**
 * “评估中”只能变更为“待变更状态”
 * @author 辅助
 * @version 1.0
 * @date 2021/3/22 16:13
 */
public class UnderEvaluation implements State {
    @Override
    public String getName() {
        return StateEnums.UNDEREVALUATION.name();
    }

    @Override
    public void changeState(StateContent content, String stateName) {
        if (StateEnums.TOCHANGED.name().equals(stateName)){
            content.setState(new ToChanged());
        }else {
            throw new RuntimeException("不支持的状态变更");
        }
    }
}
