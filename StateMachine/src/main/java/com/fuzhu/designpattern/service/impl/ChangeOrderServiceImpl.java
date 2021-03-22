package com.fuzhu.designpattern.service.impl;

import com.fuzhu.designpattern.dal.ChangeOrderMapper;
import com.fuzhu.designpattern.model.ChangeOrder;
import com.fuzhu.designpattern.model.ResultInfo;
import com.fuzhu.designpattern.model.enums.StateEnums;
import com.fuzhu.designpattern.model.request.UpdateChangeOrderStateRequest;
import com.fuzhu.designpattern.model.state.machine.StateContent;
import com.fuzhu.designpattern.service.ChangeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/21 23:42
 */
@Service
public class ChangeOrderServiceImpl implements ChangeOrderService {

    @Autowired
    private ChangeOrderMapper changeOrderMapper;
    @Override
    public ResultInfo updateChangeOrderState(UpdateChangeOrderStateRequest updateParam) {
        ChangeOrder changeOrder = changeOrderMapper.queryById(updateParam.getId());
        System.out.printf("变更前状态" + changeOrder);
        // 获取状态上下文
        StateContent stateContent = StateEnums.getStateContent(changeOrder.getState());
        // 状态变更
        stateContent.nextState(updateParam.getNextState());

        changeOrder.setState(stateContent.getStateName());

        changeOrderMapper.insert(changeOrder);
        System.out.printf("变更后状态" + changeOrder);
        return ResultInfo.buildSuccess("success");
    }
}
