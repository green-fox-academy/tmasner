package com.greenfox.anthony.banksimba.controllers;

import com.greenfox.anthony.banksimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class ShowMultipleAccountsController {

    List<BankAccount> listOfAccounts = Arrays.asList(   new BankAccount("Simba", 2000, "lion", true),
            new BankAccount("Dumbo", 5000, "elephant", false),
            new BankAccount("Yolo", 1000, "giraffe", false),
            new BankAccount("Paspa", 10000, "bear", false),
            new BankAccount("Mamamia", 5000, "tiger", false));

    @RequestMapping( path = "/showMultipleAccounts", method = RequestMethod.GET)
    public String displayAccount(Model model){
        model.addAttribute("listOfAccount", listOfAccounts);
        model.addAttribute("currency", "Zebra");
        model.addAttribute("shiny", "color: gold");
        return "showMultipleAccounts";
    }
}