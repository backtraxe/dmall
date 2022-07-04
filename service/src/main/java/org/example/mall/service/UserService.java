package org.example.mall.service;

import org.example.mall.vo.ResultVO;

public interface UserService {
    public ResultVO checkLogin(String username, String password);
}
