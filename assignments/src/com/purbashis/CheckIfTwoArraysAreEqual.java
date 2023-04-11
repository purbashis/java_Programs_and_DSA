package com.purbashis;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfTwoArraysAreEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the arrays: ");
        int N = sc.nextInt();

        long[] A = new long[N];
        long[] B = new long[N];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextLong();
        }

        if (check(A, B, N)) {
            System.out.println("The two arrays are equal");
        } else {
            System.out.println("The two arrays are not equal");
        }
    }

    // Function to check if two arrays are equal or not.
    public static boolean check(long A[], long B[], int N) {
        Arrays.sort(A);
        Arrays.sort(B);

        if (A == null || B == null || A.length != B.length) {
            return false;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i])
                return false;
        }

        return true;
    }
}
