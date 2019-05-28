package com.greenfox.mysql.services;

import com.greenfox.mysql.models.ToDo;
import com.greenfox.mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoService {

    ToDoRepository repo;

    @Autowired
    public ToDoService(ToDoRepository repo) {
        this.repo = repo;
    }

    public List<ToDo> getAllToDos() {
        List<ToDo> allToDos = new ArrayList<>();
        repo.findAll().forEach(allToDos::add);
        return allToDos;
    }

    public List<ToDo> getUnFinished(List<ToDo> inputList) {
        return inputList.stream().filter(a -> !a.isDone()).collect(Collectors.toList());
    }
}