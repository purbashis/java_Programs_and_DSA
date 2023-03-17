package com.JavaCollection_framewors;
/*

In Java collection framework,
LinkedHashSet is a Set implementation that
maintains the insertion order of the elements and uses a hash table for storage.
It provides constant-time performance for the basic operations such as add, remove, and contains.
 */
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_hash_set_ {
    public static void main(String[] args) {
        Set <Integer> ls= new LinkedHashSet<>();

        
        ls.add(23);
        ls.add(898);
        ls.add(123);
        ls.add(79);
        ls.add(1223);
        ls.add(900);
        System.out.println(ls);//print the element the order you  inserted
        ls.remove(123);//remove
        System.out.println(ls);
        System.out.println( ls.contains(3));//checks the element
        System.out.println(ls.isEmpty());//checks the set is empty or not
        System.out.println(ls.size());//size
        ls.clear();
        System.out.println(ls);

    }
}
