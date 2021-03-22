package com.fuzhu.designpattern.model;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/22 17:56
 */
public class ResultInfo {

    private boolean success;

    private Object data;

    public static ResultInfo buildSuccess(Object data){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setSuccess(true);
        resultInfo.setData(data);
        return resultInfo;
    }

    public static ResultInfo buildFaild(Object data){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setSuccess(false);
        resultInfo.setData(data);
        return resultInfo;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
