package com.vayliu.ch12.pojo;

/**
 * @author: VayLiu
 **/


public class User {

    private String userName;
    private String[] hobby;
    private String[] friends;
    private String career;
    private String houseRegister;
    private String remark;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String[] getFriends() {
        return friends;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getHouseRegister() {
        return houseRegister;
    }

    public void setHouseRegister(String houseRegister) {
        this.houseRegister = houseRegister;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
