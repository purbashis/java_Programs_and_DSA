package com.JavaCollection_framewors;

import java.util.ArrayList;
import java.util.Iterator;
/*
ArrayList in Java is a dynamic array implementation
that allows you to add or remove elements at runtime.

 it is  commonly used collection in Java due to its flexibility and efficiency
 in adding and removing elements.
 */
public class Array_list {
    public static void main(String[] args) {

        //Syntax
        ArrayList<String> Student_name= new ArrayList<String>();
//in memory there will be an empty array list will be generated .
    Student_name.add("Rakesh") ;  // internally the size will be "n+( n/2)+1" generated .
        Student_name.add("Rohan");
        System.out.println(Student_name);

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(56);
        list1.add(5);
        list1.add(26);
        list1.add(556);
        list1.add(536);
        list1.add(526);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(746);
        list2.add(54);
        list2.add(2632);
        list2.add(5156);
        list2.add(326);
        list2.add(777);
        System.out.println(list2);
//combine or add 2 list
   list1.addAll(list2);
        System.out.println(list1);
//get element from the list   list1.get(index);
        System.out.println("get the value from the index 1 from list1  :  "+list1.get(1));

//remove an element from index  of a list
     list1.remove(3);
        System.out.println("removing 3rd index of list1"+ list1);
//remove element of a list
        list1.remove(Integer.valueOf(5));//overloads the remove method
        System.out.println("removing the value 5 from the list1 : "+list1);
/*


      list2.clear();         //use for clear the list
 */
//O(n) - Time complexity  (for removing  as well as inserting element )



        // update the element   Time complexity O(1)
        list1.set(0,1000);
        System.out.println("update the value in index 0 "+list1);
       // check the value present or not  Time complexity O(n)
        System.out.println("is 52 present in the list1 : "+list1.contains(52));
        System.out.println("size of the list1 "+list1.size());

        //using for loop to get the elements ;
        System.out.println("get the elements by using for loop from the list1");
    for (int i =0;i<list1.size();i++){
        System.out.print( list1.get(i)+"   ");
    }
        System.out.println("\n");



        System.out.println("by using for each : ");
        for (Integer i:list1)
             {
                 System.out.print(i+"   ");

        }



        System.out.println("\n");
        //iterator
        System.out.println( "by using iterator ");

        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()){
            System.out.print ("  "+ it.next());
        }

    }
}