package Working_with_number;
import java.util.Scanner;
public class G_c_Leap_Year_boolean {
	public static void main(String[] args) {
		int year;
		boolean leap;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(year%400==0) {
			leap=true;
		}
		else if (year%4==0 && year%100!=0) {
			leap=true;
		}
		else {
			leap=false;
		}
		if(leap)
			System.out.print("Leap Year");
		else {
			System.out.print("Non Leap Year");
		}
	}
}
