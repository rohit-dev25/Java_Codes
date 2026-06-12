package com.networking;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	public static void main(String[] args) throws IOException {
		ServerSocket listener=new ServerSocket(400);
		Socket ssoc=listener.accept();
		InputStream is=ssoc.getInputStream();
		DataInputStream dis=new DataInputStream(is);
			
			String msg=dis.readUTF();
			System.out.println(msg);
		}
	}


