package taskTraining;

import java.util.Scanner;

public class task3_Magicshow {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of people who watched show 1 : ");
		int show1  = sc.nextInt();
		System.out.println("Enter of average rating of show 1 : ");
		float rate1 = sc.nextFloat();
		System.out.println("Enter the number of people who watched show 2 : ");
		int show2  = sc.nextInt();
		System.out.println("Enter of average rating of show 2 : ");
		float rate2 = sc.nextFloat();
		System.out.println("Enter the number of people who watched show 3 : ");
		int show3  = sc.nextInt();
		System.out.println("Enter of average rating of show 3 : ");
		float rate3 = sc.nextFloat();
		System.out.println("Overall Average Rating : ");
		float rating = (float)((show1*rate1)+(show2*rate2)+(show3*rate3))/(show1+show2+show3);
		System.out.printf("%.2f\n",rating);
		
	}

}
