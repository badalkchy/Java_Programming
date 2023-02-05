package A_Basic_Exersice;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class h_Convert_Celsius_Fahrenhiet {
	public static void main(String[] args) throws java.lang.Exception{
		float c;
		System.out.print("Enter Celsius :");
		Scanner sc=new Scanner(System.in);
		c=sc.nextFloat();
		System.out.print((c*(9f/5f))+32f);
		
	}
}
