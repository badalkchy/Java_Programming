package Pattern;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Ea_Half_Diamond_right_part_2 {
	public static void main(String[] args) throws java.lang.Exception{
		int n,c=0;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n;a++) {
			if(a<=(n/2)+1) {
				for(int j=1;j<=a;j++) {
					System.out.print("*");
				}
			}
			else {
				c++;
				for(int j=1;j<=((n/2)+1)-c;j++) {
					System.out.print("*");
				}
				
			}
			System.out.print("\n");
		}
	}
}
