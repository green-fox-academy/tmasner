package com.greenfox.anthony.banksimba.models;

import java.util.Arrays;
import java.util.List;

public class BankAccountList {

    List<BankAccount> bankAccountList;

    public BankAccountList() {
        this.bankAccountList = Arrays.asList(
                new BankAccount("Scar", 911, "Lion"),
                new BankAccount("Mufasa", 1945, "Lion"),
                new BankAccount("Pumbaa", 9000, "Boar"),
                new BankAccount("Nala", 1918, "Lion"));
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }
}
