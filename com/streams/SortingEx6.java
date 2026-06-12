package com.streams;

import java.util.ArrayList;

public class SortingEx6 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(101);
        al.add(108);
        al.add(11);
        al.add(17);
        al.add(16);
        al.add(12);
        System.out.println(al);
        System.out.println("--------------");
        al.stream().forEach(i->System.out.println(i));
        System.out.println("--------------");
        al.stream().forEach(System.out::println);

        
	}

}
