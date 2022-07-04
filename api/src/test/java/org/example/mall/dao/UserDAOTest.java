package org.example.mall.dao;

import org.example.mall.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDAOTest {

    @Resource
    private UserDAO userDAO;

    @Test
    public void queryUserByName() {
        User user = userDAO.queryUserByName("zhangsan");
        System.out.println(user);
    }
}