public class Pattern6 {
	
	
	static void pattern(int m) {
		
		
		for(int i=1;i<=m;i++) {
			
			int number = i;
			for(int j = 1;j<=i;j++) 	
				System.out.print(number--+" ");
			
			
			
			System.out.println();
			
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pattern(5);

	}

}
