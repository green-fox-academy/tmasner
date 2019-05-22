package com.greenfox.anthony.dependency.service.color;

import com.greenfox.anthony.dependency.service.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyColorGreenImpl implements MyColor {

    @Autowired
    Printer myPrinter;

    @Override
    public void printColor() {
        myPrinter.log("It is Green in color!");
    }
}
