package org.example.mall.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel
public class User {

    @ApiModelProperty(value = "用户ID", name = "userID", dataType = "int")
    private int userID;

    @ApiModelProperty(value = "用户名", name = "username", dataType = "String")
    private String userName;

    @ApiModelProperty(value = "密码", name = "password", dataType = "String")
    private String userPwd;

    @ApiModelProperty(value = "真实姓名", name = "userRealName", dataType = "String")
    private String userRealName;

    @ApiModelProperty(value = "用户头像", name = "userIMG", dataType = "String")
    private String userImg;
}
