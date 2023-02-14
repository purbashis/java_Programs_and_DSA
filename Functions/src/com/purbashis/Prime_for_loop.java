package com.purbashis;

import java.util.Scanner;

public class Prime_for_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (isPrime(n)) {
            System.out.println("Yes, it's a prime number.");
        } else {
            System.out.println("No, it's not a prime number.");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}