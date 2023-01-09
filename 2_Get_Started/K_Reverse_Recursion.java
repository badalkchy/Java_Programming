package Working_with_number;
import java.util.Scanner;
public class K_Reverse_Recursion {
	static void Reverse(int n,int res) {
		if(n==0) {
			System.out.print(res);
			return;
		}
		int rem=n%10;
		res=res*10+rem;
		n/=10;
		Reverse(n,res);
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int rem=1;
		Reverse(n,0);
	}
}
