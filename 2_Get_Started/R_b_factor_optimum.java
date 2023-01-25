package Working_with_number;
import java.util.Scanner;
public class R_b_factor_optimum {
	void Factor(int n) {
		for(int a=1;a<=Math.sqrt(n);a++) {
			if(n%a==0) {
				if(n/a==a) {
					System.out.print(a+" ");
				}
				else {
					System.out.print(a+" "+n/a+" ");
				}
			}
		}
		return;
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		R_b_factor_optimum obj=new R_b_factor_optimum();
		obj.Factor(n);
	}
}
