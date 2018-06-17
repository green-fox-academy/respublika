package com.greenfoxacademy.gfclass.controllers;

import com.greenfoxacademy.gfclass.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreenFoxController {
    StudentService studentService;

    @Autowired
    public GreenFoxController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/gfa")
    public String main(Model model) {
        model.addAttribute("number", studentService.size());
        return "index";
    }

    @RequestMapping("/gfa/list")
    public String list(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "list";
    }

    @RequestMapping(value = "/gfa/list", method = RequestMethod.POST)
    public String raiseAccounts(@ModelAttribute("export") String s) {
        studentService.export();
        return "redirect:/gfa/list";
    }

    @RequestMapping("/gfa/add")
    public String add() {
        return "add";
    }

    @RequestMapping(value = "/gfa/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("name") String student) {
        studentService.save(student);
        return "addResult";
    }

    @RequestMapping(value = "/gfa/addResult", method = RequestMethod.POST)
    public String addResult(@ModelAttribute("name") String student) {
        studentService.save(student);
        return "addResult";
    }

    @RequestMapping("/gfa/check")
    public String check() {
        return "check";
    }

    @RequestMapping(value = "/gfa/check", method = RequestMethod.POST)
    public String check(@ModelAttribute("name") String student, Model model) {
        model.addAttribute("studentName", student);
        model.addAttribute("message", studentService.find(student));
        return "checkResult";
    }

}
