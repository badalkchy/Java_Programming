package Working_with_number;

import java.util.Scanner;

public class E_b_Greater_Among_two_Ternary {

	public static void main(String[] args) {
		int a,b,res;
		System.out.print("Enter the initial number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.print("Ente the second number :");
		b=sc.nextInt();
		res=(a>b)? a:b;
		System.out.print(res+" is greater number ");
	}

}
