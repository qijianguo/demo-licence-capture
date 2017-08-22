package com.learn.springboot.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description:
 * <p>
 * User: Administrator
 * Date: 2017-08-22
 * Time: 17:58
 */
@Component
public class Anthor {

    @Value("${com.learn.springboot.anthor}")
    private String anthor;
    @Value("${com.learn.springboot.email}")
    private String email;
    @Value("${com.learn.springboot.desc}")
    private String desc;
    @Value("${com.learn.springboot.luckyNum}")
    private int luckyNum;
    @Value("${com.learn.springboot.luckyString}")
    private String luckyString;

    public void setAnthor(String anthor) {
        this.anthor = anthor;
    }

    public void setLuckyNum(int luckyNum) {
        this.luckyNum = luckyNum;
    }

    public void setLuckyString(String luckyString) {
        this.luckyString = luckyString;
    }

    public int getLuckyNum() {

        return luckyNum;
    }

    public String getLuckyString() {
        return luckyString;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAnthor() {

        return anthor;
    }

    public String getEmail() {
        return email;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {

        return desc;
    }
}
