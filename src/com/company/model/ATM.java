package com.company.model;

import java.util.*;

public class ATM {

    private List<Bill> billsInAtm = new ArrayList<>();

    public List<Bill> getBillsInAtm() {
        return billsInAtm;
    }

    public void setBillsInAtm(List<Bill> billsInAtm) {
        this.billsInAtm = billsInAtm;
    }

    public int getRemainingValue() {
        int value = 0;
        for (Bill b : billsInAtm) {
            value += b.getValue();
        }
        return value;
    }

    public boolean withdraw(int amount) {

        ArrayList<Bill> billsToRemove = new ArrayList<>();

            if (amount >= 1000) {
                for (int i = 0; i < billsInAtm.size(); i++) {
                    if (billsInAtm.get(i).getValue() == 1000 && amount >= 1000) {
                        billsToRemove.add(billsInAtm.get(i));
                        amount -= 1000;

                    }

                }
            }
            if (amount >= 500) {
                for (int i = 0; i < billsInAtm.size(); i++) {
                    if (billsInAtm.get(i).getValue() == 500 && amount >= 500) {
                        billsToRemove.add(billsInAtm.get(i));
                        amount -= 500;

                    }
                }
            }
            if (amount >= 100) {

                for (int i = 0; i < billsInAtm.size(); i++) {
                    if (billsInAtm.get(i).getValue() == 100 && amount >= 100) {
                        billsToRemove.add(billsInAtm.get(i));

                        amount -= 100;

                    }
                }
            }
            billsInAtm.removeAll(billsToRemove);

            if(amount == 0){
                billsToRemove.clear();

                return true;
            }else {
                billsInAtm.addAll(billsToRemove);
                billsToRemove.clear();
                return false;
            }


    }
}

