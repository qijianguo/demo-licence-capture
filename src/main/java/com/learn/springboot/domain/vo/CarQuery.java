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
    private String startTime;
    private String endTime;
    private int pageNum;
    private int pageSize;

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
