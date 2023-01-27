package Working_with_number;
import java.util.Scanner;
public class S_b_Prime_factor_sqrt {
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=2;a<=n/2;a++) {
			int c=0;
			for(int j=2;j<=Math.sqrt(a);j++) {
				if(a%j==0) {
					c++;
					break;
				}
			}
			if(c==0) {
				int x=n;
				while(x%a==0) {
					System.out.print(a+" ");
					x=x/a;
				}
			}
		}
	}
}
