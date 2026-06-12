package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example2 {

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

        
    List<Integer> list=al.stream().filter(k->k%2==0).collect(Collectors.toList());

        System.out.println("Result array is: " + list);

        sc.close();
	}

}
