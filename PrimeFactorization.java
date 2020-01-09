package Day1;
import java.util.Scanner;
public class PrimeFactorization {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int N=sc.nextInt();
		int x=N;
		for(int i=2;x>1;i++) {
			while(x%i==0) {
				System.out.println(i+" ");
				x=x/i;
			}
		}
	}
}
