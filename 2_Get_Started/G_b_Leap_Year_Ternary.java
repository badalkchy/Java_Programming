package Working_with_number;
import java.util.Scanner;
public class G_b_Leap_Year_Ternary {
	public static void main(String[] args) {
		int n;
		String a="Leap year",b="non Leap year",result;
		System.out.print("Ente the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		result =(n%400==0 || n%4==0 && n%100!=0)? a:b;
		System.out.print(result);
	}
}
