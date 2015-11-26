package com.gudu.account.domain;

import com.gudu.user.domain.User;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by qiuhn on 2015/9/21.
 */
public class LoginLog implements Serializable {

    private long id;//logID

    private User user;//关联用户

    private String mobileNo;//手机标识

    private Date date;//登录时间

    private String token;//登录token

    public LoginLog() {

    }

    public LoginLog(User user,String mobileNo, Date date, String token) {
        this.user = user;
        this.mobileNo = mobileNo;
        this.date = date;
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
