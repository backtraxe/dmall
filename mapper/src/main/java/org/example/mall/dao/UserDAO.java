package org.example.mall.dao;

import org.example.mall.entity.User;

public interface UserDAO {
    public int insertUser(User user);

    public User queryUserByName(String userName);
}
