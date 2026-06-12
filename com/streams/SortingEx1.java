package com.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingEx1 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        System.out.println("List: " + al);
        System.out.println("--------------------");

        Collections.sort(al);

        System.out.println("Sorted List: " + al);
    }
}