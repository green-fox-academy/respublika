package com.greenfoxacademy.frontend.models;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandler {
    Integer resultInt;
    List<Integer> resultList=new ArrayList<>();

    public ArrayHandler(Integer resultInt, List<Integer> resultList) {
        this.resultInt = resultInt;
        this.resultList = resultList;
    }

    public ArrayHandler() {
    }


    public void countResult(ArrayInput arrayInput) {
        if (arrayInput.getWhat().equals("sum")) {
            resultInt=0;
            for (int i = 0; i < arrayInput.getNumbers().size() ; i++) {
                resultInt+=arrayInput.getNumbers().get(i);
            }
        } else if (arrayInput.getWhat().equals("multiply")) {
            resultInt=1;
            for (int i = 0; i < arrayInput.getNumbers().size() ; i++) {
                resultInt*=arrayInput.getNumbers().get(i);
            }
        } else if (arrayInput.getWhat().equals("double")) {
            for (int i = 0; i < arrayInput.getNumbers().size() ; i++) {
                resultList.add(arrayInput.getNumbers().get(i)*2);
            }
        } else {}
    }


    public Integer getResultInt() {
        return resultInt;
    }

    public void setResultInt(Integer resultInt) {
        this.resultInt = resultInt;
    }

    public List<Integer> getResultList() {
        return resultList;
    }

    public void setResultList(ArrayList<Integer> resultList) {
        this.resultList = resultList;
    }
}
