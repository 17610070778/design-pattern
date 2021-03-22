package com.fuzhu.designpattern.model.state.machine;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/21 23:43
 */
public interface State {
    /**
     * 获取状态机的名字
     * @return
     */
    String getName();

    /**
     * 根据状态的名字变更到不同的状态
     * @param stateName
     * @param content
     * @return
     */
    void changeState(StateContent content, String stateName);
}
