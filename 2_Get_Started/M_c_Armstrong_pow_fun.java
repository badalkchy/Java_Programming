package Working_with_number;
import java.util.Scanner;
class M_c_Armstrong_pow_fun{
	static int pow(int n,int digit) {
		int sum=1;
		while(digit!=0) {
			sum*=n;
			digit--;
		}
		return sum;
	}
	static int len(int n,int count) {
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}
	static int Armstrong(int n) {
		int res=0;
		int digit=len(n,0);
		while(n>0) {
			int rem=n%10;
			res=res+pow(rem,digit);
			n=n/10;
		}
		return res;
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(Armstrong(n)==n) {
			System.out.print("Armstrong number ");
		}
		else {
			System.out.print("Not an Armstrong number ");
		}
	}
}