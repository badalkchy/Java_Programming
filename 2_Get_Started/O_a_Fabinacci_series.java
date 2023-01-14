package Working_with_number;

import java.util.Scanner;

public class O_a_Fabinacci_series {
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a1=0,b=1;
		int nextTerm;
		System.out.print(a1+" "+b+" ");
		for(int a=1;a<=n;a++) {
			nextTerm=a1+b;
			a1=b;
			b=nextTerm;
			System.out.print(nextTerm+" ");
		}
	}
}
