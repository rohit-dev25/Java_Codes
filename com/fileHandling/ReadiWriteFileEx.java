package com.fileHandling;

import java.io.*;
import java.util.Scanner;

public class ReadiWriteFileEx {

	public static void main(String[] args) {
       String p1="D:\\IOPrograms\\File1.txt";
       try {
		FileWriter fw=new FileWriter(p1);
		fw.write("Hello Welcome To Java,"
				+ "hi");
		fw.close();
		
		System.out.println("Reading the data from the file...");
		FileReader fr=new FileReader(p1);
		Scanner sc=new Scanner(fr);
		while(sc.hasNextLine()) {
			String temp=sc.next();
			System.out.print(temp);
		}
		sc.close();
		fr.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
