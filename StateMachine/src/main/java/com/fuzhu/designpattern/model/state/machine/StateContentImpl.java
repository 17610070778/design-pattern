package com.fuzhu.designpattern.model.state.machine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangyq26022@yunrong.cn
 * @version V2.1
 * @since 2022/1/27 10:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateContentImpl implements StateContent {
    /**
     * 当前环境的状态
     */
    private State state;


    @Override
    public void nextState(String stateName) {
        state.changeState(this, stateName);
    }

    @Override
    public String getStateName() {
        return state.getName();
    }

}
