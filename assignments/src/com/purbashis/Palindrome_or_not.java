package com.purbashis;

public class Palindrome_or_not {
    public static void main(String[] args) {
     String s = "racecar";
   boolean check = Pal(s);
    if (check){
        System.out.println("its palindrome  ");
    }
    else {
        System.out.println("its not a palindrome ");
    }


    }
    static boolean Pal(String str ){
        int left = 0;
        int right = str.length()-1;
        while (left < right){
            if (str.charAt(left)!= str.charAt(right))
            {
                return false;
            }
            left++;
            right--;

        }
          return true;
    }





}
