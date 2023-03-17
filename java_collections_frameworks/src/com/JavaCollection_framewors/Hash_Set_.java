package com.JavaCollection_framewors;
/*
In Java collection framework, a Set is a collection
that does not allow duplicate elements
 and provides no specific order for the elements.

 HashSet :In Java collection framework,
  HashSet is a Set implementation that uses a hash table for
  storage and provides constant-time performance for
  the basic operations such as add, remove, and contains.
 It does not guarantee the order of the elements.

 */

import java.util.HashSet;
import java.util.Set;

public class Hash_Set_ {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(28);
        s.add(23);//add
        s.add(45);
        s.add(123);
        s.add(8283);
        s.add(3);
        s.add(88);
        System.out.println(s); //element print in random order (because of hashing technique)
        s.remove(123);//remove
        System.out.println(s);
        System.out.println( s.contains(3));//checks the element
        System.out.println(s.isEmpty());//checks the set is empty or not
        System.out.println(s.size());//size
        s.clear();
        System.out.println(s);






    }
}
