package com.JavaCollection_framewors;

import java.util.Map;
import java.util.TreeMap;
/*
In Java collection framework, TreeMap is a Map implementation that stores key-value pairs in a sorted tree structure,
based on the natural ordering of the keys or a custom comparator.
It provides log-time performance for the basic operations such as put, get, and remove.

 */

public class Tree_map_ {
    public static void main(String[] args) {

        Map<String,Integer> m =new TreeMap<>();
        m.put("Zen",1);
        m.put("Roni",9);
        m.put("Xavi",45);
        m.put("Ash",250);
        System.out.println(m);//sorted order (keys)

        m.remove("Roni");
        m.putIfAbsent("Zen",56);
        System.out.println(m);

    }
}
