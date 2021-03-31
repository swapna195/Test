package PyramidPgms.Coding;

public class transposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] a= {{1,2,2},{1,4,6},{8,9,7}};
		
		int transpose[][]= new int[3][3];
		
		System.out.println("original matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) {
				
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("Transpose matrix");
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				
				transpose[i][j]=a[j][i];
				System.out.print(transpose[i][j]+" ");
			}
			
			System.out.println();
		}

	}

}
