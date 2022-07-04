package org.example.mall.controller;

import org.example.mall.service.UserService;
import org.example.mall.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public ResultVO login(String username, String password) {
        return userService.checkLogin(username, password);
    }
}
