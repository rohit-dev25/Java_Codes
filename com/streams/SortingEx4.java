package com.streams;

import java.util.ArrayList;
import java.util.Collections;

public class SortingEx4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
        al.add("rachin");
        al.add("rirat");
        al.add("rohit");
        al.add("dhoni");
        al.add("bumra");
        System.out.println("List"+al);
        System.out.println("------------------");
        Collections.sort(al);
        System.out.println("Result List:"+al);
	}

}
