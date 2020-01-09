package Day1;
import java.util.Scanner;
import java.util.Random;
public class FlipCoin {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int tails=0,headc=0,count=0;int n;
		//		Random r=new Random();
		double head=0,tail=0;
		do {
			System.out.println("Choose coin tail or head");
			n=sc.nextInt();
//			double random=Math.random();
			if(Math.random()<0.5) {
				tails++;
			}
			else {
				headc++;
			}
			count++;
			head=(float)(100*tails)/count;
			tail=(float)(100*headc)/count;
			System.out.println(head);
			System.out.println(tail);
		}while(n!=0);
	}
}
