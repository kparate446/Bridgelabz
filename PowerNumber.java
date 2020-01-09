package Day1;
import java.util.Scanner;
public class PowerNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Exponential");
//		int expo=sc.nextInt();
		int expo=Integer.parseInt(args[0]);
		System.out.println("Enter the base");
//		int base=sc.nextInt();
		int base=Integer.parseInt(args[1]);
		int p=1;
		for(int i=0;i<expo;i++) {
			p=p*base;
		}
		System.out.println(p);
	}
}
