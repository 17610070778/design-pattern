package com.fuzhu.designpattern.model.state.machine;

/**
 * 状态环境上下文
 * @author 辅助
 * @version 1.0
 * @date 2021/3/21 23:43
 */
public class StateContent {

    /**
     * 当前环境的状态
     */
    private State state;

    public void nextState(String stateName){
        state.changeState(this, stateName);
    }

    public String getStateName() {
        return state.getName();
    }

    public void setState(State state) {
        this.state = state;
    }
}
