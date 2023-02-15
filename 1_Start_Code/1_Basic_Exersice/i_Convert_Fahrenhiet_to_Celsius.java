package A_Basic_Exersice;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.text.DecimalFormat;

public class i_Convert_Fahrenhiet_to_Celsius {
	public static void main(String[] args) throws java.lang.Exception{
		float f;
		System.out.print("Enter the Fahrenheit : ");
		Scanner sc=new Scanner(System.in);
		f=sc.nextFloat();
		
		float res=(f-32f)*(5f/9f);
		System.out.printf("%.2f ",res);
		
		DecimalFormat F=new DecimalFormat("#.##");
		System.out.print("\n"+F.format(res));
	}
}
