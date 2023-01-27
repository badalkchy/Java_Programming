package Working_with_number;

import java.util.Scanner;

public class S_a_Prime_Factor_Brute {
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=2;a<=n;a++) {
			if( a==2 || a%2!=0 ||a==n) {
				while(n%a==0) {
					System.out.print(a+" ");
					n=n/a;
					if(n==1) {
						return ;
					}
				}
			}
		}
	}
}
