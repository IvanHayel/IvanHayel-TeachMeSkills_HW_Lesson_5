package com.teachmeskills.compulsory_tasks.task_1.model.credit_card;

public class CreditCard {
    private final int accountNumber;

    private double accountAmount;

    public CreditCard(int accountNumber, double accountAmount) {
        this.accountNumber = accountNumber;
        this.accountAmount = accountAmount;
    }

    public void topUp(double amount) {
        if (amount >= 0) {
            accountAmount += amount;
        }
    }

    public void withdraw(double amount) {
        if (accountAmount >= amount && amount >= 0) {
            accountAmount -= amount;
        }
    }

    public void showCreditCardStatus() {
        System.out.printf("Account number: %d\n", accountNumber);
        System.out.printf("Account amount: %.2f\n", accountAmount);
    }
}