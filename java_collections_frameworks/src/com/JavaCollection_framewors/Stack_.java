package com.JavaCollection_framewors;

import java.util.Stack;
/*

A stack is a datastructures that stores elements
in a last in first out (LIFO) manner,
it's allowing elements to be added and removed only from top of the stack.

 */
public class Stack_ {
    public static void main(String[] args) {
        Stack<String> animals=new Stack<>();
        animals.push("dog");
        animals.push("cat");
        animals.push("lion");
        animals.push("goat");
        //push() :inserting elements in stack
        System.out.println(animals);
       // peek() : to check who is on the top of the stack
        System.out.println(" to check who is on the top of the stack : "+animals.peek());
    //pop() : remove the last element which inserted on the stack.
        animals.pop();
        System.out.println(animals);
    }
}
