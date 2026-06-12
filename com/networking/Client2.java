
package com.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		  Socket csoc= new Socket("192.168.137.1",4000);
	      OutputStream os=csoc.getOutputStream();
	      DataOutputStream dos=new DataOutputStream(os);
	      InputStream is=csoc.getInputStream();
	      DataInputStream dis=new DataInputStream(is);
	      Scanner sc=new Scanner(System.in);
	      for(int i=0;i<5;i++) {
	    	  System.out.println("Enter the Message to send Server");
	          String message=sc.nextLine();
	          dos.writeUTF(message);
	          System.out.println("---------------");
	          String rec_msg=dis.readUTF();
	          System.out.println(rec_msg);
	      }
	}

}
