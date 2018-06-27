package com.greenfoxacademy.connectsql.repositories;

import com.greenfoxacademy.connectsql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
