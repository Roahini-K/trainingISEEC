package taskTraining;

import java.util.Scanner;

public class task7_chocolate {
	public static void main(String args[]){
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Chocolate: ");
		int chocolate = sc.nextInt();
		System.out.println("Number of Children: ");
		int children = sc.nextInt();
		
		for(int i=1;i<=chocolate;i++){
			chocolate -=i;
			count++;	
			}
		System.out.println("Chocolate left: "+chocolate);
		System.out.println("Number of children left: "+count);
		
		
		}
	
	}


