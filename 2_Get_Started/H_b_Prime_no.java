package Working_with_number;
import java.util.Scanner;
public class H_b_Prime_no {
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=2;a<n;a++) {
			if(n%a==0) {
				System.out.print("Non ");
				break;
			}
		}
		System.out.print("Prime");
		
	}
}
