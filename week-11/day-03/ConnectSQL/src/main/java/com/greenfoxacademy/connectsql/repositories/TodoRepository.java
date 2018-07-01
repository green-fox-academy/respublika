package com.greenfoxacademy.connectsql.repositories;

import com.greenfoxacademy.connectsql.models.Assignee;
import com.greenfoxacademy.connectsql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//import java.sql.Date;
import java.util.Date;
import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAllByDone(Boolean done);
    List<Todo> findAllByTitleContainsIgnoreCase(String title);
    List<Todo> findAllByAssignee(Assignee assignee);
    List<Todo> findAllByCrDate(Date date);
    List<Todo> findAllByDDate(Date date);
}
