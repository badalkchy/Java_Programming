package Working_with_number;
import java.util.Scanner;
public class O_c_Fabinacci_series_Formula {
	static int n1=0,n2=1,nextTerm;
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] Fib=new int[n];
		Fib[0]=0;
		Fib[1]=1;
		System.out.print(Fib[0]);
		System.out.print(" "+Fib[1]);
		for(int a=2;a<n;a++) {
			Fib[a]=Fib[a-2]+Fib[a-1];
			System.out.print(" "+Fib[a]);
		}
	}
}
