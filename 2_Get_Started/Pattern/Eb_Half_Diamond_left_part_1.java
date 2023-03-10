package Pattern;
import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Eb_Half_Diamond_left_part_1 {
	public static void main(String[] args) throws java.lang.Exception{
		int n,c=-1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		n=sc.nextInt();
		for(int a=1;a<=n;a++) {
			if(a>=(n/2)+1) {
				c++;
			}
			for(int j=1;j<=(n/2)+1;j++) {
				if(a<=(n/2)+1) {
					if(j<=((n/2)+1)-a) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				else {
					if(j<=c) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
			}
			System.out.print("\n");
		}
	}
}
