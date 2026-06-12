package com.fileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IS_AUdioEX {

	public static void main(String[] args) throws IOException {
		String p1 = "D:\\FileHandling_Practice\\Title Track Dhurandhar 128 Kbps.mp3";
		String p2 = "D:\\FileHandling_Practice\\IS_Audio_Output2.mp3";        
        
        FileInputStream fis=new FileInputStream(p1);
        BufferedInputStream bis=new BufferedInputStream(fis);

        int temp;
        FileOutputStream fos=new FileOutputStream(p2);
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        
        while((temp=bis.read())!=-1) {
        	bos.write(temp);
        }
        bis.close();
        bos.close();
        fis.close();
        fos.close();
        
	}

}
