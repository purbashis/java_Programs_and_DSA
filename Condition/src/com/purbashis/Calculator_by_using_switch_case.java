package com.purbashis;

import java.util.Scanner;

public class Calculator_by_using_switch_case {
    public static void main(String[] args) {
         {

            double num1, num2;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number:");

            /* We are using data type double so that user
             * can enter integer as well as floating point
             * value
             */
            num1 = scanner.nextDouble();
            System.out.print("Enter second number:");
            num2 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            scanner.close();
            double output;

             switch (operator) {
                 case '+' -> output = num1 + num2;
                 case '-' -> output = num1 - num2;
                 case '*' -> output = num1 * num2;
                 case '/' -> output = num1 / num2;


                 /* If user enters any other operator or char apart from
                  * +, -, * and /, then display an error message to user
                  *
                  */
                 default -> {
                     System.out.println("You have entered wrong operator");
                     return;
                 }
             }

            System.out.println(num1+" "+operator+" "+num2+": "+output);
        }
    }

    }

