package com.isoftstone.kaoqin.controller;

import com.isoftstone.kaoqin.service.NdsChineseService;
import com.isoftstone.kaoqin.vo.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wb-zhangjinzhong on 2015/12/22.
 */

@Controller
@RequestMapping("/NdsChinese")
public class NdsChineseController {

    @Autowired
    private NdsChineseService ndsChineseService;

    @RequestMapping("/acqNdsGames")
    public MyResult acqNdsGames() {

        return ndsChineseService.acqGamesAll();
    }

    @RequestMapping("/toAcqNdsGames")
    public String toAcqNdsGames(HttpServletRequest request) {

        request.setAttribute("games",ndsChineseService.acqGamesAll().getData());

        return "ndsGames";
    }

    @RequestMapping("/testVm")
    public String testVm(HttpServletRequest request) {


        return "testVm";
    }

}
