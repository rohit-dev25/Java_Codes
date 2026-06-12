package com.fileHandling;

import java.io.*;

public class FileMethodsExample {

	public static void main(String[] args) throws IOException {
     String p1="D:\\IOPrograms\\File1.txt";
     File f1=new File(p1);
     f1.createNewFile();//creates new file in specied path
     System.out.println(f1.exists());//checks file in the path present or not
     System.out.println(f1.canExecute());//checks if the file have execute rights or not
     System.out.println(f1.canWrite());//checks if the file have Write acess or not
     System.out.println(f1.canRead());//if the file have read rights or not
     System.out.println(f1.getAbsoluteFile());//display file path
     System.out.println(f1.getCanonicalPath());//display file path
     System.out.println(f1.getFreeSpace());//display 
     System.out.println(f1.getName());//
     
     System.out.println(f1.getParent());
     System.out.println(f1.getPath());
     System.out.println(f1.getTotalSpace());
     System.out.println(f1.getUsableSpace());
     System.out.println(f1.hashCode());//unique value for objects
     System.out.println(f1.isAbsolute());
     System.out.println(f1.isDirectory());//checks if path points to Directory
     System.out.println(f1.isFile());//checks if path points to files
     System.out.println(f1.isHidden());
     
     File f2=new File("D:\\IOPrograms\\Hidden.txt");
     f2.createNewFile();
     System.out.println(f2.isHidden());
     System.out.println(f1.lastModified());//last modified value in trems of long
     System.out.println(f1.length());
     
     












     
     
	}

}
