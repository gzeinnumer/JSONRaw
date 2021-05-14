package com.gzeinnumer.jsonraw.model;

import com.google.gson.annotations.SerializedName;

public class ListItem {

    @SerializedName("name")
    private String name;

    @SerializedName("age")
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}