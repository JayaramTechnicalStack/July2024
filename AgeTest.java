package custom;

import java.util.Scanner;

public class AgeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		if(age <18) {
			throw new InvalidAgeException("You are not eligible to vote:");
			//System.out.println("You are not  eligible to vote:");
		}else {
			System.out.println("You are  eligible to vote:");
		}
	}

}
