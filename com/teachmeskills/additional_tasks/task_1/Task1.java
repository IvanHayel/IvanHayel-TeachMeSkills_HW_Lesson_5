package com.teachmeskills.additional_tasks.task_1;

import com.teachmeskills.additional_tasks.task_1.model.computer.*;
import com.teachmeskills.additional_tasks.task_1.model.hdd.*;
import com.teachmeskills.additional_tasks.task_1.model.ram.RAM;

/**
 * Create a class to describe a computer, this class should contain the following fields:
 * cost, model (string type), RAM and HDD.
 * Create your own classes for RAM and HDD fields.
 * Classes for RAM and HDD must have a default constructor and a constructor with all parameters.
 * RAM class has fields "name" and "size"
 * HDD class has fields "name", "volume" and "type" (external or internal)
 * The Computer class must have two constructors:
 * - the first - with the parameters cost and model,
 * - the second - with all fields
 * When creating a computer object using the first constructor, the RAM and HDD fields must be created
 * using the default constructors.
 * In each of the classes, provide methods for displaying complete information
 * (displaying all fields and all values).
 * Test script to check:
 * create object "computer 1" using the first constructor and display information on the screen
 * create an object "computer 2" using the second constructor and display the information on the screen
 * Add a field "type" to the class "computer" and let this field be Enum (values: laptop or desktop).
 */

public class Task1 {
    public static void main(String[] args) {
        Computer firstComputer = new Computer(3300, "ASUS ROG Zephyrus");
        RAM ramOfSecondComputer = new RAM("DDR4-3200", 8);
        HDD hddOfSecondComputer = new HDD("Toshiba Canvio", 1000, HDDType.EXTERNAL);
        Computer secondComputer = new Computer(
                4000.3, "ASUS ROG Strix",
                ramOfSecondComputer, hddOfSecondComputer,
                ComputerType.NOTEBOOK
        );

        System.out.println("First computer info:");
        firstComputer.showComputerInfo();
        System.out.println("\nSecond computer info:");
        secondComputer.showComputerInfo();
    }
}