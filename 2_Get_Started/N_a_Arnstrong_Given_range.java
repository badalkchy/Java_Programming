package Working_with_number;
import java.util.Scanner;
public class N_a_Arnstrong_Given_range {
	static int digit(int n,int c) {
		if(n==0) {
			return c;
		}
		c++;
		n=n/10;
		return digit(n,c);
	}
	static void Armstrong(int n,int len) {
		int rem,res=0,temp=n;
		while(temp>0) {
		rem=temp%10;
		res=res+(int)Math.pow(rem,len);
		temp=temp/10;
		}
		if(res==n) {
			System.out.print(res+" ");
			return;
		}
		else {
			System.out.print("");
			return;
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter the initial number :");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.print("Enter the final number :");
		int n2=sc.nextInt();
		for(int a=n1;a<=n2;a++) {
			int len=digit(a,0);
			Armstrong(a,len);
		}
	}
}
