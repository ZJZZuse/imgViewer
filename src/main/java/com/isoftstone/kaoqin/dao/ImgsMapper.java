package com.isoftstone.kaoqin.dao;

import com.isoftstone.kaoqin.po.Imgs;
import com.isoftstone.kaoqin.po.ImgsExample;
import java.util.List;

public interface ImgsMapper {
    int countByExample(ImgsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Imgs record);

    int insertSelective(Imgs record);

    List<Imgs> selectByExample(ImgsExample example);

    Imgs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Imgs record);

    int updateByPrimaryKey(Imgs record);
}