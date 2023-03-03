package com.OOPs_Constructor;

public class Copy_constructor {
    String name;
    int admin_id;

    // Copy constructor that takes an object of the same class as input

    Copy_constructor(Copy_constructor C_c){
        this.name = C_c.name;
        this.admin_id = C_c.admin_id;
    }
    // Method to print admin info
    public void admin_info(){
        System.out.println("Admin name " + this.name);
        System.out.println("Admin id " + this.admin_id);
    }
    // Default constructor
    Copy_constructor(){

    }
}

