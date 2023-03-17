package com.JavaCollection_framewors;

import java.util.Set;
import java.util.TreeSet;

/*
In Java collection framework,
TreeSet is a Set implementation that stores its elements in a sorted tree structure,
based on the natural ordering of the elements or a custom comparator.
It does not allow duplicate elements and provides log-time performance for the basic operations
 such as add, remove, and contains.
 */
public class Tree_set_ {
    public static void main(String[] args) {
        Set<Integer>ts= new TreeSet<>();
        ts.add(999);
        ts.add(41);
        ts.add(199);
        ts.add(81);
        ts.add(99);
        ts.add(10);
        ts.add(9999);
        ts.add(1);
        System.out.println(ts);//print in sorted order
        ts.remove(1);//remove
        System.out.println(ts);
        System.out.println( ts.contains(99));//checks the element
        System.out.println(ts.isEmpty());//checks the set is empty or not
        System.out.println(ts.size());//size
        ts.clear();
        System.out.println(ts);


    }
}
