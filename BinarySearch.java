package Day1;
import java.util.Scanner;
public class BinarySearch {
	public static void main(String args[]) {
		int A[]= {1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Array");
//		int k=sc.nextInt();
//		int A[]=new int[k];
		BinarySearch s=new BinarySearch();
		System.out.println("Search the Element");
		int item=sc.nextInt();
		s.Binary(A, A.length, item);
	}
	public void Binary(int A[],int N,int item) {
		int l=0,u=A.length-1,M;
		while(u>=l) {
			M=(l+u)/2;
			if(A[M]==item) {
				System.out.println("Found Element");
				return;
			}
			else if(item>A[M]) {
				l=M+1;
			}
			else {
				u=M-1;
			}
			
		}
		System.out.println("Not Found");
	}
}
