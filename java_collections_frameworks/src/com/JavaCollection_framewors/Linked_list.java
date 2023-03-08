package com.JavaCollection_framewors;


import java.util.LinkedList;
/*
A LinkedList in Java is a data structure that represents a sequence of elements
 where each element is linked to its next element via a pointer,
allowing efficient insertion and deletion operations.
 */
public class Linked_list {
    public static void main(String[] args) {

        /* defining */
        LinkedList<Integer> l1 = new LinkedList<>();

        /* Add elements to the list */
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);

        System.out.println(l1);

        // Access elements in the list
        System.out.println(l1.get(0));  // 10
        System.out.println(l1.get(1));  // 20
        System.out.println(l1.get(2));  // 30

        // Remove an element from the list
        l1.remove(1);
        System.out.println(l1);  // [Alice, Charlie]

        // Add an element at a specific index
        l1.add(1, 100);
        System.out.println(l1);  // [Alice, Bob, Charlie]
        System.out.println("retrieve all elements from the linked list by using for each : ");
        // Iterate over the list using a for-each loop
        for (int numbs : l1) {
            System.out.print(numbs + "  ");
        }
    }
}
