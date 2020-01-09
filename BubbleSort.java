package Day1;

public class BubbleSort {
	public static void main(String args[]) {
		BubbleSort b=new BubbleSort();
		int A[]= {5,65,21,23,59,323,6586,23,55};
		int N=A.length;
		b.Bubble(A,10);
	}
	public void Bubble(int A[],int n) {
		for(int r=1;r<=n-1;r++) {
			for(int i=0;i<n-1-r;i++) {
				if(A[i]>A[i+1]) {
				int temp=A[i];
				A[i]=A[i+1];
				A[i+1]=temp;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(A[i]+" ");
		}
	}
}
