package com.blogsystem.service.impl;

import com.blogsystem.bean.Moderator;
import com.blogsystem.dao.ModeratorDao;
import com.blogsystem.service.ModeratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SX-503 on 2018/10/30.
 */
@Service
public class ModeratorServiceImpl implements ModeratorService{

    @Autowired
    ModeratorDao moderatorDao;

    @Override
    public int insert(Moderator moderator) {
        return moderatorDao.insert(moderator);
    }

    @Override
    public Moderator selectById(Long id) {
        return moderatorDao.selectById(id);
    }

    @Override
    public int update(Moderator moderator) {
        if (moderator == null) return 0;
        return moderatorDao.update(moderator);
    }

    @Override
    public int deleteBatch(Long... id) {
        return moderatorDao.deleteBatch(id);
    }

    @Override
    public List<Moderator> list() {
        return moderatorDao.list();
    }
}
