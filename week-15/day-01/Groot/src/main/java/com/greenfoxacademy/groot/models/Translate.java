package com.greenfoxacademy.groot.models;

public class Translate {
    String received;
    String translated="I am Groot!";

    public Translate(String received) {
        this.received=received;
    }

    public Translate() {
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }
}
