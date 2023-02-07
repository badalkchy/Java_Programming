package Working_with_number;
import java.util.Scanner;
public class W_b_Abundent_num {
	public static void main(String[] args) {
		int n,c=0;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=(n/2);a++) {
			if(n%a==0) {
				c=c+a;
				System.out.print(" "+a);
			}
		}
		if(c>n) {
			System.out.println("Abundant number");
			System.out.print("Abundant number is "+(c-n));
		}
		else {
			System.out.print("Non-Abundant");
		}
	}
}
