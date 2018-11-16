package com.blogsystem.service;

import com.blogsystem.bean.User;

import java.util.List;

/**
 * Created by SX-503 on 2018/11/5.
 */
public interface UserService {
    int insert(User user);

    List<User> list();

    List<User> select (Long id);

    User selectById(Long id);

    User selectByUname(String username);

    int updateById(User user); // 通过id进行修改

    int deleteById(Long... id);
}
