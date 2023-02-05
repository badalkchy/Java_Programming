package A_Basic_Exersice;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class f_Find_diameter_circumference_area_of_circle {
	public static void main(String[] args) throws java.lang.Exception{
		int n;
		System.out.print("Enter the radius of circle :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print("Diameter : "+n*2+" units\nCircumference : "+Math.round(((2*3.14)*n)*100)/100.0+" units\n");
		System.out.print("Area of circle : "+(float)((3.14)*(n*n))+" sq.units\n");
		double a=(double)((2*3.14)*n);
		
		System.out.printf("Circumference : %.2f units",a); // for two digit after point
	}
}
