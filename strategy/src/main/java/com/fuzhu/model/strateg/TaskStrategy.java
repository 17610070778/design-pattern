package com.fuzhu.model.strateg;

/**
 * @author 浪客
 * @version V2.1
 * @since 2022/1/27 21:46
 */
public interface TaskStrategy {
    public String getName();

    public void execute(String taskId);
}
