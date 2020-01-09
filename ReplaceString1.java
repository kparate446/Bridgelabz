package Day1;
import java.util.Scanner;
public class ReplaceString1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name");
		String Name=sc.nextLine();
		String n=Name.substring(0,1).toUpperCase()+Name.substring(1);
		int l=n.length();
		if(l>=3) {
		System.out.println("Hello "+n+" How are you");
		}
		else {
			System.out.println("Enter Minimum Three Digit Character");
		}
	}
}
