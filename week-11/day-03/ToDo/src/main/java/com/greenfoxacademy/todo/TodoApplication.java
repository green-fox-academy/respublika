package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
    private final
    TodoRepository todoRepository;

    @Autowired
    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo( "Create something", true, true));
        todoRepository.save(new Todo( "Save something", true, true));
        todoRepository.save(new Todo( "Then delete", true, true));
        todoRepository.save(new Todo( "Do something else", true, true));
    }
}
