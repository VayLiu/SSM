package com.vayliu.ch7.pojo;

/**
 * @author: VayLiu
 **/


public class MapUser {

    private Integer m_uid;
    private String m_uname;
    private String m_usex;
    private Double m_account;

    public MapUser() {
    }

    public MapUser(Integer uid, String uname, String usex, Double account) {
        this.m_uid = uid;
        this.m_uname = uname;
        this.m_usex = usex;
        this.m_account = account;
    }

    public Integer getM_uid() {
        return m_uid;
    }

    public void setM_uid(Integer m_uid) {
        this.m_uid = m_uid;
    }

    public String getUname() {
        return m_uname;
    }

    public void setUname(String uname) {
        this.m_uname = uname;
    }

    public String getM_usex() {
        return m_usex;
    }

    public void setM_usex(String m_usex) {
        this.m_usex = m_usex;
    }

    public Double getM_account() {
        return m_account;
    }

    public void setM_account(Double m_account) {
        this.m_account = m_account;
    }

    @Override
    public String toString() {
        return "MapUser{" +
                "uid=" + m_uid +
                ", uname='" + m_uname + '\'' +
                ", usex='" + m_usex + '\'' +
                ", account=" + m_account +
                '}';
    }
}
