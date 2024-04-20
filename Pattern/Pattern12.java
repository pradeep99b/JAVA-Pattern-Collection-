public class Pattern12 {
	
	
	static void pattern(int m) {
		
		
		for(int i=1;i<=m;i++) {
			
			char ch = 'A';
			for(int k = m -i ;k>0;k--)
				System.out.print(" ");
			
			for(int j = 1; j<i ; j++) {
					System.out.print(ch+" ");
					ch++;
			}
					
			System.out.println();
				
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pattern(7);

	}

}
