package com.fileHandling;

import java.io.*;

public class ImageReaderEx {

    public static void main(String[] args) throws IOException {

    	 String p1 = "D:\\FileHandling_Practice\\DInput.jpg";
         String p2 = "D:\\FileHandling_Practice\\DOutput.jpg";

        
        FileReader fr=new FileReader(p1);
        BufferedReader br=new BufferedReader(fr);
        int temp;
        FileWriter fw=new FileWriter(p2);
        BufferedWriter bw=new BufferedWriter(fw);

        
        while((temp=fr.read())!=-1) {
       	 bw.write(temp);
        }
      br.close();
      bw.close();
      fw.close();
      fr.close();
    }
}