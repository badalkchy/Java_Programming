package Working_with_number;
import java.util.Scanner;
public class G_a_Leap_Year{
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%400==0 || n%4==0 && n%100!=0) {
			System.out.print("Leap Year");
		}
		else {
			System.out.print("Not an Leap Year");
		}
	}
}