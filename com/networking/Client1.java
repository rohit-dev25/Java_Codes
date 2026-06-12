package com.networking;

import java.util.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
      Socket csoc= new Socket("192.168.110.27",400);
      OutputStream os=csoc.getOutputStream();
      DataOutputStream dos=new DataOutputStream(os);
      Scanner sc=new Scanner(System.in);
      
    	  System.out.println("Enter the Message to send Server");
          String message=sc.nextLine();
          dos.writeUTF(message);
	}

}
