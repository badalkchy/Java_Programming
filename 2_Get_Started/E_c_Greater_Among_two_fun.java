package Working_with_number;

import java.util.Scanner;

public class E_c_Greater_Among_two_fun {
	static void Greater(int a,int b) {
		int res;
		res = (a>b)? a:b;
		System.out.print(res +" is greater number ");
		return;
	}
	public static void main(String[] args) {
		int a,b;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.print("Enter the number :");
		b=sc.nextInt();
		Greater(a,b);
	}
}
