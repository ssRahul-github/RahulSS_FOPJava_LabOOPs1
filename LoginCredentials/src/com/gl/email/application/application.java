package com.gl.email.application;

import java.util.Scanner;

import com.gl.email.model.Employee;
import com.gl.email.service.CredentialService;

public class application {
	
	//main function containing solution for department
	public static void main(String[] args) {
		Employee emp = new Employee("rahul", "ss");
		CredentialService cs = new CredentialService();
		String GeneratedEmail;
		String GeneratedPassword;
		
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical (tech)");
		System.out.println("2. Admin (admin)");
		System.out.println("3. Human Resource (hr)");
		System.out.println("4. Legal (");

		Scanner sc = new Scanner(System.in);
				
		int input = sc.nextInt();
		
		switch(input) {
		
		case 1: { 
			GeneratedEmail= cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(),"tech");
			GeneratedPassword = cs.generatePassword();
			cs.showCredentials(emp, GeneratedEmail, GeneratedPassword);
			break;
		}
	
		case 2: { 
			GeneratedEmail= cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(),"admin");
			GeneratedPassword = cs.generatePassword();
			cs.showCredentials(emp, GeneratedEmail, GeneratedPassword);
			break;
		}
		
		case 3: { 
			GeneratedEmail= cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(),"hr");
			GeneratedPassword = cs.generatePassword();
			cs.showCredentials(emp, GeneratedEmail, GeneratedPassword);
			break;
		}
		
		case 4: { 
			GeneratedEmail= cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(),"legal");
			GeneratedPassword = cs.generatePassword();
			cs.showCredentials(emp, GeneratedEmail, GeneratedPassword);
			break;
		}
		
		}
	}
}
