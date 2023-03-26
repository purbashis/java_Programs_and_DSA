package com.purbashis;

public class Count_no_digits {
    public static void main(String[] args) {
        int num = 123456987;
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count+"no of digits ");
    }
}
