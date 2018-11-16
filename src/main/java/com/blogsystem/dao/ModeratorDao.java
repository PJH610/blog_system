package com.blogsystem.dao;

import com.blogsystem.bean.Moderator;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SX-503 on 2018/10/30.
 */
@Repository
public interface ModeratorDao {

    int insert(Moderator moderator);

    Moderator selectById(Long id);

    int update (Moderator moderator);

    int deleteBatch(Long... id);

    List<Moderator> list();

}
