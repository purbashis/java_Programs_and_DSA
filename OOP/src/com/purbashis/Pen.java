package com.purbashis;
public class Pen {
    String color;
    String type;

    public void printColor() {
        System.out.println("the color of the pen is :"+this.color);

        // this : it is a java keyword,it refers to the Current  instance of a class,
        //it passes the current object as a parameter to another method.
    }
    Pen(){
        System.out.println("Pen Constructor called");
    }//constructor without parameters .

}
