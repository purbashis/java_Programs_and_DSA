package com.purbashis;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the matrices
        System.out.print("Enter the number of rows of the first matrix: ");
        int m1 = scanner.nextInt();
        System.out.print("Enter the number of columns of the first matrix: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the number of rows of the second matrix: ");
        int m2 = scanner.nextInt();
        System.out.print("Enter the number of columns of the second matrix: ");
        int n2 = scanner.nextInt();

        // Check if the matrices can be multiplied
        if (n1 != m2) {
            System.out.println("Error: Cannot multiply matrices. Number of columns of the first matrix must be equal to the number of rows of the second matrix.");
            return;
        }

        // Input the values of the matrices
        System.out.println("Enter the values of the first matrix:");
        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>();
        for (int i = 0; i < m1; i++) {
            matrix1.add(new ArrayList<Integer>());
            for (int j = 0; j < n1; j++) {
                int value = scanner.nextInt();
                matrix1.get(i).add(value);
            }
        }

        System.out.println("Enter the values of the second matrix:");
        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<>();
        for (int i = 0; i < m2; i++) {
            matrix2.add(new ArrayList<Integer>());
            for (int j = 0; j < n2; j++) {
                int value = scanner.nextInt();
                matrix2.get(i).add(value);
            }
        }

        // Perform matrix multiplication
        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        for (int i = 0; i < m1; i++) {
            resultMatrix.add(new ArrayList<Integer>());
            for (int j = 0; j < n2; j++) {
                int sum = 0;
                for (int k = 0; k < n1; k++) {
                    sum += matrix1.get(i).get(k) * matrix2.get(k).get(j);
                }
                resultMatrix.get(i).add(sum);
            }
        }

        // Print the result matrix
        System.out.println("Result Matrix:");
        for (ArrayList<Integer> row : resultMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
