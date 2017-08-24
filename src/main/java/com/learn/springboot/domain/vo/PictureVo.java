package com.learn.springboot.domain.vo;

/**
 * Created by qijianguo on 2017/8/24.
 */
public class PictureVo {

    private String carUuid;
    private String licence;
    private Long receiveTime;
    private String url;

    public String getCarUuid() {
        return carUuid;
    }

    public void setCarUuid(String carUuid) {
        this.carUuid = carUuid;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public Long getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Long receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
