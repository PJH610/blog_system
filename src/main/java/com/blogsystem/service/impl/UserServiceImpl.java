package com.blogsystem.service.impl;

import com.blogsystem.bean.User;
import com.blogsystem.dao.UserDao;
import com.blogsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SX-503 on 2018/11/5.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public List<User> list() {
        return userDao.list();
    }

    @Override
    public List<User> select(Long id) {
        return userDao.select(id);
    }

    @Override
    public User selectById(Long id) {
        return userDao.selectById(id);
    }

    @Override
    public User selectByUname(String username) {
        return userDao.selectByUname(username);
    }

    @Override
    public int updateById(User user) {
        return userDao.updateById(user);
    }

    @Override
    public int deleteById(Long... id) {
        return userDao.deleteById(id);
    }
}
