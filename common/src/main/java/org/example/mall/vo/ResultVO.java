package org.example.mall.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO {

    // 响应前端的状态码
    private int code;

    // 响应前端的提示信息
    private String msg;

    // 响应前端的数据
    private Object data;
}
