package com.fuzhu.designpattern.model.state.machine;


/**
 * 状态环境上下文
 *
 * @author 辅助
 * @version 1.0
 * @date 2021/3/21 23:43
 */

public interface StateContent {


    void setState(State state);

    /**
     * 设置下一个目标状态
     * @param stateName
     */
    public void nextState(String stateName);

    public String getStateName();
}
