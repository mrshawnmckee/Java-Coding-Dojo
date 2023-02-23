package emailapp;

import java.util.Scanner;

public class Email {
	//Encapsulation with private
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "itsmybiz.com";
	
	//Constructor to receive the names
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.printf("Email was created: %s %s\n", this.firstName, this.lastName);
		//Call a method asking for the department that returns the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//combine elements to generate email (firstname.lastname@dept.company.com)
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email address is: " + email);
	}
	//Ask for department
	private String setDepartment() {
		System.out.print("Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice =  in.nextInt();
		if(deptChoice == 1) {
			return "sales";
		}else if (deptChoice == 2){
			return "dev";
		}else if(deptChoice ==3) {
			return "acct";
		} else {
			return "";
		}
	}
	//Random password Generator
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOP0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i<length; i++) {
			//math.random generates a num between 0 and 1, so must multiply
			int rand = (int)(Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String (password);
	}
	
	//Set mailbox capacity
	public void setMailbxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	//Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	//Change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//get methods to retrieve properties
	public int getMailboxcapacity() {
		return mailBoxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	//Create a method to show the important data
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName + 
				"Company Email : " + email;
	}
}

