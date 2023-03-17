package com.JavaCollection_framewors;
/*
ArrayDeque : It is a double ended queue (Deque) implementation in java that allows
adding and removing elements from  ends of thr deque .it is implemented by  re-sizable array .
 */

import java.util.ArrayDeque;

public class Array_Dqueue {
    public static void main(String[] args) {
        ArrayDeque<Integer>adq=new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(1);//add in first
        adq.offerLast(6);//add in last
        adq.offer(66);
        adq.offerFirst(21);
        adq.offerLast(69);


        System.out.println(adq);
        System.out.println(adq.peek());

        System.out.println(adq.peekFirst());//peek the first
        System.out.println(adq.peekLast());// peek the last

              adq.pollLast();// remove from last
        System.out.println(adq);
        adq.pollFirst();  //remove  from first
        System.out.println(adq);







    }
}
