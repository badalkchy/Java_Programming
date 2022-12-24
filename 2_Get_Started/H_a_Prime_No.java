package Working_with_number;
import java.util.Scanner;
public class H_a_Prime_No {
	public static void main(String[] args) {
		int n,temp,count=0;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(temp>1) {
			if(n%temp==0) {
				count++;
			}
			temp--;
		}
		if(count==1) {
			System.out.print("Prime Numner");
		}
		else {
			System.out.print("Non Prime Number");
		}
	}
}
