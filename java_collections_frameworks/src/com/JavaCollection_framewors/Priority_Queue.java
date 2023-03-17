package com.JavaCollection_framewors;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
/*
It is a class in java  that represents a priority queue , which is a data structure that orders
element based  on their priority ,allowing for efficient retrieval of the element with the highest priority.
 */
public class Priority_Queue {
    public static void main(String[] args) {
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.offer(10);
//        pq.offer(56);
//        pq.offer(1);
//        pq.offer(100);
//        System.out.println(pq);//min heap implementation
//        System.out.println(pq.peek());//peek element
//        pq.poll();//remove
//        System.out.println(pq);


//we want the highest element to come out ( big element -the highest priority )
        /*

        we need to pass a comparator in that priority queue constructor
         */
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
                pq.offer(10);
        pq.offer(56);
        pq.offer(1);
        pq.offer(100);
        System.out.println(pq);// maxheap
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);





    }
}
