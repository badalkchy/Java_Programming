package Working_with_number;
import java.util.Scanner;
class A_Demo{
	static void Greater(int n1,int n2,int n3) {
		if(n1>n2) {
			int res=(n1>n3)? n1 : n3;
			System.out.print(res+" is greater ");
		}
		else if(n2>n3) {
			System.out.print(n2+" is greater ");
		}
		else {
			System.out.print(n3+" is greater ");
		}
		return;
	}
	public static void main(String[] args) {
		int n1,n2,n3;
		System.out.print("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		System.out.print("Enter the second number :");
		n2=sc.nextInt();
		System.out.print("Enter the third number :");
		n3=sc.nextInt();
		Greater(n1,n2,n3);
	}
}