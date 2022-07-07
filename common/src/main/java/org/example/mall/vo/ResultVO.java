package org.example.mall.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class ResultVO {

    // 响应前端的状态码
    @ApiModelProperty()
    private int code;

    // 响应前端的提示信息
    @ApiModelProperty()
    private String msg;

    // 响应前端的数据
    @ApiModelProperty()
    private Object data;
}
