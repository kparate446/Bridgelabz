package FunctionalProgram;
import java.util.Scanner;
public class VendingMachine {
	public static void main(String[] args) {
		VendingMachine V=new VendingMachine();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount");
		int Amount=sc.nextInt();
		V.Vending(Amount);
	}
	public void Vending(int amount) {
		int []Notes=new int[] {1000,500,100,50,10,5,2,1};
		int []NotesCounter=new int [8];
		for(int i=0;i<8;i++) {
			if(amount>=Notes[i]) {
				NotesCounter[i]=amount/Notes[i];
				amount=amount-Notes[i]*NotesCounter[i];
			}
		}
		for(int i=0;i<8;i++) {
			if(NotesCounter[i]!=0) {
				System.out.println(Notes[i]+" : "+NotesCounter[i]);
			}
		}
	}
}
