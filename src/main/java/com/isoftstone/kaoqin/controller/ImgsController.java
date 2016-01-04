package com.isoftstone.kaoqin.controller;

import com.isoftstone.kaoqin.service.ImgsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by wb-zhangjinzhong on 2015/12/30.
 */
@Controller
@RequestMapping("/imgs")
public class ImgsController {

    @Autowired
    private ImgsService imgsService;

    @RequestMapping("/acqImgsByCus")
    public String acqImgs(HttpServletRequest request,String index,String basePath,String keyWord) {

        request.setAttribute("imgs", imgsService.acqImgs(keyWord,basePath).getData());

        return "imgs" + index;
    }

    @RequestMapping("/acqImgsByIndex")
    public String acqImgs(HttpServletRequest request,String index) {

        request.setAttribute("imgs", imgsService.acqAllImgs().getData());

        return "imgs" + index;
    }

    @RequestMapping("/acqAllImgs")
    public String acqImgs(HttpServletRequest request) {

        request.setAttribute("imgs", imgsService.acqAllImgs().getData());

        return "imgs";
    }



    @RequestMapping(value = "/acqSingleImg")
    public void getImage(HttpServletRequest request, HttpServletResponse response, String path) {
        FileInputStream fis = null;
        response.setContentType("image/jpg");
        try {
            OutputStream out = response.getOutputStream();
            File file = new File(path);
            fis = new FileInputStream(file);
            byte[] b = new byte[fis.available()];
            fis.read(b);
            out.write(b);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
