package Working_with_number;
import java.util.Scanner;
public class M_a_Armstrong {
	static int num(int n,int c) {
		if(n==0) {
			return c;
		}
		c++;
		n=n/10;
		return num(n,c);
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int temp=n;
		int res=0,rem;
		int len=num(n,0);
		
		while(n>0) {
			rem=n%10;
			res=res+(int)Math.pow(rem,len);
			n=n/10;
		}
		System.out.println(res);
		if(temp==res) {
			System.out.print("Armstrong");
		}
		else {
			System.out.print("Not an Armstrong");
		}
	}
}
