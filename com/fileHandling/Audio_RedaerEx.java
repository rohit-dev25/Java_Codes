package com.fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Audio_RedaerEx {

	public static void main(String[] args) throws IOException {
		String p1 = "D:\\FileHandling_Practice\\Title Track Dhurandhar 128 Kbps.mp3";
        String p2 = "D:\\FileHandling_Practice\\Audio_Output.mp3";
        
        
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
