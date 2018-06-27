package com.greenfoxacademy.connectsql.controllers;


import com.greenfoxacademy.connectsql.models.Todo;
import com.greenfoxacademy.connectsql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller(value="todo")
public class TodoController {

    private final
    TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository=todoRepository;
    }

    @GetMapping(value={"/todo"})
    public String todo(Model model) {

        model.addAttribute("todos", todoRepository.findAll());
        return "todoslist";
    }

}
