package com.fuzhu.designpattern.model.state.machine.impl;

import com.fuzhu.designpattern.model.enums.StateEnums;
import com.fuzhu.designpattern.model.state.machine.State;
import com.fuzhu.designpattern.model.state.machine.StateContent;

/**
 * “变更中”状态，只能变更为"待评估", "变更完成"状态
 *
 * @author 辅助
 * @version 1.0
 * @date 2021/3/21 23:45
 */
public class Changing implements State {


    @Override
    public String getName() {
        return StateEnums.CHANGING.name();
    }

    @Override
    public void changeState(StateContent content, String stateName) {
        if (StateEnums.TOEVALUATE.name().equals(stateName)){
            // 待评估
            content.setState(new ToEvaluate());
        }else if (StateEnums.CHANGECOMPLETED.name().equals(stateName)){
            // 变更完成
            content.setState(new ChangeCompleted());
        }else {
            throw new RuntimeException("不支持的状态变更");
        }
    }


}
