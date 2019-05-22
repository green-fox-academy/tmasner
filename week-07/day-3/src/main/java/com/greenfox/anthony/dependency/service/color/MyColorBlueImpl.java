package com.greenfox.anthony.dependency.service.color;

import com.greenfox.anthony.dependency.service.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;

//place for @Service
public class MyColorBlueImpl implements MyColor {

    @Autowired
    Printer myPrinter;

    @Override
    public void printColor() {
        myPrinter.log("It is blue in color!");
    }
}
