package com.fuzhu.designpattern.model.state.machine.impl;

import com.fuzhu.designpattern.model.enums.StateEnums;
import com.fuzhu.designpattern.model.state.machine.State;
import com.fuzhu.designpattern.model.state.machine.StateContent;

/**
 * “变更完成”状态，不能变更为其他状态
 * @author 辅助
 * @version 1.0
 * @date 2021/3/22 16:14
 */
public class ChangeCompleted implements State {
    @Override
    public String getName() {
        return StateEnums.CHANGECOMPLETED.name();
    }

    @Override
    public void changeState(StateContent content, String stateName) {
        throw new RuntimeException("状态已到终点，不可变更为其他状态");
    }
}
