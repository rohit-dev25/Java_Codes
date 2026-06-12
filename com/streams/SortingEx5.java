package com.streams;

import java.util.ArrayList;

public class SortingEx5 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
        al.add("rachin");
        al.add("Rohit");
        al.add("rohit");
        al.add("dhoni");
        al.add("bumra");
        System.out.println("List"+al);
        System.out.println("------------------");
        String min=al.stream().min((s1,s2)->s1.compareTo(s2)).get();
        System.out.println("minimum valued String is:"+min);
        String max=al.stream().max((s1,s2)->s1.compareTo(s2)).get();
        System.out.println("Maximim valued String is:"+max);
	}

}
