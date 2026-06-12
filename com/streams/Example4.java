package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
        al.add("sachin");
        al.add("virat");
        al.add("rohit");
        al.add("dhoni");
        al.add("bumrah");
        System.out.println(al);
        System.out.println("------------------");
        List <String> list=al.stream().map(k->k.toUpperCase()).collect(Collectors.toList());
        System.out.println("Result:"+list);
	}

}
