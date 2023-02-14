package com.purbashis;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class Find_numbers_even_digits {
    public static void main(String[] args) {
        int [] nums = {555,98,901,482,1771};
        System.out.println("find even digits of numbers in the list : "+findNumbers(nums));
        System.out.println(digits(123));  // 3
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int num :nums) {
            if (even(num)){
                count++;
            }

        }


        return count ;
    }
    //function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberofDigits=digits2(num);
        if (numberofDigits %2 == 0){
            return true;
        }
        return false;

    }

    //count number of digits in a number

    //1st way to get digits
    static  int  digits(int num){

        // if there is a negative number
        if(num<0){
            num= num*-1;
        }



        // if there is a 0 in your list
        if (num == 0){
            return 1;
        }

        int count =0;
        while (num> 0){
            count++;
            num=num/10;// num /= 10
        }

        return count;
    }


    // 2nd way to find the digits
    static int digits2 (int num){
        // for if there is  a 0 in the list
        if (num==0){
            return 1;
        }

        int i = (int) (Math.log10(num)) + 1;
        return i;
    }



}
