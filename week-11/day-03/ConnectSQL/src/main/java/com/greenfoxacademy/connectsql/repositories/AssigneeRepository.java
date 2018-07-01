package com.greenfoxacademy.connectsql.repositories;

import com.greenfoxacademy.connectsql.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
    Assignee findByNameContainsIgnoreCase(String name);
}
