package Working_with_number;
import java.util.Scanner;
public class V_a_Deficient_num {
	public static void main(String[] args) {
		int n,c=0;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n/2;a++) {
			if(n%a==0) {
				c=c+a;
			}
		}
		if(c<n) {
			System.out.print("Deficient number");
		}
		else {
			System.out.print("Non-Deficient number");
		}
	}
}
