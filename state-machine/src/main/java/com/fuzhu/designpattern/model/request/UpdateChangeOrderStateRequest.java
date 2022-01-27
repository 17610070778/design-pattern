package com.fuzhu.designpattern.model.request;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/22 18:05
 */
public class UpdateChangeOrderStateRequest {
    private Integer id;

    private String nextState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNextState() {
        return nextState;
    }

    public void setNextState(String nextState) {
        this.nextState = nextState;
    }
}
