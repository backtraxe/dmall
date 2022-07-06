package org.example.mall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private int userID;

    private String userName;

    private String userPwd;

    private String userRealName;

    private String userImg;
}
