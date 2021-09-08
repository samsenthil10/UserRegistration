package com.bridgelabz.userregistration;

import java.util.Scanner;

public class User {

	public static boolean checkFirstName(String firstName) {

		String regularExpression = "[A-Z]+[a-zA-Z\\ ]{2,}";
		return firstName.matches(regularExpression);
	} 

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("----------Welcome to User Registration Portal----------");
		System.out.println();
		String firstName;
		do{
			System.out.print("Enter your First Name (*First letter in block and minimum 3 characters): ");
			firstName = scanner.nextLine();
			if(!checkFirstName(firstName))
				System.out.println("Invalid Name!");
			
		}while(!checkFirstName(firstName));
		scanner.close();
	}
}