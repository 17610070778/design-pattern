package com.fuzhu.model.template;

import com.fuzhu.designpattern.model.ResultInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/24 20:49
 */
@Component
@Slf4j
public class ServiceTemplate {

    /**
     * 由于没有链接数据库，这里用new先模拟
     */
    private TransactionTemplate template = new TransactionTemplate();

    public <T> ResultInfo doService(ServiceInvokeHandler<T> handler) {
        T data = null;
        try {
            handler.checkParam();
            data = handler.doService();
        } catch (Exception e) {
            log.error("业务执行出错:{}", e.getMessage(), e);
            return ResultInfo.buildFaild(e.getMessage());
        }
        return ResultInfo.buildSuccess(data);
    }

    public <T> ResultInfo doServiceOnTransaction(ServiceInvokeHandler<T> handler) {
        T data = null;
        try {
            handler.checkParam();
            data = template.execute(transactionStatus ->
                    // 事务中执行代码
                    handler.doService()
            );
        } catch (Exception e) {
            log.error("业务执行出错:{}", e.getMessage(), e);
            return ResultInfo.buildFaild(e.getMessage());
        }
        return ResultInfo.buildSuccess(data);
    }
}
