package com.rahul;

import java.util.Scanner;

public class QuesSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"tim", "harry", "crish", "mayank", "rohan"};
        System.out.print("Enter target name: ");
        String target = sc.nextLine();
        int result = linear_search(arr, target);
        if (result == -1) {
            System.out.println("target name not found");
        } else {
            System.out.println("target name found at index: " + result);
        }
    }
    static int linear_search (String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
