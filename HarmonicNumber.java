package Day1;
import java.util.Scanner;
public class HarmonicNumber {
	public static double harmonic(int N) {
		float h=1;
		for(int i=2;i<N;i++) {
			h+=1+1/i;
		}
		return (h);
	}
	public static void main(String args[]) {
		HarmonicNumber sc=new HarmonicNumber();
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the Number");
		int N=k.nextInt();
		System.out.println(harmonic(N));
	}
}
