package Working_with_number;
import java.util.Scanner;
public class F_a_Greatest_Among_three {
	public static void main(String[] args) {
		int a,b,c;
		System.out.print("Enter First the number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.print("Enter Second number :");
		b=sc.nextInt();
		System.out.print("Enter Third number :");
		c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.print(a+" is greater");
			}
			else {
				System.out.print(c+" is greater");
			}
		}
		else {
			if(b>c) {
				System.out.print(b+" is greater");
			}
			else {
				System.out.print(c+" is greater");
			}
		}
	}
}
