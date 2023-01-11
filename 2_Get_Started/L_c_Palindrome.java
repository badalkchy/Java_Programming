package Working_with_number;
import java.util.Scanner;
class L_c_Palindrome{
	int Palindrome(int n,int res,int rem) {
		if(n<=0) {
			return res;
		}
		rem=n%10;
		res=res*10+rem;
		return Palindrome(n/10,res,rem);
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		L_c_Palindrome obj=new L_c_Palindrome();
		int isPalidrome=obj.Palindrome(n,0,1);
		if(isPalidrome==n) {
			System.out.print(n+" is Palindrome");
		}
		else {
			System.out.print(n+" is not an Palindrome");
		}
	}
}