package com.vayliu.ch17.pojo;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author: VayLiu
 **/


public class FileDomain {

    private String description;
    private MultipartFile myFile;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getMyFile() {
        return myFile;
    }

    public void setMyFile(MultipartFile myFile) {
        this.myFile = myFile;
    }
}
