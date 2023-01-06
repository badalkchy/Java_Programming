package Working_with_number;
import java.util.Scanner;
public class J_b_Sum_if_digit_of_number_function {
	static void Sum_digit(int n) {
		int res=0,rem;
		while(n>0) {
			rem=n%10;
			res=res+rem;
			System.out.print(rem);
			if(n>10) {
				System.out.print("+");
			}
			n=n/10;
		}
		System.out.print("="+res);
		return;
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Sum_digit(n);
	}
}
