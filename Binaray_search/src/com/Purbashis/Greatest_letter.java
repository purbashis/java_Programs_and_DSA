package com.Purbashis;

import java.util.Arrays;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class Greatest_letter {
    public static void main(String[] args) {
        char []arr={ 'c','d','e','f'};
        char target ='a';
        System.out.println("the array is "+Arrays.toString(arr));
        char ans= nextGreatestLetter(arr,target);
        System.out.println("the next greatest letter is "+ans);

    }

      static char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < letters[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return letters[start % letters.length];
        }
    }


