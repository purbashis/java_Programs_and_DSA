package com.OOPs_Constructor;

public class C_cons {
    public static void main(String[] args) {
        // Creating an object of Copy_constructor class
        Copy_constructor c = new Copy_constructor();
        c.name = "hisimia";
        c.admin_id = 1456546;
        // Creating another object of Copy_constructor class using copy constructor
        Copy_constructor C_c = new Copy_constructor(c);
        // Calling admin_info method of the newly created object to print admin info
        C_c.admin_info();
    }
}
