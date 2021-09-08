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

		String regularExpression = "^(?=.*[0-9])(?=.*[A-Z])(?=.{8,}$)[0-9a-zA-Z]*[@#$%_][0-9a-zA-Z]*$";
		return password.matches(regularExpression);
	}
	
	public static void myTestCases() {
		
		String[] testCases = {
				"abc.xyz@bridgelabz.co.in",
				"abc@yahoo.com,",
				"abc-100@yahoo.com,",
				"abc.100@yahoo.com",
				"abc111@abc.com,",
				"abc-100@abc.net,",
				"abc.100@abc.com.au",
				"abc@1.com,",
				"abc@gmail.com.com",
				"abc+100@gmail.com",

				"abc",
				"abc@.com.my",
				"abc123@gmail.a",
				"abc123@.com",
				"abc123@.com.com",
				".abc@abc.com",
				"abc()*@gmail.com",
				"abc@%*.com",
				"abc..2002@gmail.com",
				"abc.@gmail.com",
				"abc@abc@gmail.com",
				"abc@gmail.com.1a",
				"abc@gmail.com.aa.au"
		}; 
		
		for(int index = 0;index < testCases.length;index++) {
			String email = testCases[index];
			boolean result = checkEmail(email);
			if(result == true) {
				System.out.println(testCases[index]+" : Valid Email!");
				System.out.println();
			}
			else {
				System.out.println(testCases[index]+" : Invalid Email!");
				System.out.println();
			}
		}
		
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
			System.out.println("Atleast one Numeric Value");
			System.out.println("Exactly one Special Character from @ # $ % _");
			System.out.print("Enter your Password: ");
			password = scanner.nextLine();
			if(!checkPassword(password))
				System.out.println("Invalid Password!");

		}while(!checkPassword(password));
		
		System.out.println();
		
		myTestCases();
		
		scanner.close();
	}
}