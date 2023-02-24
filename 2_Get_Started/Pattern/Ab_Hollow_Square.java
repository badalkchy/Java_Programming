package Pattern;
import java.io.*;
import java.util.Scanner;
import java.lang.*;

class Ab_Hollow_Square{
	public static void main(String[] args) throws java.lang.Exception{
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int a=1;a<=n;a++) {
			for(int j=1;j<=n;j++) {
				if(a==1 || a==n || j==1 || j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}