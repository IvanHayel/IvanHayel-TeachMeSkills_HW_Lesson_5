package com.teachmeskills.additional_tasks.task_2.model.atm;

import com.teachmeskills.additional_tasks.task_2.model.bank_note.BankNote;

import java.util.HashMap;
import java.util.Map;

public class ATM {
    private Map<BankNote, Integer> banknotes = new HashMap<>(3);
    private int amount;

    public ATM(int quantityOfTens, int quantityOfFifties, int quantityOfHundreds) {
        banknotes.put(BankNote.TEN, quantityOfTens);
        banknotes.put(BankNote.FIFTY, quantityOfFifties);
        banknotes.put(BankNote.HUNDRED, quantityOfHundreds);
        calculateAmount();
    }

    public ATM() {
        this(0, 0, 0);
    }

    public void showATMStatus() {
        System.out.println("~~~~~~~ATM STATUS~~~~~~~");
        System.out.println("Amount: " + amount);
        for (Map.Entry<BankNote, Integer> entry : banknotes.entrySet()) {
            System.out.println(entry.getKey().getValue() + "$ - " + entry.getValue() + " bill(s).");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void putBanknotes(BankNote bankNote, int quantity) {
        if (quantity > 0) {
            banknotes.put(bankNote, banknotes.get(bankNote) + quantity);
            calculateAmount();
        }
    }

    public boolean withdraw(int amount) {
        if (!isAmountCorrect(amount)) {
            return false;
        }
        Map<BankNote, Integer> withdrawnBanknotes = new HashMap<>(3);
        int issuedAmount = amount;
        if (issuedAmount >= BankNote.HUNDRED.getValue()) {
            issuedAmount = withdrawBanknotes(issuedAmount, BankNote.HUNDRED, withdrawnBanknotes);
        }
        if (issuedAmount >= BankNote.FIFTY.getValue()) {
            issuedAmount = withdrawBanknotes(issuedAmount, BankNote.FIFTY, withdrawnBanknotes);
        }
        if (issuedAmount >= BankNote.TEN.getValue()) {
            issuedAmount = withdrawBanknotes(issuedAmount, BankNote.TEN, withdrawnBanknotes);
            if(issuedAmount != 0){
                return false;
            }
        }
        this.amount -= amount;
        showWithdrawInformation(withdrawnBanknotes);
        return true;
    }

    private int withdrawBanknotes(int currentAmount, BankNote bankNote, Map<BankNote, Integer> withdrawnBanknotes) {
        withdrawnBanknotes.put(bankNote, 0);
        while (banknotes.get(bankNote) != 0 && currentAmount >= bankNote.getValue()) {
            banknotes.put(bankNote, banknotes.get(bankNote) - 1);
            currentAmount -= bankNote.getValue();
            withdrawnBanknotes.put(bankNote, withdrawnBanknotes.get(bankNote) + 1);
        }
        return currentAmount;
    }

    private void showWithdrawInformation(Map<BankNote, Integer> withdrawnBanknotes) {
        System.out.println("You have received the following bills:");
        for (Map.Entry<BankNote, Integer> entry : withdrawnBanknotes.entrySet()) {
            System.out.println(entry.getKey().getValue() + "$ - " + entry.getValue() + " bill(s).");
        }
    }

    private void calculateAmount() {
        for (Map.Entry<BankNote, Integer> entry : banknotes.entrySet()) {
            amount += entry.getValue() * entry.getKey().getValue();
        }
    }

    private boolean isAmountCorrect(int amount) {
        return amount % 10 == 0 && amount <= this.amount;
    }
}