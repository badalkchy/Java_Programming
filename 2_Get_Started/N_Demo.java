package Working_with_number;
import java.util.Scanner;
class N_Demo{
	void Sum(int n,int sum) {
		for(int a=1;a<=n;a++) {
			sum=sum+a;
		}
		System.out.print(sum);
		return;
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		N_Demo S=new N_Demo();
		S.Sum(n,0);
	}
}