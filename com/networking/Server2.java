package com.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {

	public static void main(String[] args) throws IOException {
		ServerSocket listener=new ServerSocket(4000);
		Socket ssoc=listener.accept();
		InputStream is=ssoc.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		OutputStream os=ssoc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		for(int i=0;i<5;i++) {
			String message=dis.readUTF();
			System.out.println(message);
			System.out.println("--------------");
			System.out.println("Enter Message to Client:");
			Scanner sc=new Scanner(System.in);
			String resp_msg=sc.nextLine();
			dos.writeUTF(resp_msg);
		}
	}

}
