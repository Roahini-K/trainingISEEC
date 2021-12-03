package oops;

import java.util.Scanner;



 class Item {
	private  String name;
	private  double CostPerDay;
	private  double Deposit;
	
	public  Item(String name,double CostPerday,double Deposit){
		super();
		this.name=name;
		this.CostPerDay=CostPerday;
		this.Deposit=Deposit;
	}
	
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public double getCostPerDay() {
	return CostPerDay;
	}
	public void setCostPerDay(double costPerDay) {
	CostPerDay = costPerDay;
	}
	public double getDeposit() {
	return Deposit;
	}
	public void setDeposit(double deposit) {
	Deposit = deposit;
	}
	public void display(){
	System.out.println("Name: " +name);
	System.out.println("Cost Per Day "+CostPerDay);
	System.out.println("Deposit : "+Deposit);
	}
}
public class task1_main {
	public static void main(String args[]){
		 String name;
	     double CostPerDay;
		 double Deposit;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Item Type:");
		name=sc.next();
		System.out.println("Enter the Cost per Day: ");
		CostPerDay =sc.nextDouble();
		System.out.println("Enter the Depoist:");
		Deposit=sc.nextDouble();
		Item obj= new Item(name,CostPerDay,Deposit);
		obj.display();
		
		
	}

}
