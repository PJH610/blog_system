package com.blogsystem.bean;

/**
 * Created by SX-503 on 2018/11/7.
 */
public class DownloadFile {
    private Long id;
    private String fileName;
    private String fileUrl;

    public DownloadFile() {

    }

    public DownloadFile(Long id, String fileName, String fileUrl) {
        this.id = id;
        this.fileName = fileName;
        this.fileUrl = fileUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
