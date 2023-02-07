package Working_with_number;
import java.util.Scanner;
public class Y_a_Automorphic_num {
	static int rev(int digit,int rem,int res,int n) {
		if(digit==0) {
			System.out.print("");
			return res;
		}
		rem=n%10;
		res=res*10+rem;
		n=n/10;
		return rev(digit-1,rem,res,n);
	}
	static int len(int n,int c) {
		if(n==0) {
			return c;
		}
		c++;
		return len(n/10,c);
	}
	int Auto(int n){
		int digit=len(n,0);
		int n1=n*n;
		if(digit==1) {
			int rem=n1%10;
			return rem;
		}
		int rev=rev(digit,1,0,n1);
		int res=rev(digit,1,0,rev);
		return res;
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Y_a_Automorphic_num obj=new Y_a_Automorphic_num();
		int c=obj.Auto(n);
		if(c==n) {
			System.out.print(c*c+" Automorphic number");
		}
		else {
			System.out.print("Non-Automorphic number");
		}
	}
}
