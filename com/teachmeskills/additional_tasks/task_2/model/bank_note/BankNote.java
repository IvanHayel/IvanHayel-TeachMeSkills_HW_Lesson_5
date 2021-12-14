package com.teachmeskills.additional_tasks.task_2.model.bank_note;

public enum BankNote {
    TEN(10),
    FIFTY(50),
    HUNDRED(100);

    private int value;

    BankNote(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}