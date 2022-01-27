package com.fuzhu.designpattern.dal;

import com.fuzhu.designpattern.model.ChangeOrder;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/22 17:50
 */
public interface ChangeOrderMapper {

    ChangeOrder queryById(Integer id);
    int insert(ChangeOrder changeOrder);
}
