package projEuler;

import java.util.Scanner;

public class largePrime {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		largePrime( n);
		}

		private static void largePrime(int n) {
		if(n<=1) {
		System.out.println("invalid num");
		}else {
		int prime=2;
		while(prime<n) {
		if(n%prime!=0) {
		prime++;
		}
		else {
		n=n/prime;
		prime=2;
		}
		}
		System.out.println("Largest prime factor: "+n);
		}

		}

}
