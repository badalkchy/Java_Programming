package Working_with_number;
import java.util.Scanner;
public class I_b_Prime_no_given_range_bool {
	static boolean Isprime(int n) {
		if(n<2) {
			return false;
		}
		for(int a=2;a<=Math.sqrt(n);a++) {
			if(n%a==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int n1,n2;
		System.out.print("Enter the first number :");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		System.out.print("Enter the second number :");
		n2=sc.nextInt();
		
		for(int a=n1;a<=n2;a++) {
			if(Isprime(a)) {
				System.out.print(a+" ");
			}
		}
	}
}
