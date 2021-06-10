package com.vayliu.ch17.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 * @author: VayLiu
 **/

@Controller
public class FileDownloadController {

    private static final Log logger = LogFactory.getLog(FileDownloadController.class);

    /**
     * 显示要下载的文件
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("showDownloadFiles")
    public String show(HttpServletRequest request, Model model) {
        String realPath = request.getSession().getServletContext().getRealPath("uploadFiles");
        File dir = new File(realPath);
        File[] files = dir.listFiles();
        // 获取该目录下的所有文件名
        ArrayList<String> fileNames = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            fileNames.add(files[i].getName());
        }
        model.addAttribute("files", fileNames);
        return "showDownloadFiles";
    }

    /**
     * 执行下载
     * @param filename
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("download")
    public String show(@RequestParam String filename, HttpServletRequest request, HttpServletResponse response) {

        String aFilePath = null;        // 要下载的文件路径
        FileInputStream in = null;      // 输入流
        ServletOutputStream out = null; // 输出流

        aFilePath = request.getSession().getServletContext().getRealPath("uploadFiles");

        response.setHeader("Content-Type", "application/x-msdownload");
        response.setHeader("Content-Disposition", "attachment;filename=" + toUTF8String(filename));

        try {
            in = new FileInputStream(aFilePath + "\\" + filename);
            out = response.getOutputStream();
            out.flush();
            int aRead = 0;
            byte b[] = new byte[1024];
            while ((aRead = in.read(b)) != -1 & in != null) {
                out.write(b, 0, aRead);
            }
            out.flush();
            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("下载成功");
        return "showDownloadFiles";
    }

    /**
     * 下载保存时中文文件名的字符编码转换方法
     * @param filename
     * @return
     */
    private String toUTF8String(String filename) {

        StringBuffer stringBuffer = new StringBuffer();

        int len = filename.length();
        for (int i = 0; i < len; i++) {
            char c = filename.charAt(i);
            if (c >= 0 && c <= 255) {
                stringBuffer.append(c);
            } else {
                byte b[];
                try {
                    b = Character.toString(c).getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    b = null;
                }

                for (int j = 0; j < b.length; j++) {
                    int k = b[j];
                    if (k < 0) {
                        k &= 255;
                    }
                    stringBuffer.append("%" + Integer.toHexString(k).toUpperCase());
                }
            }
        }

        return stringBuffer.toString();
    }


}
