package com.learn.springboot.domain;

/**
 * Created by qijianguo on 2017/8/24.
 */
public class Picture {

    private Long id;

    private String carUuid;

    private Long receiveTime;

    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarUuid() {
        return carUuid;
    }

    public void setCarUuid(String carUuid) {
        this.carUuid = carUuid;
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

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", carUuid='" + carUuid + '\'' +
                ", receiveTime=" + receiveTime +
                ", url='" + url + '\'' +
                '}';
    }
}
