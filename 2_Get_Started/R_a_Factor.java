package Working_with_number;
import java.util.Scanner;
public class R_a_Factor {
	void Factor(int n) {
		for(int a=1;a<=n;a++) {
			if(n%a==0) {
				System.out.print(a+" ");
			}
		}
		return;
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		R_a_Factor obj=new R_a_Factor();
		obj.Factor(n);
	}
}
