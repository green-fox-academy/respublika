package com.greenfoxacademy.connectsql;

import com.greenfoxacademy.connectsql.models.Todo;
import com.greenfoxacademy.connectsql.models.Assignee;
import com.greenfoxacademy.connectsql.repositories.AssigneeRepository;
import com.greenfoxacademy.connectsql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ConnectsqlApplication implements CommandLineRunner {
    private final
    TodoRepository todoRepository;

    private final
    AssigneeRepository assigneeRepository;

    @Autowired
    public ConnectsqlApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(ConnectsqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Create something", false, false));
        todoRepository.save(new Todo("Save something", false, false));
        todoRepository.save(new Todo("Then delete", false, true));
        todoRepository.save(new Todo("Do something else", false, true));
        todoRepository.save(new Todo("Sleep", true, false));
        todoRepository.save(new Todo("Sleep more", true, false));
        todoRepository.save(new Todo("Task 04", true, true));
        todoRepository.save(new Todo("Call mom", true, true));
        assigneeRepository.save(new Assignee("Bela Nagy", "nagybela@email.hu"));
        assigneeRepository.save(new Assignee("Judit Kiss", "juditka@email.hu"));
        assigneeRepository.save(new Assignee("Elemer Juhasz", "elemer.j@email.hu"));
    }
}

