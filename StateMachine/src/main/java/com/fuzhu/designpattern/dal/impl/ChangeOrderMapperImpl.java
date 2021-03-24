package com.fuzhu.designpattern.dal.impl;

import com.fuzhu.designpattern.dal.ChangeOrderMapper;
import com.fuzhu.designpattern.model.ChangeOrder;
import com.fuzhu.designpattern.model.enums.StateEnums;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/22 17:50
 */
@Repository
public class ChangeOrderMapperImpl implements ChangeOrderMapper {
    /**
     * 不连接数据库，这里为测试集
     */
    private Map<Integer, ChangeOrder> mysql = new HashMap<>();
    public ChangeOrderMapperImpl() {
        mysql.put(1, new ChangeOrder(1, StateEnums.TOEVALUATE.name()));
        mysql.put(2, new ChangeOrder(2, StateEnums.UNDEREVALUATION.name()));
        mysql.put(3, new ChangeOrder(3, StateEnums.TOCHANGED.name()));
        mysql.put(4, new ChangeOrder(4, StateEnums.CHANGING.name()));
        mysql.put(5, new ChangeOrder(5, StateEnums.CHANGECOMPLETED.name()));
    }

    @Override
    public ChangeOrder queryById(Integer id) {
        return mysql.get(id);
    }

    @Override
    public int insert(ChangeOrder changeOrder) {
        mysql.put(changeOrder.getId(), changeOrder);
        return 1;
    }
}
