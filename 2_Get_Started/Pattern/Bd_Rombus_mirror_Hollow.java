package Pattern;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Bd_Rombus_mirror_Hollow {
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
					if(j<=(n*2)-a) {
						if(j==(n*2)-a || j==(n-a)+1 || (a==1 && (j>=n && j<=(n*2)-a )) || (a==n && (j>=1 && j<=(n) )) ) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
				}
			}
			System.out.print("\n");
		}
	}
}
