package Working_with_number;
import java.util.Scanner;
public class J_a_Sum_of_digit_of_number {
	public static void main(String[] args) {
		int n,rem,res=0;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int temp=n;
		while(temp>0) {
			rem=temp%10;
			res=res+rem;
			System.out.print(rem);
			if(temp>10) {
				System.out.print("+");
			}
			temp/=10;
		}
		System.out.print("="+res);
	}
}
