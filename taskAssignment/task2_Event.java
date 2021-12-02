package taskTraining;

import java.util.Scanner;

public class task2_Event {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter branding expenses:  ");
		double brand = sc.nextDouble();
		System.out.print("Enter travel expenses:  ");
		double travel = sc.nextDouble();
		System.out.print("Enter food expenses:  ");
		double food = sc.nextDouble();
		System.out.print("Enter logistics expenses:  ");
		double logic = sc.nextDouble();
		double total_exp = brand+travel+food+logic;
		System.out.println("Total expenses:  "+ total_exp );

		double brand_expense_percentage=(double)(brand)/(double)(total_exp)*100;
		String EventBrand = String.format("%.02f", brand_expense_percentage);
		System.out.println("Branding Expense: "+EventBrand+"%");

		double travel_expense_percentage=(double)(travel)/(double)(total_exp)*100;
		String EventTravel = String.format("%.02f", travel_expense_percentage);
		System.out.println("Travel Expense: "+EventTravel+"%");

		double food_expense_percentage=(double)(food)/(double)(total_exp)*100;
		String EventFood = String.format("%.02f", food_expense_percentage);
		System.out.println("Travel Expense: "+EventFood+"%");

		double logistics_expense_percentage=(double)(logic)/(double)(total_exp)*100;
		String EventLogistics = String.format("%.02f", logistics_expense_percentage);
		System.out.println("Logistics Expense: "+EventLogistics+"%");

		/*
		* double brand_percent = (double)(brand /total_exp )*100 ;
		* System.out.println("Branding expenses percentage: "+brand_percent); double
		* travel_percent = (double)(travel /total_exp )*100 ; String Brand =
		* String.format("%.02f", brand_percent);
		* System.out.println("Travel expenses percentage: "+travel_percent); String
		* Travel = String.format("%.02f", travel_percent); double food_percent =
		* (double)(food /total_exp )*100 ;
		* System.out.println("Food expenses percentage: "+food_percent); String Food =
		* String.format("%.02f", food_percent); double logic_percent = (double)(logic
		* /total_exp )*100 ;
		* System.out.println("Logic expenses percentage: "+logic_percent);
		*/



		}
	

}
