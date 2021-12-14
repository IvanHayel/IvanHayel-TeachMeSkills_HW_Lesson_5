package com.teachmeskills.compulsory_tasks.task_1;

import com.teachmeskills.compulsory_tasks.task_1.model.credit_card.CreditCard;

/**
 * Create a CreditCard class with fields account number, current account amount.
 * Add a method that allows you to add an amount to your credit card.
 * Add a method that allows you to withdraw a certain amount from the card.
 * Add a method that displays the current information about the card.
 * Write a program that creates three objects of the CreditCard class with the given account number and initial amount
 * Test script to check:
 * Put money on the first two cards and withdraw from the third.
 * Display the current status of all three cards.
 */

public class Task1 {
    public static void main(String[] args) {
        CreditCard firstCard = new CreditCard(3145,10000);
        CreditCard secondCard = new CreditCard(2828,435.12);
        CreditCard thirdCard = new CreditCard(3939,100.25);

        firstCard.topUp(10.21);
        secondCard.topUp(0.88);
        thirdCard.withdraw(50.25);

        System.out.println("First card status");
        firstCard.showCreditCardStatus();
        System.out.println("Second card status");
        secondCard.showCreditCardStatus();
        System.out.println("Third card status");
        thirdCard.showCreditCardStatus();
    }
}