package com.greenfoxacademy.connectsql.services;

import com.greenfoxacademy.connectsql.models.Todo;
import com.greenfoxacademy.connectsql.repositories.AssigneeRepository;
import com.greenfoxacademy.connectsql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoRepository todoRepository;

    @Autowired
    AssigneeRepository assigneeRepository;


    private ArrayList<String> searchKeys = new ArrayList<>();

    public ArrayList<String> getSearchKeys() {
        return searchKeys;
    }

    public List<Todo> getTodos(String key, String search) throws ParseException {
        List<Todo> todos;
        if (key == "by Title") {
            todos = todoRepository.findAllByTitleContainsIgnoreCase(search);
        } else if (key == "by Assignee") {
            todos = todoRepository.findAllByAssignee(assigneeRepository.findByNameContainsIgnoreCase(search));
        } else if (key == "by Due Date") {
            DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            Date ddate = format.parse(search);
            todos = todoRepository.findAllByDDate(ddate);
        } else if (key == "by Creation Date") {
            DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            Date crdate = format.parse(search);
            todos = todoRepository.findAllByCrDate(crdate);
        } else {
            todos=null;
        }
        return todos;
    }

    public TodoService() {
        this.searchKeys.add("by Title");
        this.searchKeys.add("by Due date");
        this.searchKeys.add("by Creation date");
        this.searchKeys.add("by Assignee");
    }
}
