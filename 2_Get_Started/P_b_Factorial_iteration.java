package Working_with_number;
import java.util.Scanner;
public class P_b_Factorial_iteration {
	void Fact(int n,int res) {
		if(n==0) {
			System.out.print("0 = 1");
			return;
		}
		System.out.print("1");
		for(int a=2;a<n;a++) {
			res=res*a;
			System.out.print("*"+a);
		}
		System.out.print("*"+n+" = "+res*n);
		return;
	}
	public static void main(String[] args){
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		P_b_Factorial_iteration obj =new P_b_Factorial_iteration();
		obj.Fact(n,1);
	}
}