package FrameRate1;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class Compression {
    private static File o;

    public static void compress(File s, File d) throws IOException {     //file source and destination
        //Assign the original file 's' to FIS for reading data
        FileInputStream fis = new FileInputStream (s);

        //Assign compressed file 'o' to FOS
        FileOutputStream fos = new FileOutputStream (d);

        //Assign FileOutputStream to DOS
        DeflaterOutputStream dos = new DeflaterOutputStream(fos);

        //read data from FIS and write it into DOS
        int data;
        while ((data = fis.read()) != -1) { dos.write(data); }

        fis.close();
        dos.close();
    }

    public static void uncompress(File s, File d) throws IOException {
        //assign Input File 's' to FIS for reading data
        FileInputStream fis = new FileInputStream(s);

        //assign output file 'o' to FOS for reading the data
        FileOutputStream fos = new FileOutputStream(d);

        //assign IIS to FIS for uncompressing the data
        InflaterInputStream iis = new InflaterInputStream(fis);

        //read data from IIS and write it into FOS
        int data;
        while((data = iis.read()) != -1) { fos.write(data); }

        //close the files
        fos.close();
        iis.close();

    }

    public static void main(String[] args) {
        File source = new File ("E:\\");
        File destination = new File ("E:\\");

        try { compress(source, destination); }
        catch (IOException e) { System.out.println(e);}


        File source2 = new File ("E:\\");
        File destination2 = new File ("E:\\");

        try { uncompress(source2, destination2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
