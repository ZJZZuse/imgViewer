package com.isoftstone.kaoqin.po;

public class Imgs {
    private Integer id;

    private String infoCreateTime;

    private String path;

    private String parentFolderName;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfoCreateTime() {
        return infoCreateTime;
    }

    public void setInfoCreateTime(String infoCreateTime) {
        this.infoCreateTime = infoCreateTime == null ? null : infoCreateTime.trim();
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