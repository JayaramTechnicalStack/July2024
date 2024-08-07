package com.org.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fos = null;
		
		String s = "Welcome to files concepts,by using fileoutputstream";
		
		byte [] array = s.getBytes();
		
		try { 
			
		  fos  = new FileOutputStream("IOConcept.txt");
			
			fos.write(array);
			System.out.println("file created successfully ");
			
			
		}
		catch (FileNotFoundException fe) {
			
			fe.printStackTrace();
		}
		finally {
			 fos.close();
			 System.out.println("finally block executed");
		}
		
		
	}

}
