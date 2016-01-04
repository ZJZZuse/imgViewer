package com.isoftstone.kaoqin.service.impl;

import com.isoftstone.kaoqin.dao.ImgsMapper;
import com.isoftstone.kaoqin.po.Imgs;
import com.isoftstone.kaoqin.po.ImgsExample;
import com.isoftstone.kaoqin.service.ImgsService;
import com.isoftstone.kaoqin.vo.ImgsVo;
import com.isoftstone.kaoqin.vo.MyResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb-zhangjinzhong on 2015/12/30.
 */
@Service
public class ImgsServiceImpl implements ImgsService {

    @Autowired
    private ImgsMapper imgsMapper;

    public MyResult acqAllImgs() {

        ImgsExample exa = new ImgsExample();

        List<Imgs> imgses = imgsMapper.selectByExample(exa);

        return doImgPreHandler(imgses);
    }

    public MyResult acqImgs(String condition) {

        ImgsExample exa = new ImgsExample();

        exa.or().andPathLike(condition);

        return doImgPreHandler(imgsMapper.selectByExample(exa));
    }

    public MyResult acqImgs(String condition, String bathPath) {

        ImgsExample exa = new ImgsExample();

        exa.or().andPathLike(condition);

        return doImgPreHandler(imgsMapper.selectByExample(exa), bathPath);

    }

    private MyResult doImgPreHandler(List<Imgs> imgses) {

        return doImgPreHandler(imgses,null);
    }

    private MyResult doImgPreHandler(List<Imgs> imgses, String bathPath) {

        List<ImgsVo> vos = new ArrayList<ImgsVo>();

        for (Imgs ele : imgses) {

            ImgsVo voT = new ImgsVo(bathPath);

            BeanUtils.copyProperties(ele, voT);
            voT.setNameForShowAndAbstractPath();

            vos.add(voT);
        }

        return MyResult.success(vos);
    }
}
