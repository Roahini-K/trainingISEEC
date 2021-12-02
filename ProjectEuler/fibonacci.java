package projEuler;

import java.util.Scanner;

public class fibonacci {
	static int sum=2;
	public static void main(String args[]) {
	int n1=1,n2=2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit : ");
	int n=sc.nextInt();
	if(n<40000) {
	for(int i=1;i<=n;i++) {
	int n3=n1+n2;
	n1=n2;
	n2=n3;
	if(n3%2==0) {
	sum+=n3;
	}
	}

	}
	System.out.println("Sum: "+ sum);

	}


}
