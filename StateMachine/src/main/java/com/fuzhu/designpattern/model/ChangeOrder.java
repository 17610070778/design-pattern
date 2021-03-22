package com.fuzhu.designpattern.model;

/**
 * 变更单
 * @author 辅助
 * @version 1.0
 * @date 2021/3/22 17:51
 */
public class ChangeOrder {
    private Integer id;
    private String state;
    // 剩余字段略

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ChangeOrder(Integer id, String state) {
        this.id = id;
        this.state = state;
    }
}
