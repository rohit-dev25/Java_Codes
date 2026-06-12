package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingEx3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
        al.add("sachin");
        al.add("virat");
        al.add("rohit");
        al.add("dhoni");
        al.add("bumra");
        System.out.println(al);
        System.out.println("------------------");
        List<String> res=al.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(res);
	}

}
