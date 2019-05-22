package com.greenfox.anthony.dependency.service.color;

import com.greenfox.anthony.dependency.service.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;

// place for @Service
public class MyColorRedImpl implements MyColor {

    @Autowired
    Printer myPrinter;

    @Override
    public void printColor() {
        myPrinter.log("It is Red in color!");
    }
}
