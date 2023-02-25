package Pattern;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

class Ac_Rectangle{
	public static void main(String[] args )throws java.lang.Exception{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n;a++) {
			for(int j=1;j<=n+((n)*50/100);j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}