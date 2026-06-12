package com.fileHandling;

import java.io.*;

public class IO_ViedoFileEX {

    public static void main(String[] args) throws IOException {

        String p1 = "D:/FileHandling_Practice/Dhurandhar_Trailer.mp4";
        String p2 = "D:/FileHandling_Practice/Dhurandhar_Trailer_StreamOutput.mp4";

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(p1));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(p2));

        int temp;

        while ((temp = bis.read()) != -1) {   // ✅ use bis
            bos.write(temp);                 // ✅ use bos
        }

        bis.close();
        bos.close();

        System.out.println("Video copied successfully!");
    }
}