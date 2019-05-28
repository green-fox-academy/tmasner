package com.greenfox.mysql.repositories;

import com.greenfox.mysql.models.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}