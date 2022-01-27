package com.fuzhu.designpattern.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 变更单
 *
 * @author 辅助
 * @version 1.0
 * @date 2021/3/22 17:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangeOrder {
    private Integer id;
    private String state;
}
