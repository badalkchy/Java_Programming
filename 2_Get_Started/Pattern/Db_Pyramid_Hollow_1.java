package Pattern;
import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Db_Pyramid_Hollow_1 {
	public static void main(String[] args) throws java.lang.Exception{
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n;a++) {
			for(int j=1;j<=n+a-1;j++) {
				if(j<=n-a) {
					System.out.print(" ");
				}
				else {
					if(j==n-a+1 || j==n+a-1 || a==n) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
	}
}
