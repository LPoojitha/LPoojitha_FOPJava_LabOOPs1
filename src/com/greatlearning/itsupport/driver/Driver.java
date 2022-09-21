package com.greatlearning.itsupport.driver;

import java.util.Scanner;

import com.greatlearning.itsupport.model.Employee;
import com.greatlearning.itsupport.service.Service;

public class Driver {

	public static void main(String[] args) {
		Employee employee = new Employee("Narendra", "Modi");
		Service service = new Service();
		String Email;
		char[] Password;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Great Learning");
		System.out.println("Please enter the following department to proceed for creating credentials");
		System.out.println("Press 1 for Technical Department");
		System.out.println("Press 2 for Admin Department");
		System.out.println("Press 3 for Human Resources");
		System.out.println("Press 4 for Legal");
		int selectedOption = scanner.nextInt();

		if( selectedOption == 1){
			Email = service.generateEmailID(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "tech");
			Password = service.generatePassword();
			service.showCredentials(employee, Email, Password);
		}
		
		else if( selectedOption == 2){
			Email = service.generateEmailID(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "admin");
			Password = service.generatePassword();
			service.showCredentials(employee, Email, Password);
		}
		
		else if( selectedOption == 3){
			Email = service.generateEmailID(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr");
			Password = service.generatePassword();
			service.showCredentials(employee, Email, Password);
		}
		
		else if( selectedOption == 4){
			Email = service.generateEmailID(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "legal");
			Password = service.generatePassword();
			service.showCredentials(employee, Email, Password);
		}
		
		else
			System.out.println("Please enter valid option to continue");
		
		scanner.close();

	}

}
