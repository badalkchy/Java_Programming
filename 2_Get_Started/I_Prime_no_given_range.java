package Working_with_number;
import java.util.Scanner;
public class I_Prime_no_given_range {
	public static void main(String[] args) {
		int n1,n2;
		boolean check=true;
		System.out.print("Enter initial the number :");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		System.out.print("Enter the final number :");
		n2=sc.nextInt();
		for(int a=n1;a<=n2;a++) {
			check=true;
			for(int j=2;j<a;j++) {
				if(a%j==0) {
					check=false;
				}
			}
			if(check) {
				System.out.print(a+" ");
			}
			else {
				System.out.print("");
			}
		}
	}
}
