package com.purbashis;

import java.util.Scanner;

public class Array_element_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int x = in.nextInt();
        System.out.println("Enter the number of columns: ");
        int y = in.nextInt();

        int [][] num = new int[x][y];

        System.out.println("Enter the elements of the array: ");
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                num[row][col] = in.nextInt();
            }
        }

        System.out.println("Enter the target number to search: ");
        int target = in.nextInt();

        int[] index = linearSearch(num, target);
        if (index[0] == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index [" + index[0] + "][" + index[1] + "].");
        }
    }

    static int[] linearSearch(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1};
    }
}
