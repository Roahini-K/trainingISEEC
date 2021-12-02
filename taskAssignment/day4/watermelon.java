package taskTraining;

import java.util.Scanner;

public class task9_watermelon {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter watermelon weight: ");
		int melon = sc.nextInt();
		if(melon%2==0){
			System.out.println("My share : "+melon/2+" & My Sibling share: "+melon/2);
			System.out.println();
			for(int i=1;i<melon;i++){
				int j = melon-i;
				System.out.println("Splitting ways: "+i+" "+j);
			}
		}else{
			System.out.println("Oops!!You can't share :( ");
		}
		
	}

}
