package com.JavaCollection_framewors;

import java.util.LinkedList;
import java.util.Queue;
/*
A Queue in Java is a data structure
 that follows the First-In-First-Out (FIFO) principle
 and allows elements to be inserted at the end and removed from the front.
 */
public class Queue_ {
    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();
        //offer(): insert element in queue
        q1.offer(25);
        q1.offer(56);
        q1.offer(1);
        q1.offer(99);
        System.out.println("elements in a queue :  "+q1);
        //peek() : find which next element to be removed
        System.out.println(" next element to be removed  : "+q1.peek());
          //poll(): remove the first inserted element .
           q1.poll();
        System.out.println("after using poll method ,elements are in queue : "+q1);
        System.out.println( "checks 56 present in the queue : "+q1.contains(56));


        //retrieve
        System.out.println("Retrieve the elements  by using for each ");
        for (int element : q1) {
            System.out.print(element+ " " );
        }

    }

}
