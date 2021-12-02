package taskTraining;

import java.util.Scanner;

public class task1_runrate {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total number of overs : ");
		int total_over = sc.nextInt();
		System.out.print("Enter Total Runs:");
		int total_runs = sc.nextInt();
		System.out.print("Enter overs bowled : ");
		int noofover = sc.nextInt();;
		System.out.print("Enter Runs scored : ");
		int runs = sc.nextInt();
		float cur_runs=runs/noofover;
		System.out.println("Current Run Rate : "+runs);
		float rate=(float)(total_runs-runs)/(float)(total_over-noofover);
		System.out.println("Required Run Rate : "+rate);



		}

}
