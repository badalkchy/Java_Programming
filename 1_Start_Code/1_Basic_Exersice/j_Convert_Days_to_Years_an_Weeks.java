package A_Basic_Exersice;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class j_Convert_Days_to_Years_an_Weeks {
	public static void main(String[] args) throws java.lang.Exception{
		int days;
		System.out.print("Enter the days :");
		Scanner sc=new Scanner(System.in);
		days=sc.nextInt();
			int res=days/365;
			System.out.println(res+" Years");
			res=days%365;
			int week=res/7;
			System.out.println(week+" Weeks");
			week=res%7;
			System.out.print(week+" Days");
	}
}
