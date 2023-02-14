package com.purbashis;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter the emp id :");
        int empID = in.nextInt();

        switch (empID) {
            case 1:
                System.out.println("Purbashis Behera ");
                break;
            case 2:
                System.out.println("Rahul Kumar ");
                break;

            case 3:
                System.out.println("Emp Number 3");
                System.out.println("which department : ");
                String department = in.next().toLowerCase();

                switch (department) {
                    case "it":
                        System.out.println("IT Department");
                        break;
                    case "management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }



    }
}
