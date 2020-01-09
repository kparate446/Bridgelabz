package FunctionalProgram;
import java.util.Scanner;
public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the A Value");
		double a=sc.nextDouble();
		System.out.println("Enter the B Value");
		double b=sc.nextDouble();
		System.out.println("Enter the C Value");
		double c=sc.nextDouble();
		double d=b*b-4*a*c;
		if(d>0.0) {
			double x1=(-b+Math.pow(d,0.5))/(2*a);
			double x2=(-b-Math.pow(d, 0.5))/(2*a);	
			System.out.println(x1+" "+x2);
		}
		else if(d==0.0) {
			double r1=-b/(2.0*a);
			System.out.println(r1);
		}
		else {
			System.out.println("No real root");
		}
	}
}

