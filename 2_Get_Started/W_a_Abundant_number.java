package Working_with_number;
import java.util.Scanner;
public class W_a_Abundant_number {
	int Abund(int n,int c) {
		for(int a=1;a<=n;a++) {
			if(n%a==0) {
				c=c+a;
				System.out.print(" "+c);
			}
		}
		System.out.print("");
		return c;
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		W_a_Abundant_number obj=new W_a_Abundant_number();
		if(obj.Abund((n/2),0)>(n)) {
			System.out.print("Abundent number");
		}
		else {
			System.out.print("Non-Abundent number");
		}
	}
}
