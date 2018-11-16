package com.blogsystem.service.impl;

import com.blogsystem.bean.DownloadFile;
import com.blogsystem.dao.DownloadFileDao;
import com.blogsystem.service.DownloadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SX-503 on 2018/11/7.
 */
@Service
public class DownloadFileServiceImpl implements DownloadFileService {

    @Autowired
    DownloadFileDao downloadFileDao;


    @Override
    public int insert(DownloadFile... files) {
        if (files == null || files.length == 0) return 0;
        return downloadFileDao.insert(files);
    }

    @Override
    public DownloadFile selectById(Long id) {
        return downloadFileDao.selectById(id);
    }

    @Override
    public DownloadFile selectByFileUrl(String fileUrl) {
        return downloadFileDao.selectByFileUrl(fileUrl);
    }

    @Override
    public int deleteByFileUrl(String fileUrl) {
        if (fileUrl == null || fileUrl.length() == 0) return 0;
        return downloadFileDao.deleteByFileUrl(fileUrl);
    }
}
