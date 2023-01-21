package Working_with_number;
import java.util.Scanner;
class Q_a_Power_without_whileLoop{
	public static void main(String[] args) {
		double exponential,power;
		
		System.out.print("Enter the base number :");
		Scanner sc=new Scanner(System.in);
		exponential=sc.nextDouble();
		
		System.out.print("Enter the power number :");
		power=sc.nextDouble();
		double res=(double)Math.pow(exponential,power);
		System.out.print(res);
	}
}