package com.teachmeskills.additional_tasks.task_1.model.hdd;

public class HDD {
    private String name;
    private int size;
    private HDDType type;

    public HDD(String name, int size, HDDType type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public HDD() {
        this("NO INFO", 0, HDDType.UNKNOWN);
    }

    @Override
    public String toString() {
        return "HDD [" +
                "name = '" + name + '\'' +
                ", size = " + size + " GB" +
                ", type = " + type +
                ']';
    }
}