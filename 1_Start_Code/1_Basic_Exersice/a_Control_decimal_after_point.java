//                        Three ways to Control
package A_Basic_Exersice;
import java.util.Scanner;

import java.text.DecimalFormat;  // for 3 Way

public class a_Control_decimal_after_point {
	public static void main(String[] args) throws java.lang.Exception{
		
		double a=5.24456789;         //5.24
		double d=Math.round(a*100);   // 524.0
		System.out.println(d);
		d=((d)/100);
		System.out.println(d+"\n");
		
		System.out.printf("%.2f",a);
		
		DecimalFormat f=new DecimalFormat("#.##");
		System.out.print("\n\n"+f.format(a));
		
	}
}
