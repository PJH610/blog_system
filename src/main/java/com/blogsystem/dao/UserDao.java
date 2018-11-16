package com.blogsystem.dao;

import com.blogsystem.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SX-503 on 2018/10/29.
 */
@Repository
public interface UserDao {

    int insert(User user);

    List<User> list();

    List<User> select (Long id);

    User selectById(Long id);

    User selectByUname(String username);

    int updateById(User user); // 通过id进行修改

    int deleteById(Long... id);

}
