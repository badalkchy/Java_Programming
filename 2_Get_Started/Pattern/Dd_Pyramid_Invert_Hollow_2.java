package Pattern;
import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Dd_Pyramid_Invert_Hollow_2 {
	public static void main(String[] args) throws java.lang.Exception{
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n;a++) {
			for(int j=1;j<=a-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(n*2)-(a*2-1);k++) {
				if(k==1 || k==(n*2)-(a*2-1)|| a==1) {
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
