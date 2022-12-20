package Working_with_number;
import java.util.Scanner;
public class C_c_Sum_of_n_natural_recursion {
	static int Sum(int n) {
		if(n==0) {
			return n;
		}
		System.out.print(n);
		if(n>1) {
			System.out.print("+");
		}
		else {
			System.out.print("=");
		}
		return n+Sum(n-1);
		
	}
	public static void main(String[] args) {
		int a;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.print(Sum(a));
	}
}
