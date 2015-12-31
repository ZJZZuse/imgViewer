package com.isoftstone.kaoqin.vo;

public class ImgsVo {

    public static String basePath = "D:/abc/t/img";


    private String path;

    private String parentFolderName;

    private String name;

    private String nameForShow;

    public String getNameForShow() {
        return nameForShow;
    }

    public void setNameForShow() {
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