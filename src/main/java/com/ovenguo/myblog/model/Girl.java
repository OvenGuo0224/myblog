package com.ovenguo.myblog.model;

/**
 * girl实体
 */

public class Girl{

    private int girlId;

    private String name;

    private int age;

    private String cup;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCup() {
        return cup;
    }

    public void setCup(String cup) {
        this.cup = cup;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "GirlId=" + girlId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", cup=" + cup +
                '}';
    }

    public int getGirlId() {
        return girlId;
    }

    public void setGirlId(int girlId) {
        this.girlId = girlId;
    }
}
