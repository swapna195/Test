package PyramidPgms.Coding;

public class alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char last='E';
		char first='A';
		for(int i=1;i<=(last-'A'+1);i++) {
			
			//System.out.print(first);
			for(int j=1;j<=i;j++) {
				
			System.out.print(first+" ");
			}
			++first;
		
		System.out.println();
			
			
		}

	}

}
