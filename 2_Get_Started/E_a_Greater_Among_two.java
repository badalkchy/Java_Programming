package Working_with_number;

import java.util.Scanner;

public class E_a_Greater_Among_two {
	public static void main(String[] args) {
		int a,b;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.print("Enter the second number :");
		b=sc.nextInt();
		if(a>b) {
			System.out.print(a+" is a largest number");
		}
		else {
			System.out.print(b+" is a greater number ");
		}
	}
}
