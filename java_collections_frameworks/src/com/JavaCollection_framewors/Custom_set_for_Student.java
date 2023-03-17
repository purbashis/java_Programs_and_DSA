package com.JavaCollection_framewors;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Custom_set_for_Student {
    public static void main(String[] args) {

        Set<Custom_set_Student> ss=new HashSet<>();
        ss.add(new Custom_set_Student("anjali",1));
        ss.add(new Custom_set_Student("Bali",2));
        ss.add(new Custom_set_Student("anil",101));
        ss.add(new Custom_set_Student("hari",21));
        ss.add(new Custom_set_Student("anu",1));//not printing because roll number is already used above
        System.out.println(ss);

        Custom_set_Student s1 = new Custom_set_Student("Rohini",9);
        Custom_set_Student s2= new Custom_set_Student("Rani",9);
        System.out.println(s1.equals(s2));//true   ....because roll_= same in both cases also mentioned hashcode() and equals()  for checking the unique roll number.

        

    }
}
