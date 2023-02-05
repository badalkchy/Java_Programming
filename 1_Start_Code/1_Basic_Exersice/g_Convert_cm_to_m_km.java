package A_Basic_Exersice;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class g_Convert_cm_to_m_km {
	public static void main(String[] args) throws java.lang.Exception{
		float cm;
		System.out.print("Enter centimeter : ");
		Scanner sc=new Scanner(System.in);
		cm=sc.nextFloat();
		System.out.print("Meter : "+(float)(cm/100)+" m\nKilometer :"+(float)((cm/100)/1000)+" km");
		
	}
}
