package Working_with_number;
import java.util.Scanner;
class N_b_Armstrong_given_range_recursion{
	static int len(int n,int c) {
		if(n<=0) {
			return c;
		}
		c++;
		return len(n/10,c);
	}
	int Armstrong(int n,int res,int rem,int digit) {
		if(n<=0) {
			return res;
		}
		rem=n%10;
		res=res+(int)Math.pow(rem,digit);
		return Armstrong(n/10,res,rem,digit);
	}
	public static void main(String[] args) {
		int n1,n2;
		System.out.print("Enter the first number :");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		System.out.print("Enter the second number :");
		n2=sc.nextInt();
		N_b_Armstrong_given_range_recursion obj=new N_b_Armstrong_given_range_recursion();
		
		for(int a=n1;a<=n2;a++) {
			int digit=len(a,0);
			if(obj.Armstrong(a,0,1,digit)==a) {
				System.out.print(a+" ");
			}
		}
	}
}