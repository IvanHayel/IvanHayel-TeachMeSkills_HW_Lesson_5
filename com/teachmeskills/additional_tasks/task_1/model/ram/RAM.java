package com.teachmeskills.additional_tasks.task_1.model.ram;

public class RAM {
    private String name;
    private int size;

    public RAM(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public RAM() {
        this("NO INFO", 0);
    }

    @Override
    public String toString() {
        return "RAM [" +
                "name = '" + name + '\'' +
                ", size = " + size + " GB" +
                ']';
    }
}