package com.zander.web01.dao;

import com.zander.web01.bean.User;
import java.util.List;

public interface UserDao {
    List<User> findAllUsers();
    int insertUser(User user);
    int updateUser(User user);
    int delUser(Integer id);
}
