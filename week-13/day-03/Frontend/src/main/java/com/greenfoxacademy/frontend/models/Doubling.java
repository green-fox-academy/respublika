package com.greenfoxacademy.frontend.models;

public class Doubling {
    Integer received;
    Integer result;

    public Doubling() {}

    public Doubling(Integer received) {
        this.received=received;
        this.result=2*received;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
