package com.greenfoxacademy.connectsql.controllers;


import com.greenfoxacademy.connectsql.models.Assignee;
import com.greenfoxacademy.connectsql.models.Todo;
import com.greenfoxacademy.connectsql.repositories.AssigneeRepository;
import com.greenfoxacademy.connectsql.repositories.TodoRepository;
import com.greenfoxacademy.connectsql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller(value="todo")
public class TodoController {

    private final
    TodoRepository todoRepository;

    private final
    AssigneeRepository assigneeRepository;

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoRepository todoRepository, AssigneeRepository assigneeRepository, TodoService todoService) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
        this.todoService=todoService;
    }

    @GetMapping(value = {"/todo"})
    public String todo(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        model.addAttribute("keys", todoService.getSearchKeys());
        return "todoslist";
    }

    @GetMapping(value = {"/todo/"})
    public String todoIsActive(@RequestParam("isActive") boolean isActive, Model model) {
        model.addAttribute("todos", todoRepository.findAllByDone(isActive));
        model.addAttribute("keys", todoService.getSearchKeys());
        return "todoslist";
    }

    @GetMapping(value = {"/todo/add"})
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
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "todoedit";
    }

    @PostMapping(value = "/todo/{id}/edit")
    public String editTodo(@PathVariable("id") Long id, @ModelAttribute("title") String title,
                           @ModelAttribute("urgent") String urgent, @ModelAttribute("done") String done,
                           @ModelAttribute("assignee") Long assigneeID, @ModelAttribute("due") Date dDate) {
        Boolean urgent2 = Boolean.valueOf(urgent);
        Boolean done2 = Boolean.valueOf(done);
        todoRepository.findById(id).get().setTitle(title);
        todoRepository.findById(id).get().setUrgent(urgent2);
        todoRepository.findById(id).get().setDone(done2);
        todoRepository.findById(id).get().setdDate(dDate);
        todoRepository.findById(id).get().setAssignee(assigneeRepository.findById(assigneeID).get());
        todoRepository.save(todoRepository.findById(id).get());
        return "redirect:/todo";
    }

    @PostMapping(value = {"/todo/search"})
    public String searchResult(@ModelAttribute(name="search") String search, @ModelAttribute(value="key") String key, Model model) throws ParseException {
        model.addAttribute("todos", todoService.getTodos(key, search));
        return "todosearch";
    }


    @GetMapping(value = {"/todo/assignees"})
    public String assignees(Model model) {
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "assignees";
    }

    @GetMapping(value = {"/todo/assignee/add"})
    public String addAssignee(Model model) {
        return "assigneeadd";
    }

    @PostMapping(value = "/todo/assignee/add")
    public String addAssigneePost(@ModelAttribute("name") String name, @ModelAttribute("email") String email) {
        assigneeRepository.save(new Assignee(name, email));
        return "redirect:/todo/assignees";
    }

    @GetMapping(value = "/todo/assignees/{assigneeId}/delete")
    public String deleteAssignee(@PathVariable("assigneeId") Long assigneeId) {
        assigneeRepository.deleteById(assigneeId);
        return "redirect:/todo/assignees";
    }

    @GetMapping(value = "/todo/assignees/{assigneeId}/edit")
    public String editAssignee(@PathVariable("assigneeId") Long assigneeId, Model model) {
        model.addAttribute("assignee", assigneeRepository.findById(assigneeId));
        return "assigneeedit";
    }

    @PostMapping(value = "/todo/assignees/{assigneeId}/edit")
    public String editAssigneePost(@PathVariable("assigneeId") Long assigneeId, @ModelAttribute("name") String name,
                                   @ModelAttribute("email") String email) {
        assigneeRepository.findById(assigneeId).get().setName(name);
        assigneeRepository.findById(assigneeId).get().setEmail(email);
        assigneeRepository.save(assigneeRepository.findById(assigneeId).get());
        return "redirect:/todo/assignees";
    }

    @GetMapping(value = {"/todo/assignees/{assigneeId}"})
    public String pageAssignee(@PathVariable("assigneeId") Long assigneeId, Model model) {
        model.addAttribute("todos", todoRepository.findAllByAssignee(assigneeRepository.findById(assigneeId).get()));
        model.addAttribute("key", "by Assignee");
        return "todosearch";
    }



}

