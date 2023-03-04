package Pattern;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class Cd_Right_Traingle_Mirror_Hollow {
	public static void main(String[] args) throws java.lang.Exception{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n;a++) {
			for(int j=1;j<=n;j++) {
				if(j<=n-a) {
					System.out.print(" ");
				}
				else {
					if(j==(n-a)+1 || j==n|| a==n) {
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
