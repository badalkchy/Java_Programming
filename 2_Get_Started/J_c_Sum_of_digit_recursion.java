package Working_with_number;
import java.util.Scanner;
public class J_c_Sum_of_digit_recursion {
	static int Sum(int n,int sum,int rem) {
		if(n==0) {
			System.out.print("=");
			return sum;
		}
		rem=n%10;
		sum=sum+rem;
		System.out.print(rem+"+");
		return Sum(n/10,sum,rem);
		
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print(Sum(n,0,1));
	}
}
