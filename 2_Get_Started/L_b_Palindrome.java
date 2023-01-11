package Working_with_number;
import java.util.Scanner;
class L_b_Palindrome{
	static void Palindrome(int n,int temp,int res,int rem) {
		if(n<=0) {
			if(res==temp) {
				System.out.print("Palindrome");
			}
			else {
				System.out.print("Non Palindrome");
			}
			return;
		}
		rem=n%10;
		res=res*10+rem;
		Palindrome(n/10,temp,res,rem);
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Palindrome(n,n,0,1);
	}
}