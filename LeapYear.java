package Day1;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		LeapYear l=new LeapYear();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		l.leap(year);
	}
	public void leap(int year) {
		if(year>=1000 && year<9999) {
			if((year%4==0)&&(year%100!=0)||(year%400==0)){

				System.out.println("Leap Year");
			}
			else {
				System.out.println("Not Leap year");
			}	
		}
		else {
			System.out.println("Not Leap year");
		}
		
	}
	
}
