package com.greenfox.anthony.banksimba.controllers;

import com.greenfox.anthony.banksimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShowController {

    BankAccount bankAccount = new  BankAccount("Simba", 2000, "lion");

    @RequestMapping (path = "/show", method = RequestMethod.GET)
    public String showBankAccount(Model model) {

        model.addAttribute("account", bankAccount);
        return "index";
    }
    @RequestMapping(path = "/htmlception", method = RequestMethod.GET)
    public String htmlCeption (Model model) {
        String myText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("myText", myText);
        return "htmlception";
    }
}
