package taskTraining;

import java.util.Arrays;
import java.util.Scanner;

public class task8_archerygame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int target =100;
		int[] turns = new int[10];
		int i;

		for(i=1; i<=10; i++)
		{
		System.out.print(" turn count ");
		turns[i]=sc.nextInt();
		int sum = Arrays.stream(turns).sum(); 
		if(sum>=target) 
		break; 
		}
		System.out.println("Total number of  Turns"+i);

		}

}
