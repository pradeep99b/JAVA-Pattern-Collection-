public class Pattern18 {
	
		static void pattern(int m) {
			
			for(int i=1;i<=m;i++) {
				
				for(int j =0;j<i;j++) {
					
					System.out.print(m-j);
				}
				System.out.println();
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(7);

	}

}
