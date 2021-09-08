package com.bridgelabz.userregistration;

import java.util.Scanner;

public class User {

	public static boolean checkName(String firstName) {

		String regularExpression = "[A-Z]+[a-zA-Z\\ ]{2,}";
		return firstName.matches(regularExpression);
	} 
	
	public static boolean checkEmail(String email) {

		String finalRegularExpressionToCheckEmail = "((((abc)[a-zA-Z0-9]*)||(abc[_\\+\\-\\.][a-zA-Z0-9]*))+(?<!\\.)@([0-9a-zA-Z]{1,}))\\.(([a-zA-Z]{2,}\\.[a-zA-Z]{2})||([a-zA-Z\\,]{2,}))+(?<!\\.)$";
		return email.matches(finalRegularExpressionToCheckEmail);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("----------Welcome to User Registration Portal----------");
		System.out.println();
		String firstName, lastName , email;
		do{
			System.out.print("Enter your First Name (*First letter in block and minimum 3 characters): ");
			firstName = scanner.nextLine();
			if(!checkName(firstName))
				System.out.println("Invalid First Name!");
			
		}while(!checkName(firstName));
		
		do{
			System.out.print("Enter your Last Name (*First letter in block and minimum 3 characters): ");
			lastName = scanner.nextLine();
			if(!checkName(lastName))
				System.out.println("Invalid Last Name!");
			
		}while(!checkName(lastName));
		
		do{
			System.out.print("Enter your Email: ");
			email = scanner.nextLine();
			if(!checkEmail(email))
				System.out.println("Invalid Email!");
			
		}while(!checkEmail(email));
		
		scanner.close();
	}
}