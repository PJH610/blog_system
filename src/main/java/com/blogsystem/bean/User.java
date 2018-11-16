package com.blogsystem.bean;

import com.blogsystem.enums.FreezeEnum;
import com.blogsystem.enums.RoleTypeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by SX-503 on 2018/11/5.
 */
@JsonIgnoreProperties(value = {"handler"})
public class User {
    private Long id;
    private String username;
    private String password;
    private String mobilePhone;
    private String email;
    private RoleTypeEnum roleTypeEnum;
    private FreezeEnum freezeEnum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RoleTypeEnum getRoleTypeEnum() {
        return roleTypeEnum;
    }

    public void setRoleTypeEnum(RoleTypeEnum roleTypeEnum) {
        this.roleTypeEnum = roleTypeEnum;
    }

    public FreezeEnum getFreezeEnum() {
        return freezeEnum;
    }

    public void setFreezeEnum(FreezeEnum freezeEnum) {
        this.freezeEnum = freezeEnum;
    }
}
