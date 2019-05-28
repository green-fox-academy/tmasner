package com.greenfox.databaseintegration.repository;

import com.greenfox.databaseintegration.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository <Todo, Long>{
}
