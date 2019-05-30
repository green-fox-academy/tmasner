package com.greenfox.mysql.controllers;

import com.greenfox.mysql.models.ToDo;
import com.greenfox.mysql.repositories.ToDoRepository;
import com.greenfox.mysql.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/todo")
@Controller
public class ToDoController {

    private ToDoRepository repo;
    private ToDoService service;

    @Autowired
    public ToDoController(ToDoRepository repo, ToDoService service) {
        this.repo = repo;
        this.service = service;
    }

    @RequestMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(required = false) boolean isActive) {
        if (isActive) {
            model.addAttribute("todos", service.getUnFinished(service.getAllToDos()));
        } else {
            model.addAttribute("todos", repo.findAll());
        }
        return "todolist";
    }

    @GetMapping("add")
    public String add(Model model){
        model.addAttribute("newToDo", new ToDo());
        return "add";
    }

    @PostMapping("add")
    public String handleNewToDo(@ModelAttribute ToDo newToDo){
        repo.save(newToDo);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable long id){
        repo.deleteById(id);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable long id){
        model.addAttribute("editToDo", repo.findById(id).get());
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String handleEditToDo(@ModelAttribute ToDo editToDo){
        repo.save(editToDo);
        return "redirect:/todo/";
    }

    @GetMapping("/seed") //to impelement data
    public String seed() {
        this.repo.save(new ToDo("Hello sunshine", true, true ));
        this.repo.save(new ToDo("DEAD inside I'am", true, true));
        this.repo.save(new ToDo("Finish dinner", true, false));
        this.repo.save(new ToDo("Do laundry", false, false));
        this.repo.save(new ToDo("Create new folder for pictures", true, false));
        return "todolist";
    }

    @RequestMapping("/16/detail")
    public String detail() {
        return "death";
    }

}