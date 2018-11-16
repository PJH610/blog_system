package com.blogsystem.dao;

import com.blogsystem.bean.DownloadFile;
import org.springframework.stereotype.Repository;


/**
 * Created by SX-503 on 2018/11/7.
 */
@Repository
public interface DownloadFileDao {

    int insert(DownloadFile... files);

    DownloadFile selectById(Long id);

    DownloadFile selectByFileUrl(String fileUrl);

    int deleteByFileUrl(String fileUrl);
}
