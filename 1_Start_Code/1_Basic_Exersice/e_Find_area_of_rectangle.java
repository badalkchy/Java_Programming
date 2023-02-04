package A_Basic_Exersice;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class e_Find_area_of_rectangle {
	public static void main(String[] args) throws java.lang.Exception{
		int n,m;
		System.out.print("Enter the first number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print("Enter the second number :");
		m=sc.nextInt();
		
		System.out.print("Area of rectangle "+n*m+" sq unit");
	}
}
