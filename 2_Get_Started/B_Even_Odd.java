package Working_with_number;
import java.util.Scanner;
public class B_Even_Odd {
	public static void main(String[] args) {
		int a;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a%2==0) {
			System.out.print("Even");
		}
		else {
			System.out.print("Odd");
		}
	}
}
