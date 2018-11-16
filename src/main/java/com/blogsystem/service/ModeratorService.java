package com.blogsystem.service;

import com.blogsystem.bean.Moderator;

import java.util.List;

/**
 * Created by SX-503 on 2018/10/30.
 */
public interface ModeratorService {

    int insert(Moderator moderator);

    Moderator selectById(Long id);

    int update (Moderator moderator);

    int deleteBatch(Long... id);

    List<Moderator> list();

}
