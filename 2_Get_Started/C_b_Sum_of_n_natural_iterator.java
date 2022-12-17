package Working_with_number;

import java.util.Scanner;

public class C_b_Sum_of_n_natural_iterator {
	public static void main(String[] args) {
		int n,c=0;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n;a++) {
			c=c+a;
			System.out.print(a);
			if(a<n) {
				System.out.print("+");
			}
		}
		System.out.print("="+c);
	}
}
