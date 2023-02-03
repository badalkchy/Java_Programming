// Focus on before String as Input

package A_Basic_Exersice;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class a_Input_Output {
	public static void main(String[] args) throws java.lang.Exception{
		
		int age;
		String name;
		System.out.print("Enter your age :");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		System.out.print("Your name :");
		sc.nextLine();
		name=sc.nextLine();
		System.out.print("Hello "+name+"\nYour age is "+age);
		
	}
}
