package com.gqt.serialANDeserial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer1 implements Serializable{
	
	String name;
	String country;
	 transient int runs;
	 transient int wickets;
	int catches;
	
	public Cricketer1(String name,String country,int runs,int wickets,int catches) {
		super();
		this.name=name;
		this.country=country;
		this.runs=runs;
		this.wickets=wickets;
		this.catches=catches;
	}
	void display() {
		System.out.println(name);
		System.out.println(country);
		System.out.println(runs);
		System.out.println(wickets);
		System.out.println(catches);

	}
}


public class SelectiveSerialEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//	     Cricketer1 c1=new Cricketer1("virat","IND",19000,20,300);
//	     c1.display();
//	     FileOutputStream fos=new FileOutputStream("D:\\IOPrograms\\Selective_SerialOutput.txt");
//	     ObjectOutputStream oos=new ObjectOutputStream(fos);
//	     oos.writeObject(c1);
		
		String p1="D:\\IOPrograms\\Selective_SerialOutput.txt";
		FileInputStream fis=new FileInputStream(p1);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Cricketer1 c1=(Cricketer1) ois.readObject();
		c1.display();
	     
	     
	}

}
