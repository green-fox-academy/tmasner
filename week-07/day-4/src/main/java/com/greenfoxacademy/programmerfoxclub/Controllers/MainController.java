package com.greenfoxacademy.programmerfoxclub.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(path = "/main")
    public String show(Model model) {
        return "mainPage";
    }

    @RequestMapping(path = "/main/foxinformation")
    public String login(Model model) {
        return "login";
    }

}
