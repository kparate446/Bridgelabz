package FunctionalProgram;
import java.util.Scanner;
public class Gambler {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Stack");
		int stack=sc.nextInt();//100
		System.out.println("Enter the Goal");
		int goal=sc.nextInt();//500
		System.out.println("Enter the number of time gambling");
		int num=sc.nextInt();
		gambler(stack,goal,num);
	}
	public static void gambler(int stack,int goal,int num) {
		int bets=0,wins=0;
		for(int i=0;i<num;i++) {
			int cash=stack;
			while(cash>0&&cash<goal) {
				bets++;
				if(Math.random()<0.5) {
					cash++;
				}
				else {
					cash--;
				}
			}
			if(cash==goal) {
				wins++;
				
			}
			
		}
//		System.out.println();
		System.out.println(wins +"wins out of"+num);
		System.out.println("percentage game won"+100.0*wins/num);
		System.out.println("percentage game loss"+100.0*(num-wins)/num);
		//System.out.println("total betsin" +num+ " games "+bets);
		System.out.println("reach the goal " + goal);
	}
}
