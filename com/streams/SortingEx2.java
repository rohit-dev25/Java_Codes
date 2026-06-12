package com.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortingEx2 {

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

        List<Integer> res=al.stream().sorted().collect(Collectors.toList());
        System.out.println(res);
	}

}
