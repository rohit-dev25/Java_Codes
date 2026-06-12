package com.streams;

import java.util.ArrayList;

public class Example3 {

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
        for(int i=0;i<al.size();i++) {
        	res.add(al.get(i).toUpperCase());
        }
        System.out.println("Result:"+res);
	}

}
