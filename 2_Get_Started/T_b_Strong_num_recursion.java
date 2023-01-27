package Working_with_number;
import java.util.Scanner;
public class T_b_Strong_num_recursion {
	
	static int Fac(int n,int c) {
		for(int a=1;a<=n;a++) {
			c=c*a;
		}
		return c;
	}
	
	int Strong(int n,int rem,int res) {
		if(n<=0) {
			return res;
		}
		rem=n%10;
		res=res+Fac(rem,1);
		return Strong(n/10,rem,res);
	}
	
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		T_b_Strong_num_recursion obj=new T_b_Strong_num_recursion();
		if(obj.Strong(n,1,0)==n) {
			System.out.print("Strong number");
		}
		else {
			System.out.print("Not Strong number");
		}
	}
}
