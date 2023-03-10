package Pattern;
import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Eb_Half_Diamond_left_part_2 {
	public static void main(String[] args) throws java.lang.Exception{
		int n,c=0;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n;a++) {
			if(a<=(n/2)+1) {
				for(int j=1;j<=(n/2)+1;j++) {
					if(j<=(n/2)+1-a) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
			}
			else {
				c++;
				for(int j=1;j<=(n/2)+1;j++) {
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
