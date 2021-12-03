package oops;

import java.util.Scanner;

class Customer{
	
	String customerName;
	String customerEmail;
	String customerType;
	String customerAddress;
	

	public Customer(String customerName, String customerEmail, String customerType, String customerAddress) {
	super();
	this.customerName = customerName;
	this.customerEmail = customerEmail;
	this.customerType = customerType;
	this.customerAddress = customerAddress;
	}


	public Customer() {
	super();
	}


	public String getCustomerName() {
	return customerName;
	}
	public void setCustomerName(String customerName) {
	this.customerName = customerName;
	}
	public String getCustomerEmail() {
	return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
	}
	public String getCustomerType() {
	return customerType;
	}
	public void setCustomerType(String customerType) {
	this.customerType = customerType;
	}
	public String getCustomerAddress() {
	return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
	}
	
	public void displayDetails(){
	
	System.out.println("Name:"+customerName);
	System.out.println("E-mail:"+customerEmail);
	System.out.println("Type:"+customerType);
	System.out.println("Location:"+customerAddress);

}
}
public class task2_main {
	public static void main(String[] args)
	{
	String customerName;
	String customerEmail;
	String customerType;
	String customerAddress;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Customer Details");
	System.out.println("Enter the name");
	customerName = sc.nextLine();
	System.out.println("Enter the email");
	customerEmail=sc.nextLine();
	System.out.println("Enter the type");
	customerType=sc.nextLine();
	System.out.println("Enter the location");
	customerAddress=sc.nextLine();

	Customer cust = new Customer(customerName,customerEmail,customerType,customerAddress);
	cust.displayDetails();

	}

	}


