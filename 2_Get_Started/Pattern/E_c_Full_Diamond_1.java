package Pattern;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class E_c_Full_Diamond_1 {
	public static void main(String[] args) throws java.lang.Exception{
		int n,c=0;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n;a++) {
			if(a>(n/2)+1) {
				c++;
			}
			for(int j=1;j<=n;j++) {
				if(a<=(n/2)+1) {
					if(j<=((n/2)+1)-a) {
						System.out.print(" ");
					}
					if(j>(((n/2)+1)-a) && j<=(n+a)-((n/2)+1)) {
						System.out.print("*");
					}
				}
				else {
					if(j<=c && j>n-a) {
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
