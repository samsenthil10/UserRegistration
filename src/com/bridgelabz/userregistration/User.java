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

	public static boolean checkPhoneNumber(String phoneNumber) {

		String regularExpression = "[0-9]*\\ [1-9][0-9]{9}";
		return phoneNumber.matches(regularExpression);
	}

	public static boolean checkPassword(String password) {

		String regularExpression = "((?=.*[0-9])+(?=.*[A-Z])).{8,}";
		return password.matches(regularExpression);
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("----------Welcome to User Registration Portal----------");
		String firstName, lastName , email, phoneNumber, password;
		do{
			System.out.println();
			System.out.print("Enter your First Name (*First letter in block and minimum 3 characters): ");
			firstName = scanner.nextLine();
			if(!checkName(firstName))
				System.out.println("Invalid First Name!");

		}while(!checkName(firstName));

		do{
			System.out.println();
			System.out.print("Enter your Last Name (*First letter in block and minimum 3 characters): ");
			lastName = scanner.nextLine();
			if(!checkName(lastName))
				System.out.println("Invalid Last Name!");

		}while(!checkName(lastName));

		do{
			System.out.println();
			System.out.print("Enter your Email: ");
			email = scanner.nextLine();
			if(!checkEmail(email))
				System.out.println("Invalid Email!");

		}while(!checkEmail(email));

		do{
			System.out.println();
			System.out.print("Enter your Phone Number: ");
			phoneNumber = scanner.nextLine();
			if(!checkPhoneNumber(phoneNumber))
				System.out.println("Invalid Phone Number!");

		}while(!checkPhoneNumber(phoneNumber));

		do{
			System.out.println();
			System.out.println("Password Rules:");
			System.out.println();
			System.out.println("Minimum 8 characters");
			System.out.println("Atleast one Upper Case Letter");
			System.out.print("Enter your Password: ");
			password = scanner.nextLine();
			if(!checkPassword(password))
				System.out.println("Invalid Password!");

		}while(!checkPassword(password));

		scanner.close();
	}
}