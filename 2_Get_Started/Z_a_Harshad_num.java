package Working_with_number;
import java.util.Scanner;
public class Z_a_Harshad_num {
	int Sum(int n) {
		int res=0,rem;
		while(n!=0) {
			rem=n%10;
			res=res+rem;
			n=n/10;
		}
		return res;
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Z_a_Harshad_num obj=new Z_a_Harshad_num();
		if(n%(obj.Sum(n))==0) {
			System.out.print("Harshad number");
		}
		else {
			System.out.print("Non-Harshad number");
		}
	}
}
