package com.greenfoxacademy.programmerfoxclub.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(path = "/")
    public String show(Model model) {
        return "index";
    }
}
