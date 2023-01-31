package Working_with_number;
import java.util.Scanner;
public class V_b_Deficient_num{
	public static void main(String[] args) {
		int n,c=0;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=Math.sqrt(n);a++) {
			if(n%a==0) {
				if(a==1) {
					c=c+a;
				}
				else if(n/a==a) {
					c=c+a;
				}
				else {
					c=c+a;
					c=c+(n/a);
				}
			}
		}
		if(c<n) {
			System.out.print("Deficient number");
		}
		else {
			System.out.print("non Deficient number");
		}
		System.out.print(" "+c);
	}
}