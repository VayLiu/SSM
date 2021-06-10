package com.vayliu.ch17.pojo;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author: VayLiu
 **/


public class MultiFileDomain {

    private List<String> description;
    private List<MultipartFile> myFile;

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public List<MultipartFile> getMyFile() {
        return myFile;
    }

    public void setMyFile(List<MultipartFile> myFile) {
        this.myFile = myFile;
    }
}
