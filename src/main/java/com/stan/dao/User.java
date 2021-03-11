package com.stan.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.context.annotation.Primary;

import java.util.Date;


public class User {
    @TableId(type = IdType.AUTO)
    private Integer userId;

    private String userName;
    private String userPassword;
    private String userRole;
    private String userGender;
    private Date userBirthday;
    private String userEmail;
    private String userImgurl;
    private Date userRecentlylanded;
    private String userPersonalbrief;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserImgurl() {
        return userImgurl;
    }

    public void setUserImgurl(String userImgurl) {
        this.userImgurl = userImgurl;
    }

    public Date getUserRecentlylanded() {
        return userRecentlylanded;
    }

    public void setUserRecentlylanded(Date userRecentlylanded) {
        this.userRecentlylanded = userRecentlylanded;
    }

    public String getUserPersonalbrief() {
        return userPersonalbrief;
    }

    public void setUserPersonalbrief(String userPersonalbrief) {
        this.userPersonalbrief = userPersonalbrief;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRole='" + userRole + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userBirthday=" + userBirthday +
                ", userEmail='" + userEmail + '\'' +
                ", userImgurl='" + userImgurl + '\'' +
                ", userRecentlylanded=" + userRecentlylanded +
                ", userPersonalbrief='" + userPersonalbrief + '\'' +
                '}';
    }
}
