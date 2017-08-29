package com.learn.springboot.domain.vo;

/**
 * Description: 车辆抓拍的封装对象
 * <p>
 * User: Administrator
 * Date: 2017-08-29
 * Time: 13:55
 */
public class CarQuery {

    private String licence;
    private String receiveTime;
    private int pageNum;

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
