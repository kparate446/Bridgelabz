package FunctionalProgram;
import java.util.Scanner;
public class CouponNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter coupon Number");
		int n=sc.nextInt();
		boolean arr[]=new boolean[n];
		int count=0;
		int distict=0;
		while(distict<n) {
			int val=(int)(Math.random()*(n));
			count++;
			if(!arr[val]) {
				distict++;
				arr[val]=true;
			}
		}
		System.out.println("The number of random numbers generated to collect all distinct number is:"+count);
	}
}
