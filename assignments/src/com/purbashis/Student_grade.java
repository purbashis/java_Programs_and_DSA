package com.purbashis;

import java.util.Scanner;

public class Student_grade {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter your mark from 1 - 100 to get your grade ! ");
        int a = in.nextInt();

       String grd = grade(a);
        System.out.println("your grade is : "+ grd);

    }

    static String grade(int a) {






                if (a>=81 && a <=90){
                    return "AB";
                }

                else if (a>=71 && a <=80){
                    return "BB";
                }

                else if (a>=61 && a <=70){
                    return "BC";
                }

                else if (a>=51 && a <=60){
                    return "CD";
                }

                else if (a>=41 && a <=50){
                    return "DD";
                }

                else if (a>=0 && a <=40){
                    return "Fail";
                }else {

                return "invalid ";
        }


    }
}
