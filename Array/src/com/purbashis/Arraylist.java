package com.purbashis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        /*
        we know array are fixed size .
        what if you don't know how much size do you need .
        so we need array list for that .
         array-list is a part of  collection  framework


         */

        // syntax: ArrayList<data_type> name_of_the_list = new Arraylist();
        ArrayList<Integer> list = new ArrayList<>(10);
//
//        list.add(78);
//        list.add(455);
//        list.add(54);
//        list.add(988);
//        list.add(78);
//        list.add(455);
//        list.add(54);
//        list.add(988);
//        list.add(974);
//        list.add(778);
//        list.add(974);
//        list.add(778);
//        list.add(775);
//        list.add(745);
//        list.add(277);
//        System.out.println(  list.contains(988)); //check value is in list or not
//        list.set(0,100);//update list
//      //  list.remove(2);//remove the index which is given -2
//        System.out.println(list);
        
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            
        }
        // get item at any index
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // pass index here ,list[index] syntax will not work here

        }
        System.out.print(list);






    }
}
