package com.fuzhu.comtroller;

import com.fuzhu.designpattern.model.ResultInfo;
import com.fuzhu.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 简单的例子
 * @author 辅助
 * @version 1.0
 * @date 2021/3/24 20:04
 */
@RestController
@RequestMapping("/fuzhu/simple")
public class SimpleController {

    @Autowired
    private SimpleService simpleService;


    @GetMapping("/query")
    public ResultInfo queryById(@RequestParam("id") Integer id){
        return simpleService.queryById(id);
    }

    @PutMapping("/updateTwoValue")
    public ResultInfo updateTwoValue(@RequestParam("id1") Integer id1,@RequestParam("id2") Integer id2 ){
        return simpleService.updateTwoValue(id1, id2);
    }
}
