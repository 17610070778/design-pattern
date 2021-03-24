package com.fuzhu.dal;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/24 20:44
 */
public interface SimpleMapper {
    String queryById(Integer id);

    void insert(Integer id1, String data1);
}
