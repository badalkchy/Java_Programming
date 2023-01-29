package Working_with_number;
import java.util.Scanner;
public class U_b_Perfect_num_recursion {
	static int Fac(int n,int c) {
		for(int a=2;a<=n;a++) {
			c=c*a;
		}
		return c;
	}
	int Perfect(int n,int a,int c) {
		if(a>n) {
			return a;
		}
		if(n%a==0) {
			c=c+a;
		}
		return Perfect(n,a+1,c);
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		U_b_Perfect_num_recursion obj=new U_b_Perfect_num_recursion();
		obj.Perfect(n/2,1,0);
	}
}
