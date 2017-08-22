package com.learn.springboot.domain;

/**
 * Created by qijianguo on 2017/8/22.
 */
public class User {

    private int id;
    private String name;
    private String age;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
