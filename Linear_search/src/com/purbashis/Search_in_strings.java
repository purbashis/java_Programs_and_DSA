package com.purbashis;

import java.util.Arrays;

public class Search_in_strings {
    public static void main(String[] args) {
        String name = "Purbashis";
        char target ='i';
        System.out.println(search(name,target));
        System.out.println(  Arrays.toString(name.toCharArray()));



    }
    static boolean search2 (String str, char target){
        if (str.length()==0){
            return false;
        }
        for (char ch : str.toCharArray())
        {
            if (ch==target)
            {
                return true;
            }

        }
        return  false;

    }




    static boolean search (String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int index = 0; index < str.length(); index++)
        {
         if (target ==str.charAt(index)){
             return true;
         }

        }
        return  false;

    }

}
