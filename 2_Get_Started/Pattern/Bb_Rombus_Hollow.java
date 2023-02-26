package Pattern;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

class Bb{
	public static void main(String[] args) throws java.lang.Exception{
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n;a++) {
			for(int j=1;j<=a-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n || a==1 || a==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				System.out.print("\n");
			}
		}
	}
}