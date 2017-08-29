package com.learn.springboot.domain;

/**
 * Description: 监测点信息
 * <p>
 * User: Administrator
 * Date: 2017-08-29
 * Time: 13:32
 */
public class Csite {

    private long id;
    // 监测点名称
    private String name;
    // 地址
    private String address;
    // 供应商
    private String provide;
    // 运维联系人
    private String maintenance;
    // 建设单位联系人
    private String construction;
    // 施工单位联系人
    private String builder;
    // 平台运维联系人
    private String platform;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvide() {
        return provide;
    }

    public void setProvide(String provide) {
        this.provide = provide;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Csite{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", provide='" + provide + '\'' +
                ", maintenance='" + maintenance + '\'' +
                ", construction='" + construction + '\'' +
                ", builder='" + builder + '\'' +
                ", platform='" + platform + '\'' +
                '}';
    }
}
