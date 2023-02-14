
package com.purbashis ;
public class Main {
    public static void main(String[] args) {



        int salary = 25000;

        if (salary>20000){
            salary+=3000;  // salary += 3000

        }
        else if (salary>10000){
            salary+=2000;


        }
        else {
            salary+=1000;
        }
        System.out.println("the new sallary is "+salary);



    }
}