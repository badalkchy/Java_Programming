package Working_with_number;
import java.util.Scanner;
public class D_a_Sum_of_n_Given_range_Formula {
	public static void main(String[] args) {
		int a,b;
		System.out.print("Enter the initial number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.print("Enter the final number :");
		b=sc.nextInt();
		int ans=(b*(b+1)/2)+(a)-(a*(a+1)/2);
		System.out.print(ans);
	}
}
