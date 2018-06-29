package com.greenfoxacademy.connectsql.controllers;


import com.greenfoxacademy.connectsql.models.Todo;
import com.greenfoxacademy.connectsql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping(value={"/todo/"})
    public String todoIsActive(@RequestParam("isActive") boolean isActive, Model model) {
        model.addAttribute("todos", todoRepository.findAllByDone(isActive));
        return "todoslist";
    }

    @GetMapping(value={"/todo/add"})
    public String add(Model model) {
        return "todoadd";
    }

    @PostMapping(value = "/todo/add")
    public String addTodo(@ModelAttribute("title") String title) {
        todoRepository.save(new Todo(title));
        return "redirect:/todo";
    }

    @GetMapping(value = "/todo/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo";
    }

    @GetMapping(value = "/todo/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("todo", todoRepository.findById(id));
        return "todoedit";
    }

    @PostMapping(value = "/todo/{id}/edit")
    public String editTodo(@PathVariable("id") Long id, @ModelAttribute("title") String title,
                           @ModelAttribute("urgent") String urgent, @ModelAttribute("done") String done) {
        Boolean urgent2 = Boolean.valueOf(urgent);
        Boolean done2 = Boolean.valueOf(done);
        todoRepository.findById(id).get().setTitle(title);
        todoRepository.findById(id).get().setUrgent(urgent2);
        todoRepository.findById(id).get().setDone(done2);
        todoRepository.save(todoRepository.findById(id).get());
        return "redirect:/todo";
    }
}
