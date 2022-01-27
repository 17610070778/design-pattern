package com.fuzhu.designpattern.service;

import com.fuzhu.designpattern.model.ResultInfo;
import com.fuzhu.designpattern.model.request.UpdateChangeOrderStateRequest;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/21 23:41
 */
public interface ChangeOrderService {
    ResultInfo updateChangeOrderState(UpdateChangeOrderStateRequest updateChangeOrderStateRequest);
}
