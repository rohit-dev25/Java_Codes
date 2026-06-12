package com.streams;

import java.util.ArrayList;

public class CountMethodEx2 {

	public static void main(String[] args) {
		 ArrayList<String> al = new ArrayList<>();
	        al.add("sachin");
	        al.add("virat");
	        al.add("rohit");
	        al.add("dhoni");
	        al.add("bumra");
	        System.out.println(al);
	        System.out.println("------------------");
			long count=al.stream().filter(s->s.length()==5).count();
			System.out.println(count);
			

	}

}
