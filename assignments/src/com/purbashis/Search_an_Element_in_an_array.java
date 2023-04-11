package com.purbashis;

import java.util.Scanner;

public class Search_an_Element_in_an_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size
        System.out.print("Enter array size: ");
        int N = scanner.nextInt();

        // Create array
        int[] arr = new int[N];

        // Get array elements
        System.out.println("Enter array elements: ");
        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get element to search
        System.out.print("Enter the element to search: ");
        int X = scanner.nextInt();

        // Search element in array
        int index = search(arr, N, X);
        if(index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in array");
        }
    }



    static int search(int[] arr, int N, int X){
        for(int i = 0 ; i<= N ; i++){
            if ( arr[i]==X) return i;
        }return -1;
    }
}
