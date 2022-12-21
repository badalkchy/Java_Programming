package Working_with_number;
import java.util.Scanner;
public class D_b_Sum_of_n_Given_range_iterator {
	public static void main(String[] args) {
		int n1,n2,c=0,d=0;
		System.out.print("Enter the initial value :");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		System.out.print("Enter the final value :");
		n2=sc.nextInt();
		for(int a=1;a<=n2;a++) {
			if(a<n1) {
				c=c+a;
//				System.out.print(a);
			}
			if(a<=n2) {
				d=d+a;
//				System.out.print(a);
			}
		}
		int ans=d-c;
		System.out.print(ans);
	}
}
