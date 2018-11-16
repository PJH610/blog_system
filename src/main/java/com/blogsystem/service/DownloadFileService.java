package com.blogsystem.service;

import com.blogsystem.bean.DownloadFile;

/**
 * Created by SX-503 on 2018/11/7.
 */
public interface DownloadFileService {

    int insert(DownloadFile... files);

    DownloadFile selectById(Long id);

    DownloadFile selectByFileUrl(String fileUrl);

    int deleteByFileUrl(String fileUrl);
}
