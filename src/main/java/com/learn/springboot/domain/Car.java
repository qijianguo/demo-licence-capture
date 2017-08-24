package com.learn.springboot.domain;

import java.util.List;

/**
 * Created by qijianguo on 2017/8/24.
 */
public class Car {

    private Long id;

    /** 车牌号 */
    private String licence;

    /** 车的自定义编号 */
    private String carUuid;

    private List<Picture> pictures;

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getCarUuid() {
        return carUuid;
    }

    public void setCarUuid(String carUuid) {
        this.carUuid = carUuid;
    }
}
