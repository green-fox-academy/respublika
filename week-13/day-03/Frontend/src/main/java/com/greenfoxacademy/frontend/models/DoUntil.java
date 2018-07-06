package com.greenfoxacademy.frontend.models;

public class DoUntil {
    private Long result;

    public DoUntil(String what) {
        if (what.equals("sum")){
            this.result = 0L;
        }
        else if (what.equals("factor")){
            this.result = 1L;
        }

    }

    public void countResult(String what, Until until) {
        if (what.equals("sum")) {
            for (int i = 0; i <= until.getUntil(); i++) {
                this.result+=i;
            }

        } else if (what.equals("factor")) {
            for (int i = 1; i <= until.getUntil(); i++) {
                this.result*=i;
            }
        } else {}
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }


}
