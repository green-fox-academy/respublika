package com.greenfoxacademy.connectsql.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {
    private ArrayList<String> searchKeys = new ArrayList<>();
    private String currentSearch;

    public String getCurrentSearch() {
        return currentSearch;
    }

    public void setCurrentSearch(String currentSearch) {
        this.currentSearch = currentSearch;
    }

    public ArrayList<String> getSearchKeys() {
        return searchKeys;
    }

    public TodoService() {
        this.searchKeys.add("by Title");
        this.searchKeys.add("by Due date");
        this.searchKeys.add("by Creation date");
        this.searchKeys.add("by Assignee");
    }
}
