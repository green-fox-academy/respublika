package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller(value="todo")
public class TodoController {

    private final
    TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository=todoRepository;
    }

    @GetMapping(value={"/", "/list"})
    public String todo(Model model) {
        todoRepository.save(new Todo("title", true, true));
        model.addAttribute("todos", todoRepository.findAll());
        return "todoslist";
    }

}
