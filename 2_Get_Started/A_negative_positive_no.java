package Working_with_number;
import java.util.Scanner;
public class A_negative_positive_no {
	public static void main(String[] args) {
		int a;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a<0) {
			System.out.print("Negative");
		}
		else if(a>0){
			System.out.print("Positive");
		}
		else {
			System.out.print("Zero");
		}
	}
}
