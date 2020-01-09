package Day1;
//https://coderanch.com/t/671125/java/coin-flip-program
import java.util.Scanner;
import java.util.Random;
public class NumberOfFlipCoin
{
	public static void main(String[] args)
	{
		int heads = 0;
		int tails = 0;
		int counter = 1;
		double randNum = 0.0;
		Scanner in = new Scanner(System.in);

		System.out.println("How many times will the coin be flipped? ");
		int flips = in.nextInt();

		while(counter <= flips)
		{
			randNum = Math.random();
			//System.out.print(counter + "\t" + randNum);

			if(randNum < 0.5)
			{
				heads++;
				//System.out.println("\t heads");
			}
			else
			{
				tails++;
				//System.out.println("\t tails");
			}
			counter++;      
		}
		int  tail=(int) ((float)(100*tails)/flips);
		int head=(int) ((float)(100*heads)/flips);
		//System.out.println();
		System.out.println("Number of Tails = " + tails);
		System.out.println("Number of Heads = " + heads);
		System.out.println(tail+" "+head);
	}
}
