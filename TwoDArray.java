package Day1;

public class TwoDArray{
	public static void main(String[] args) {
		int A[][]={ {1,3,56},{25,658,35},{54,32526,32}};
		Arrays(A);
	}
	public static void Arrays(int A[][]) {
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++) {
				System.out.println(A[i][j]);
			}
		}
	}
}
