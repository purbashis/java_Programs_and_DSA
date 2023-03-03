package com.purbashis;

public class Student {
    String name;
    int age;

    public void studentInfo() {
        System.out.println("the name of the student is :"+this.name);
        System.out.println("the age of the student is : "+this.age);
    }
    /*
‘this’ keyword :  ‘this’ keyword in Java that refers to the current instance of the class.
In OOPS, it is used to:
*pass the current object as a parameter to another method

*refer to the current class instance variable
 */
//Constructor: Constructor is a special type of function in java .

    Student(){
        System.out.println(" Student constructor called");
    }//constructor without parameters .
    /*1. Non-Parameterized constructor :
     A constructor which has no argument is known as non-parameterized constructor.
     */
}


