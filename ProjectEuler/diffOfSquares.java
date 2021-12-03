package projEuler;

import java.util.Scanner;

public class diffOfSquares {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n natural numbers: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=(i*i);
		}
		System.out.println("Sum of squares: "+sum);
		int square=0,add=0;
		for(int j=0;j<=n;j++){
			add+=j;
			square=add*add;
		}
		System.out.println("Square of sum: "+square);
		int diff=square-sum;
		System.out.println("Sum of squares: "+diff);
	}

}
