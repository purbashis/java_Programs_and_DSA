package com.purbashis;

import java.util.Scanner;

public class Circumference_of_circle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius : ");

        float a = in.nextFloat();

        float c=Circumference(a);

        System.out.println("the Circumference of the circle is : " +c);




    }

  static float Circumference(float a) {
        float ans = (float) (2*Math.PI*a);
        return ans;
    }
}
