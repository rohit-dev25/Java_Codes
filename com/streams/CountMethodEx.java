package com.streams;

import java.util.ArrayList;

public class CountMethodEx {

	public static void main(String[] args) {
		 ArrayList<String> al = new ArrayList<>();
	        al.add("sachin");
	        al.add("virat");
	        al.add("rohit");
	        al.add("dhoni");
	        al.add("bumrah");
	        System.out.println(al);
	        System.out.println("------------------");
			 ArrayList<String> res = new ArrayList<>();
			 int count=0;
			 for(int i=0;i<al.size();i++) {
				 if(al.get(i).length()==5) {
					 count++;
				 }
			 }
			 System.out.println(count);

	}

}
