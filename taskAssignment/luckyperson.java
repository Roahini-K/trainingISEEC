package taskTraining;

import java.util.Scanner;

public class luckyperson {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date: ");
		int date=sc.nextInt();
		System.out.println("Enter Bill Number: ");
		int billNo=sc.nextInt();
		if(date>0 && date<=31){
			if((date==billNo%100)||(date==billNo%10)||(date%billNo==0)){
				System.out.println("Lucky Customer");
			}
			else{
				System.out.println("Unlucky customer");
			}
		}
		else{
			System.out.println("Invalid date!");
			
		}
	}
}
