package com.greenfox.anthony.restbackend.controllers;

import com.greenfox.anthony.restbackend.models.Greeter;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {

    @GetMapping("/doubling")
    public String doubling(@RequestParam(required = false) Integer input) {
        if (input != null) {
            return "{received: " + input + "," + "result: " + input * 2 + "}";
        } else {
            return "error: Please provide an input!";
        }
    }
    @GetMapping("/greeter")
    public Greeter greeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        return new Greeter(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public String append(@PathVariable String appendable) {
        return  "appended" + appendable + "a";
    }
}
