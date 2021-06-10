package com.vayliu.ch17.controller;

import com.vayliu.ch17.pojo.FileDomain;
import com.vayliu.ch17.pojo.MultiFileDomain;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author: VayLiu
 **/

@Controller
public class FileUploadController {

    private static final Log logger = LogFactory.getLog(FileUploadController.class);

    /**
     * 单文件上传
     * @return
     */
    @RequestMapping("/oneFile")
    public String oneFileUpload(@ModelAttribute FileDomain fileDomain, HttpServletRequest request) {

        String realpath = request.getSession().getServletContext().getRealPath("uploadFiles");
        String fileName = fileDomain.getMyFile().getOriginalFilename();
        File targetFile = new File(realpath, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        // 上传
        try {
            fileDomain.getMyFile().transferTo(targetFile);
            logger.info("成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "showOne";
    }

    /**
     * 多文件上传
     * @return
     */
    @RequestMapping("/multiFile")
    public String multiFileUpload(@ModelAttribute MultiFileDomain multiFileDomain, HttpServletRequest request) {

        String realpath = request.getSession().getServletContext().getRealPath("uploadFiles");
        File targetDir = new File(realpath);
        if (!targetDir.exists()) {
            targetDir.mkdirs();
        }

        List<MultipartFile> files = multiFileDomain.getMyFile();

        for (int i = 0; i < files.size(); i++) {
            MultipartFile file = files.get(i);
            String fileName = file.getOriginalFilename();
            File targetFile = new File(realpath, fileName);
            // 上传
            try {
                file.transferTo(targetFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        logger.info("成功");
        return "showMulti";
    }
}
