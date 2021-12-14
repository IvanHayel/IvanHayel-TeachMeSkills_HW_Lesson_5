package com.teachmeskills.additional_tasks.task_1.model.computer;

public enum ComputerType {
    NOTEBOOK("notebook"),
    DESKTOP("desktop"),
    UNKNOWN("unknown");

    private String type;

    ComputerType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}