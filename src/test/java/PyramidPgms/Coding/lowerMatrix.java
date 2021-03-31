package PyramidPgms.Coding;

public class lowerMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= {{1,3,6},
				    {4,8,9},
				    {6,5,3}};
		int[][] b= {{1,3,6},{4,8,9},{6,5,3}};
		
		int[][] c=new int[3][3];
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				if(j<i)
					System.out.print("0 ");
				else
			
			System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		
}
		

	}

}
