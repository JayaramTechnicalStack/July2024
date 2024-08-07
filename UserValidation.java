package custom;

import java.util.Scanner;

public class UserValidation {

	public static void main(String[] args) {

		User user = new User();
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter User Id :");
		 * String userId = sc.next();
		 */
		
		user.setUserId("ajaykj"); 
		user.setUserName("AjayKumar"); 
		user.setStatus("active");
		
		 if(user.getUserId()== null) {
			throw new UserNotFoundException("Please pass the userId , it should not be null or Please don't pass null");
		}		
		else if(user.getUserId().isEmpty()) {
			throw new UserNotFoundException("User Id should not be empty");
			
		}
		else if(user.getUserId().length()<=5) {
			throw new UserNotFoundException("userId is too shot ,userId should have more than 5 charcters");
			
		}
		 
		else if(user.getUserName().isEmpty()) {
			throw new UserNotFoundException("Name should not be empty !! , Please enter your Name");
		}
		else if(user.getUserName().length()<=4) {
			throw new UserNotFoundException("Name is too shot ,Name should have more than 4 charcters");
		}
		else if(user.getStatus().isEmpty()) {
			throw new UserNotFoundException("User Status should not be empty!!!");
		}
		else if(user.getStatus().equals("inactive")) {
			throw new UserNotFoundException("User Status is Inactive , please activate the User..");
		}
		
		System.out.println("No exception occure!!");
	}

}
