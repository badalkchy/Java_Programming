package Working_with_number;
import java.util.Scanner;
public class L_a_Palindrome {
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int temp=n;
		int rem,res=0;
		while(n>0) {
			rem=n%10;
			res=res*10+rem;
			n/=10;
		}
		System.out.println(res);
		if(temp==res) {
			System.out.print("Palindrome");
		}
		else {
			System.out.print("Not an Palindrome");
		}
	}
}
