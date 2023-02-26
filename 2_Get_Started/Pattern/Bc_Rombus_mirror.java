package Pattern;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

class Bc_Rombus_mirror{
	public static void main(String[] args) throws java.lang.Exception{
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n;a++) {
			for(int j=1;j<=(n*2);j++) {
				if(j<=(n)-a) {
					System.out.print(" ");
				}
				else {
					if(j>n-a && j<=(n*2)-a) {
						System.out.print("*");
					}
				}
			}
			System.out.print("\n");
		}
	}
}