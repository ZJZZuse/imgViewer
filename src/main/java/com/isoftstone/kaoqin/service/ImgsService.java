package com.isoftstone.kaoqin.service;

import com.isoftstone.kaoqin.vo.MyResult;

/**
 * Created by wb-zhangjinzhong on 2015/12/30.
 */
public interface ImgsService {

    /**
     * 获取所有图片
     *
     * @return
     */
    MyResult acqAllImgs();

    /**
     * @param condition,用path条件
     * @return
     */
    MyResult acqImgs(String condition);

    /**
     * @param condition
     * @param bathPath，基础地址，exa,d:/
     * @return
     */
    MyResult acqImgs(String condition, String bathPath);

}
