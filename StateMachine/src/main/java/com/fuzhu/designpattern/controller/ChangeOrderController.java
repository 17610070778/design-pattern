package com.fuzhu.designpattern.controller;

import com.fuzhu.designpattern.model.ResultInfo;
import com.fuzhu.designpattern.model.request.UpdateChangeOrderStateRequest;
import com.fuzhu.designpattern.service.ChangeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/21 23:29
 */
@RestController
@RequestMapping("/fuzhu/changeOrder")
public class ChangeOrderController {
    @Autowired
    private ChangeOrderService changeOrderService;


    @PutMapping("/update")
    public ResultInfo updateChangeOrderState(@RequestBody UpdateChangeOrderStateRequest request) {
        return changeOrderService.updateChangeOrderState(request);
    }
}
