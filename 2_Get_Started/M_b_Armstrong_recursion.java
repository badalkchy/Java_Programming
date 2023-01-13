package Working_with_number;
import java.util.Scanner;
public class M_b_Armstrong_recursion {
	static int Armstrong(int len,int n,int res,int rem) {
		if(n==0) {
			return res;
		}
		rem=n%10;
		res=res+(int)Math.pow(rem,len);
		n=n/10;
		return Armstrong(len,n,res,rem);
		
	}
	static int digit(int n,int c) {
		if(n==0) {
			return c;
		}
		c++;
		n/=10;
		return digit(n,c);
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int len=digit(n,0);
		System.out.println(len);
		int rem=1;
		if(Armstrong(len,n,0,rem)==n) {
			System.out.print("Armstrong");
		}
		else {
			System.out.print("Not Armstrong");
		}
	}
}
