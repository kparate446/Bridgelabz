package FunctionalProgram;
import java.util.Scanner;
public class DayOfWeek {
	public static void main(String[] args) {
		int d=0,m=0,y=0,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		d=sc.nextInt();
		System.out.println("Enter the month");
		m=sc.nextInt();
		System.out.println("Enter the Year");
		y=sc.nextInt();
		
		int y1=y-(14-m)/12;
		int x1=y1+(y1/4)-(y1/100)+(y1/400);
		int m1=m+12*((14-m)/12)-2;
		int d1=(d+x1+(31*m1)/12)%7;
		System.out.println("day "+d);
		switch(d) {
		case 0:System.out.println("Sunday");
		break;
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thusday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		}
	}
}
