public class Pattern22 {
	
	
	static void pattern(int m) {
		
		for(int i=1;i<=m;i++) {
			
			for(int j=1;j<=m;j++) {
				
				if((m-j)>=i)
					System.out.print('1');
				else
					System.out.print(i);
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pattern(7);

	}

}
