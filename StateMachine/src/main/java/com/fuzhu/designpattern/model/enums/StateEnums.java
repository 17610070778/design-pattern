package com.fuzhu.designpattern.model.enums;

import com.fuzhu.designpattern.model.state.machine.StateContent;
import com.fuzhu.designpattern.model.state.machine.StateContentImpl;
import com.fuzhu.designpattern.model.state.machine.impl.*;

/**
 * 变更单状态枚举类
 * @author 辅助
 * @version 1.0
 * @date 2021/3/22 16:05
 */
public enum StateEnums {
    /**
     * 待评估
     */
    TOEVALUATE,
    /**
     * 评估中
     */
    UNDEREVALUATION,
    /**
     * 待变更
     */
    TOCHANGED,
    /**
     * 变更中
     */
    CHANGING,
    /**
     * 变更完成
     */
    CHANGECOMPLETED;

    /**
     * 根据状态名字，转换为具体的状态上下文
     * @param stateName
     * @return
     */
    public static StateContent getStateContent(String stateName) {

        StateContent stateContent = new StateContentImpl();
        StateEnums[] values = StateEnums.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].name().equals(stateName)){
                switch (values[i]){
                    case TOEVALUATE:{
                        stateContent.setState(new ToEvaluate());
                        break;
                    }
                    case UNDEREVALUATION:{
                        stateContent.setState(new UnderEvaluation());
                        break;
                    }
                    case TOCHANGED:{
                        stateContent.setState(new ToChanged());
                        break;
                    }
                    case CHANGING:{
                        stateContent.setState(new Changing());
                        break;
                    }
                    case CHANGECOMPLETED:{
                        stateContent.setState(new ChangeCompleted());
                        break;
                    }
                    default:
                        throw new RuntimeException("未知状态类型");
                }
            }
        }
        return stateContent;
    }

}
