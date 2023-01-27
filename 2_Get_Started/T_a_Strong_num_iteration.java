package Working_with_number;
import java.util.Scanner;
public class T_a_Strong_num_iteration {
	static int Fac(int n,int c) {
		for(int a=1;a<=n;a++) {
			c=c*a;
		}
		return c;
	}
	public static void main(String[] args) {
		int n,res=0,rem;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int temp=n;
		while(n!=0) {
			rem=n%10;
			res=res+Fac(rem,1);
			n=n/10;
		}
		if(temp==res) {
			System.out.print("Strong number");
		}
		else {
			System.out.print("Non Strong number");
		}
	}
}
