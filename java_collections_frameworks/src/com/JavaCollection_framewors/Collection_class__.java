package com.JavaCollection_framewors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collection_class__ {
    public static void main(String[] args) {
        ArrayList<Integer>a = new ArrayList<>();
        a.add(2);
        a.add(12);
        a.add(3);
        a.add(39);
        a.add(132);
        System.out.println(a);
        System.out.println("min element "+ Collections.min(a));
        System.out.println("max element "+ Collections.max(a));
        System.out.println("how many times 3 will come "+Collections.frequency(a,3));
Collections.sort(a);
        System.out.println(a);
        Collections.sort(a, Comparator.reverseOrder());
        System.out.println(a);




    }
}
