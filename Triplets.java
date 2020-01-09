package Day1;

public class Triplets {
	public static void main(String[] args) {
		Triplets sc=new Triplets();
		int A[]= {1,3,-1,0};
		int n=A.length;
		sc.Triplet(A, n);
	}
	public void Triplet(int A[],int n) {
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(A[i]+A[j]+A[k]==0) {
						System.out.print(A[i]+" "+A[j]+" "+" "+A[k]);
					}
					
				}
			}
		}
		
	}
	
}
