package Pattern;
import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Ea_Half_Diamond_right_part_1 {
	public static void main(String[] args) throws java.lang.Exception{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		n=sc.nextInt();
		for(int a=1;a<=n;a++) {
			for(int j=1;j<=n;j++) {
				if(a<=(n/2)+1) {
					if(j<=a ) {
						System.out.print("*");
					}
				}
				else {
					if(j<=n-a+1) {
						System.out.print("*");
					}
				}
			}
			System.out.print("\n");
		}
	}
}
