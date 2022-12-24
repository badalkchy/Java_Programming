package Working_with_number;
import java.util.Scanner;
public class F_c_Greatest_Among_two_Prefunc {
	public static void main(String[] args) {
		int a,b,c;
		System.out.print("Enter the initial number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.print("Enter the Second number :");
		b=sc.nextInt();
		System.out.print("Enter the Final number :");
		c=sc.nextInt();
		System.out.print(Math.max(c,Math.max(a,b))+" is greatest Among three");
	}
}
