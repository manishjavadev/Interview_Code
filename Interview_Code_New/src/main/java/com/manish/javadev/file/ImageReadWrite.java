package com.manish.javadev.file;
import java.io.*;

/**
 * @author Manish
 *
 */
/**
 * This program reading image and writing image in other file change your file  
 * location correctly and you have to set "sourcefile" and "destfile" file location
 * 
 */
public class ImageReadWrite {
	
	public static void main(String[] args) throws Exception {
	
		File sourcefile= new File("D:/E_DRIVE/PHOTO/Collage.jpg");
		File destfile= new File("D:/E_DRIVE/PHOTO/Collage2.jpg");
		
		//FileInputStream and BufferedInputStream reading a file 
		//FileOutputStream and BufferedOutputStream writing a file
		//and using a byte array for reading byte data
		
		FileInputStream fis= new FileInputStream(sourcefile);
		BufferedInputStream bis= new BufferedInputStream(fis);
		FileOutputStream fos= new FileOutputStream(destfile);
		BufferedOutputStream bos= new BufferedOutputStream(fos);
		byte b[]= new byte[(int)sourcefile.length()];
		
		fis.read(b);
		bos.write(b);
		bos.flush();
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("Done");
		
	}
}
