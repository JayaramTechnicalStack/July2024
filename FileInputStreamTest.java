package com.org.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws FileNotFoundException  {
		
		 FileInputStream fin=new FileInputStream("IOConcept.txt"); 
		 
         int i = 0;
         
		try {
			 while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	            }    
		} catch (IOException e) {
			
			e.printStackTrace();
		}  
	}

}
