package com.greenfoxacademy.frontend.models;

import java.util.ArrayList;
import java.util.List;

public class ArrayInput {
    String what;
    List<Integer> numbers=new ArrayList<>();

    public ArrayInput(String what, List<Integer> number) {
        this.what = what;
        this.numbers = number;
    }

    public ArrayInput() {
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> number) {
        this.numbers = number;
    }
}
