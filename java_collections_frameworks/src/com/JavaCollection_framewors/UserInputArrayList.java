package com.JavaCollection_framewors;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputArrayList{
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter some strings (type \"quit\" to stop):");
        String userInput = in.nextLine();
        while (true) {
            if (userInput.equals("quit"))
                break;
            myArrayList.add(userInput);
            userInput = in.nextLine();
        }

        System.out.println("You entered the following strings:");
        for (String s : myArrayList) {
            System.out.println(s);
        }
    }
}
