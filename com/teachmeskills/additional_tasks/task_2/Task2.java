package com.teachmeskills.additional_tasks.task_2;

import com.teachmeskills.additional_tasks.task_2.model.atm.ATM;
import com.teachmeskills.additional_tasks.task_2.model.bank_note.BankNote;

/**
 * Create a class to describe the ATM.
 * The set of banknotes in the ATM must be specified by three properties:
 * the number of notes in denominations of 20, 50 and 100. Create methods for adding money to an ATM.
 * Make a function that withdraws money, which takes an amount of money, and returns a boolean value -
 * the success of the operation.
 * When withdrawing money, the function should print out how many bills of which denomination the amount is issued.
 * Create a constructor with three parameters - the number of bills of each denomination.
 */

public class Task2 {
    public static void main(String[] args) {
        ATM atm = new ATM(1000,500,20);
        atm.showATMStatus();
        if (atm.withdraw(3990)) {
            System.out.println("Withdraw successfully ended!");
        } else {
            System.out.println("Withdraw denied.");
        }
        atm.showATMStatus();
        System.out.println("1000 hundred bills added.");
        atm.putBanknotes(BankNote.HUNDRED, 1000);
        atm.showATMStatus();
    }
}