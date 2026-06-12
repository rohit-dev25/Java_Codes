package com.streams;

import java.util.*;

public class Example1 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        System.out.println("Original Array: " + al);

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) % 2 == 0) {
                res.add(al.get(i));
            }
        }

        System.out.println("Result array is: " + res);

        sc.close();
    }
}