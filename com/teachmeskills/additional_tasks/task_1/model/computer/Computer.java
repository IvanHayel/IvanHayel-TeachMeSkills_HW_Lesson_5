package com.teachmeskills.additional_tasks.task_1.model.computer;

import com.teachmeskills.additional_tasks.task_1.model.hdd.HDD;
import com.teachmeskills.additional_tasks.task_1.model.ram.RAM;

public class Computer {
    private double price;
    private String model;
    private RAM ram;
    private HDD hdd;
    private ComputerType type;

    public Computer(double price, String model, RAM ram, HDD hdd, ComputerType type) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.type = type;
    }

    public Computer(double price, String model) {
        this(price, model, new RAM(), new HDD(), ComputerType.UNKNOWN);
    }

    public void showComputerInfo() {
        System.out.printf("Price: %.2f%n", price);
        System.out.println("Model: " + model);
        System.out.println(ram);
        System.out.println(hdd);
        System.out.println("Computer type: " + type);
    }
}