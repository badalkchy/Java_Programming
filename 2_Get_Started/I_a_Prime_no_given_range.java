package Working_with_number;
import java.util.Scanner;
public class I_a_Prime_no_given_range {
	static boolean IsPrime(int n) {
		int c=0;
		if(n<2) {
			return false;
		}
		for(int j=2;j<=n/2;j++) {
			if(n%j==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int n1,n2;
		System.out.print("Enter the initial number :");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		System.out.print("Enter the final number :");
		n2=sc.nextInt();
		for(int a=n1;a<=n2;a++) {
			if(IsPrime(a)) {
				System.out.print(a+" ");
			}
		}
	}
}
