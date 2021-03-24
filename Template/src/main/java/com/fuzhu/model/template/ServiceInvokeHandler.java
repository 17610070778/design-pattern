package com.fuzhu.model.template;

/**
 * 留给用户实现的业务回调
 * @author 辅助
 * @version 1.0
 * @date 2021/3/24 20:47
 */
public interface ServiceInvokeHandler<T> {
    /**
     * 第一步进行参数校验
     */
    void checkParam();

    /**
     * 第二步处理业务
     * @return
     */
    T doService();
}
