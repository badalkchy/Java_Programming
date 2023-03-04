package Pattern;
import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class Da_Pyramid_2 {
	public static void main(String[] args) throws java.lang.Exception{
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n;a++) {
			for(int j=1;j<=n-a;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=a*2-1;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
