package Working_with_number;
import java.util.Scanner;
public class P_a_Factorial {
	void Fac(int n,int c,int d) {
		if(n<=0) {
			System.out.print(" = "+c);
			return;
		}
		c=c*n;
		System.out.print("*"+n);
		Fac(n-1,c,d);
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		P_a_Factorial obj=new P_a_Factorial();
		obj.Fac(n,1,n);
	}
}