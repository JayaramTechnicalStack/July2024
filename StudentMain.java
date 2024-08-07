package com.org.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentMain {
	 public static void main(String args[]) throws IOException{  
		 
			
			FileOutputStream fout = null;

			ObjectOutputStream out = null;

			try {
				
				Student s1 = new Student();

				s1.setId(123);
				s1.setName("Ajay");
				s1.setAge(23);
				s1.setCourse("Java");

				fout = new FileOutputStream("student.txt");

				out = new ObjectOutputStream(fout);

				out.writeObject(s1);

				System.out.println("Student object is saved successfully !!");

			} catch (Exception e) {
				System.out.println(e);
			} finally {
				out.flush();
				out.close();
				fout.close();
			}
			 
			
			FileInputStream fis = null;
			ObjectInputStream in = null;

			try {
				fis = new FileInputStream("student.txt");

				in = new ObjectInputStream(fis);

				Student s = (Student) in.readObject();
				System.out.println(s.getId() + " " + s.getName() + " " + s.getAge() + "  " + s.getCourse());

				
			}

			catch (Exception e) {
				e.printStackTrace();
				} finally {
				in.close();
				fis.close();
			}
			
			
		
			 
	 }
}
