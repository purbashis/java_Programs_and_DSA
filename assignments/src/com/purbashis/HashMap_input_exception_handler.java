package com.purbashis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_input_exception_handler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();
        String key;
        int value;
        boolean inputCorrect = false;
        System.out.println("Enter key-value pairs (type 'done' to stop):");
        while (!inputCorrect) {
            try {
                while (true) {
                    System.out.print("Key: ");
                     key = scanner.next();
                    if (key.equals("done")) break;
                    System.out.print("Value: ");
                     value = scanner.nextInt();
                    map.put(key, value);
                }
                inputCorrect = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer value for the value.");
                scanner.next();
            }
        }

        System.out.println("HashMap contains:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}
