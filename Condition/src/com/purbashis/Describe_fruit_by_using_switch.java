package com.purbashis;

import java.util.Scanner;

public class Describe_fruit_by_using_switch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter any fruit name : ");
        String fruit = in.next().toLowerCase();

        //go switch press alt enter  it gives u wings

        switch (fruit) {
            case "mango":
                System.out.println("king of the Fruit ");
                break;
            case "apple":
                System.out.println("A  sweet red Fruit ");
                break;
            case "orange":
                System.out.println("Round fruit ");
                break;
            case "grapes":
                System.out.println("small Fruit ");
                break;
            default:
                System.out.println("please enter the valid fruit ");
                break;
        }

    }
}
