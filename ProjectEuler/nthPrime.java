package projEuler;

import java.util.Scanner;

public class nthPrime {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Nth prime: ");
		int n=sc.nextInt();
		int num=1,count=0;int i;
		while(count<n){
			num=num+1;
			for( i=2;i<=num;i++){
				if(num%i==0){
					break;
				}
			
			}
			if(i==num){
				count+=1;
				
			}
		}
		System.out.println(n+"th prime number is: "+ num);
	}

}
