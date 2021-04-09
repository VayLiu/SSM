package com.vayliu.ch7.pojo;

/**
 * @author: VayLiu
 **/


public class Idcard {

    private Integer id;
    private String code;

    public Idcard() {
    }

    public Idcard(Integer id, String code) {
        this.id = id;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Idcard{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
