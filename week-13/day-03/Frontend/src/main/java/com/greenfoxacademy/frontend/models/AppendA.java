package com.greenfoxacademy.frontend.models;

public class AppendA {
    String appended;


    public AppendA(String append) {
        this.appended = append+"a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
