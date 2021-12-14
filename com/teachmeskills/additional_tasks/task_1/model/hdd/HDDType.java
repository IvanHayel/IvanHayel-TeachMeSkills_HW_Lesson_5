package com.teachmeskills.additional_tasks.task_1.model.hdd;

public enum HDDType {
    INTERNAL("internal"),
    EXTERNAL("external"),
    UNKNOWN("unknown");

    private String type;

    HDDType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}