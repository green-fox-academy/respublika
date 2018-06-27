package com.greenfoxacademy.connectsql.repositories;

import com.greenfoxacademy.connectsql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAllByDone(Boolean done);
}
