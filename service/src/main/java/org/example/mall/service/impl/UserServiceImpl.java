package org.example.mall.service.impl;

import org.example.mall.dao.UserDAO;
import org.example.mall.entity.User;
import org.example.mall.service.UserService;
import org.example.mall.vo.ResultVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Override
    public ResultVO checkLogin(String username, String password) {
        ResultVO resultVO = new ResultVO();
        User user = userDAO.queryUserByName(username);
        if (user == null) {
            resultVO.setCode(1);
            resultVO.setMsg("用户名不存在");
        } else {
            String encryptedPwd = password;
            if (encryptedPwd.equals(user.getUserPwd())) {
                resultVO.setCode(0);
                resultVO.setMsg("登录成功");
                resultVO.setData(user);
            } else {
                resultVO.setCode(1);
                resultVO.setMsg("密码错误");
            }
        }
        return resultVO;
    }
}
