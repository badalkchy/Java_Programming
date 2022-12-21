package Working_with_number;
import java.util.Scanner;
public class D_c_Sum_of_n_Given_range_recursion {
	static int sum=0;
	static int Sumn(int n1,int n2) {
		if(n2<n1) {
			return sum;
		}
		sum=sum+n2;
		n2=n2-1;
		return Sumn(n1,n2);
	}
	public static void main(String[] args) {
		int a,b;
		System.out.print("Enter the initial number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.print("Enter the final number :");
		b=sc.nextInt();
		int c=Sumn(a,b);
		System.out.print(c);
		}
}
