package Working_with_number;
import java.util.Scanner;
public class C_a_Sum_of_n_natural_no_Formula {
	public static void main(String[] args) {
		int n,c;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n*(n+1)/2;
		System.out.print("Sum of natural number :"+c);
	}
}
