package com.fuzhu.service.impl;

import com.fuzhu.dal.SimpleMapper;
import com.fuzhu.designpattern.model.ResultInfo;
import com.fuzhu.model.template.ServiceInvokeHandler;
import com.fuzhu.model.template.ServiceTemplate;
import com.fuzhu.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/24 20:44
 */
@Service
public class SimpleServiceImpl implements SimpleService {

    @Autowired
    private ServiceTemplate serviceTemplate;

    @Autowired
    private SimpleMapper simpleMapper;
    @Override
    public ResultInfo queryById(Integer id) {
        return serviceTemplate.doService(new ServiceInvokeHandler<String>() {
            @Override
            public void checkParam() {
                if (null == id){
                    throw new RuntimeException("参数不能为空");
                }
            }

            @Override
            public String doService() {
                String data = simpleMapper.queryById(id);
                return data;
            }
        });
    }

    @Override
    public ResultInfo updateTwoValue(Integer id1, Integer id2) {
        return serviceTemplate.doServiceOnTransaction(new ServiceInvokeHandler<String>() {
            @Override
            public void checkParam() {
                if (null == id1 && null == id2){
                    throw new RuntimeException("两个参数都不能为空");
                }
            }

            @Override
            public String doService() {
                String data1 = simpleMapper.queryById(id1);
                String data2 = simpleMapper.queryById(id2);

                simpleMapper.insert(id1, data1 + "666");
                simpleMapper.insert(id2, data2 + "666");
                return "success";
            }
        });
    }
}
