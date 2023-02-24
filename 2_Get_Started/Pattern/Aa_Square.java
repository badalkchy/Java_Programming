package Pattern;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

class Aa_Square{
	public static void main(String[] args) throws java.lang.Exception{
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int a=1;a<=n;a++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}