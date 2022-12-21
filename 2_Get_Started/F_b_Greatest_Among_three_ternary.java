package Working_with_number;
import java.util.Scanner;
public class F_b_Greatest_Among_three_ternary {
	public static void main(String[] args) {
		int a,b,c,res;
		System.out.print("Enter the First number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.print("Enter the Second number :");
		b=sc.nextInt();
		System.out.print("Enter the third number :");
		c=sc.nextInt();
		if(a>b)
			res=(a>c)? a:c;
		else {
			res=(b>c)?b:c;
		}
		System.out.print(res+" is greater number ");
	}
}
