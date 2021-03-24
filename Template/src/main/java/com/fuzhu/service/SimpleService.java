package com.fuzhu.service;

import com.fuzhu.designpattern.model.ResultInfo;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/24 20:43
 */
public interface SimpleService {
    ResultInfo queryById(Integer id);

    /**
     * 更新两个值
     * @param id1
     * @param id2
     * @return
     */
    ResultInfo updateTwoValue(Integer id1, Integer id2);
}
