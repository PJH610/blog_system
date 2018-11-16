package com.blogsystem.bean;

/**
 * Created by SX-503 on 2018/10/30.
 */
public class Moderator {
    private Long id;
    private Integer forumId;
    private String moderatorLevel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public String getModeratorLevel() {
        return moderatorLevel;
    }

    public void setModeratorLevel(String moderatorLevel) {
        this.moderatorLevel = moderatorLevel;
    }
}
