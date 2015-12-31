package com.isoftstone.kaoqin.service.impl;

import com.isoftstone.kaoqin.dao.NdsChineseMapper;
import com.isoftstone.kaoqin.po.NdsChinese;
import com.isoftstone.kaoqin.po.NdsChineseExample;
import com.isoftstone.kaoqin.service.NdsChineseService;
import com.isoftstone.kaoqin.vo.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wb-zhangjinzhong on 2015/12/22.
 */

@Service
public class NdsChineseServiceImpl implements NdsChineseService {

    @Autowired
    private NdsChineseMapper ndsChineseMapper;

    public MyResult<List<NdsChinese>> acqGamesAll() {

        List<NdsChinese> ndsChineses = ndsChineseMapper.selectByExample(new NdsChineseExample());

        return MyResult.success(ndsChineses);
    }
}
