package Working_with_number;
import java.util.Scanner;
public class O_b_Fabinacci_series_recursion {
	int Fib(int n,int n1,int n2) {
		int nextTerm;
		if(n>0) {
			nextTerm=n1+n2;
			n1=n2;
			n2=nextTerm;
			System.out.print(" "+nextTerm);
			return Fib(n-1,n1,n2);
		}
		return 0;
	}
	public static void main(String[] args) {
		int n1=0,n2=1,n,nextTerm;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print(n1+" ");
		System.out.print(n2);
		O_b_Fabinacci_series_recursion obj=new O_b_Fabinacci_series_recursion();
		obj.Fib(n-2,n1,n2);
	}
}
