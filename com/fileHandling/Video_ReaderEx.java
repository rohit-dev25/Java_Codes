package com.fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Video_ReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String p1 = "D:\\FileHandling_Practice\\Dhurandhar_Trailer.mp4";
        String p2 = "D:\\FileHandling_Practice\\Dhurandhar_Trailer_Output_ReadeWriter.mp4";

       
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
