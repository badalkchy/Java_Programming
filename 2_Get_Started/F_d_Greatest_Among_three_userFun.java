package Working_with_number;
import java.util.Scanner;
public class F_d_Greatest_Among_three_userFun {
	static void Greater(int a,int b,int c) {
		int res;
		if(a>b) {
			res=(a>c)? a:c;
		}
		else {
			res=(b>c)? b:c;
		}
		System.out.print(res);
		return;
	}
	public static void main(String[] args) {
		int a,b,c;
		System.out.print("Enter the first number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.print("Enter the second number :");
		b=sc.nextInt();
		System.out.print("Enter the final number :");
		c=sc.nextInt();
		Greater(a,b,c);
	}
}
