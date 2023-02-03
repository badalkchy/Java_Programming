package A_Basic_Exersice;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

class c_All_arithmetic_output{
	public static void main(String[] args) throws java.lang.Exception{
		int a,b;
		System.out.print("Enter first :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.print("Enter second :");
		b=sc.nextInt();
		int res=a-b;
		if(res<0) {
			res=-(res);
		}
		System.out.print("Sum :"+(a+b)+"\nDifference :"+(res)+"\nMultiple :"+(a*b)+"\nQuotient :"+(a/b)+"\nModulus :"+(a%b));
	}
}