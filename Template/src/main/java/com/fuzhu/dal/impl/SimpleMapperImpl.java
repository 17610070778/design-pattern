package com.fuzhu.dal.impl;

import com.fuzhu.dal.SimpleMapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/24 20:45
 */
@Repository
public class SimpleMapperImpl implements SimpleMapper {
    /**
     * 不连接数据库，这里为测试集
     */
    private Map<Integer, String> mysql = new HashMap<>();

    public SimpleMapperImpl() {
        mysql.put(1, "aaa");
        mysql.put(2, "bbb");
        mysql.put(3, "ccc");
        mysql.put(4, "ddd");
        mysql.put(5, "eee");
    }

    @Override
    public String queryById(Integer id) {
        return mysql.get(id);
    }

    @Override
    public void insert(Integer id, String data) {
        mysql.put(id, data);
    }
}
