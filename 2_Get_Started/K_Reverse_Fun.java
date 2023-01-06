package Working_with_number;
import java.util.Scanner;
public class K_Reverse_Fun {
	static void Reverse(int n) {
		int rem,res=0;
		while(n>0) {
			rem=n%10;
			res=res*10+rem;
			n/=10;
		}
		System.out.print(res);
		return;
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Reverse(n);
	}
}
