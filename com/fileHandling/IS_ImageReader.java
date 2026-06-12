package com.fileHandling;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class IS_ImageReader {


	public static void main(String[] args) throws IOException {
		String p1 = "D:/FileHandling_Practice/DInput.jpg";
        String p2 = "D:/FileHandling_Practice/DOutput2.jpg";
        
        FileInputStream fis=new FileInputStream(p1);
        BufferedInputStream bis=new BufferedInputStream(fis);

        int temp;
        FileOutputStream fos=new FileOutputStream(p2);
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        
        while((temp=fis.read())!=-1) {
        	fos.write(temp);
        }
        bis.close();
        bos.close();
        fis.close();
        fos.close();
        
	}

}
