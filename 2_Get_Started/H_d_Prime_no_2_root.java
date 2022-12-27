package Working_with_number;
import java.util.Scanner;
public class H_d_Prime_no_2_root {
	public static void main(String[] args) {
		int n;
		String result;
		boolean check=true;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n<2) {
			check=false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				check=false;
				break;
			}
		}
		result = check? "Prime":"Non Prime";
		System.out.print(result);
	}
}
