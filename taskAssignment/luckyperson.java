package taskTraining;

import java.util.Scanner;

public class luckyperson {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int bill=sc.nextInt();
		int date=d;
		int c=0;
		while(date>0) {
		c++;
		d/=10;
		}
		if(d==(bill)%Math.pow(10, c)||(bill%date==0)) {
		System.out.println("Lucky customer");

		}
		else {
		System.out.println("Not Lucky");
		}
		}

}
