package com.isoftstone.kaoqin.service;

import com.isoftstone.kaoqin.po.NdsChinese;
import com.isoftstone.kaoqin.vo.MyResult;

import java.util.List;

/**
 * Created by wb-zhangjinzhong on 2015/12/22.
 */
public interface NdsChineseService {

    MyResult<List<NdsChinese>> acqGamesAll();

}
