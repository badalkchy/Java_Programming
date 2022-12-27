package Working_with_number;
import java.util.Scanner;
public class H_c_Prime_no_fun {
	private static void CheckPrime(int n) {
		int count=0;
		if(n<2) {
			System.out.print("Non Prime");
		}
		for(int a=1;a<=n;a++) {
			if(n%a==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.print("Non Prime");
		}
		else {
			System.out.print("Prime");
		}
		return;
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		CheckPrime(n);
	}
}
