package Working_with_number;
import java.util.Scanner;
public class X_a_Perfect_Sqr {
	static int c;
	int Sqr(int n) {
		int d=1;
		for(int a=2;a<=n/2;a++) {
			for(int j=2;j<a;j++) {
				c=0;
				if(a%j==0) {
					c++;
					break;
				}
			}
			if(c==0) {
				int x=n;
				while(x%a==0) {
					x=x/a;
					d=d*a;
				}
			}
		}
		return d;
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		X_a_Perfect_Sqr obj=new X_a_Perfect_Sqr();
		if(obj.Sqr(n)==n) {
			System.out.print("Perfect Square");
		}
		else {
			System.out.print("Non-Perfect Square");
		}
	}
}
