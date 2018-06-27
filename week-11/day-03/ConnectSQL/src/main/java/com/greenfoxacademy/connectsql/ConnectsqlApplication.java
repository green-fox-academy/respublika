package com.greenfoxacademy.connectsql;

import com.greenfoxacademy.connectsql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectsqlApplication implements CommandLineRunner {
    private final
    TodoRepository todoRepository;

    @Autowired
    public ConnectsqlApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectsqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

