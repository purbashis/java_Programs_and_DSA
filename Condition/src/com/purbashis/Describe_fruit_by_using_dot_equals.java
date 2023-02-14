package com.purbashis;

import java.util.Scanner;

public class Describe_fruit_by_using_dot_equals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any fruit name : ");
        String fruit = in.next().toLowerCase();





        if (fruit.equals("mango"))

            {
                System.out.println("KIng of the Fruit ");
            }

            else if (fruit.equals("apple")) {
                System.out.println("A sweet red fruit  ");

            }
            else if (fruit.equals("orange")) {
                System.out.println("A round fruit");

            }

            else if (fruit.equals("grapes")) {
                System.out.println("Small fruit");

            }
            else {
                System.out.println("invalid input given ");
        }







    }
}







