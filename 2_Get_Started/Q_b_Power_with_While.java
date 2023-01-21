package Working_with_number;
import java.util.Scanner;
public class Q_b_Power_with_While {
	void Power(double base,int exp,double c) {
		while(exp>0) {
			c=c*base;
			exp=exp-1;
		}
		System.out.print("= "+c);
		return;
	}
	public static void main(String[] args) {
		double base;
		int exponential;
		System.out.print("Enter the base :");
		Scanner sc=new Scanner(System.in);
		base=sc.nextDouble();
		System.out.print("Enter the exponentioal :");
		exponential=sc.nextInt();
		Q_b_Power_with_While obj=new Q_b_Power_with_While();
		obj.Power(base,exponential,1.0);
		
	}
}
