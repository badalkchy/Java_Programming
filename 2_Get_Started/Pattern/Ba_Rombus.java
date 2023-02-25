package Pattern;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Ba_Rombus {
	public static void main(String[] args) throws java.lang.Exception {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n;a++) {
			for(int j=1;j<=a-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
