package com.isoftstone.kaoqin.vo;

import org.springframework.beans.BeanUtils;

import java.io.File;

public class ImgsVo {

    public static String basePath = "D:/abc/t/img";

    private String basePathP;

    private String path;

    private String abstractPath;

    private String parentFolderName;

    private String name;

    private String nameForShow;

    public ImgsVo() {
    }

    public ImgsVo(String basePathP) {
        this.basePathP = basePathP;
    }

    public String getAbstractPath() {
        return abstractPath;
    }

    public void setAbstractPath(String abstractPath) {
        this.abstractPath = abstractPath;
    }

    public String getNameForShow() {
        return nameForShow;
    }

    public void setNameForShowAndAbstractPath() {

        abstractPath = (basePathP == null || basePathP.isEmpty()) ? basePath + File.separator + path : basePathP + File.separator + path;

        this.nameForShow = parentFolderName + "-" + name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getParentFolderName() {
        return parentFolderName;
    }

    public void setParentFolderName(String parentFolderName) {
        this.parentFolderName = parentFolderName == null ? null : parentFolderName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}