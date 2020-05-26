package com.company;

import com.company.model.ATM;
import com.company.model.Bill;

public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.getBillsInAtm().add(new Bill(1000));
        atm.getBillsInAtm().add(new Bill(1000));
        atm.getBillsInAtm().add(new Bill(500));
        atm.getBillsInAtm().add(new Bill(500));
        atm.getBillsInAtm().add(new Bill(500));
        atm.getBillsInAtm().add(new Bill(100));
        atm.getBillsInAtm().add(new Bill(100));
        atm.getBillsInAtm().add(new Bill(100));
        atm.getBillsInAtm().add(new Bill(100));
        atm.getBillsInAtm().add(new Bill(100));


        System.out.println(atm.getRemainingValue());

        if(atm.withdraw(1500)){
            System.out.println("Withdraw successful, remaining money in ATM: " + atm.getRemainingValue());
            for(Bill b : atm.getBillsInAtm()){
                System.out.println(b.getValue());
            }
        }else {
            System.out.println("Could not withdraw that amount");
        }
        if(atm.withdraw(700)){
            System.out.println("Withdraw successful, remaining money in ATM: " + atm.getRemainingValue());
            for(Bill b : atm.getBillsInAtm()){
                System.out.println(b.getValue());
            }
        }else {
            System.out.println("Could not withdraw that amount");
        }
        if(atm.withdraw(400)){
            System.out.println("Withdraw successful, remaining money in ATM: " + atm.getRemainingValue());
            for(Bill b : atm.getBillsInAtm()){
                System.out.println(b.getValue());
            }
        }else {
            System.out.println("Could not withdraw that amount");
        }
        if(atm.withdraw(1100)){
            System.out.println("Withdraw successful, remaining money in ATM: " + atm.getRemainingValue());
            for(Bill b : atm.getBillsInAtm()){
                System.out.println(b.getValue());
            }
        }else {
            System.out.println("Could not withdraw that amount");
        }
        if(atm.withdraw(1000)){
            System.out.println("Withdraw successful, remaining money in ATM: " + atm.getRemainingValue());
            for(Bill b : atm.getBillsInAtm()){
                System.out.println(b.getValue());
            }
        }else {
            System.out.println("Could not withdraw that amount");
        }
        if(atm.withdraw(700)){
            System.out.println("Withdraw successful, remaining money in ATM: " + atm.getRemainingValue());
            for(Bill b : atm.getBillsInAtm()){
                System.out.println(b.getValue());
            }
        }else {
            System.out.println("Could not withdraw that amount");
        }
        if(atm.withdraw(300)){
            System.out.println("Withdraw successful, remaining money in ATM: " + atm.getRemainingValue());
            for(Bill b : atm.getBillsInAtm()){
                System.out.println(b.getValue());
            }
        }else {
            System.out.println("Could not withdraw that amount");
        }




    }
}
