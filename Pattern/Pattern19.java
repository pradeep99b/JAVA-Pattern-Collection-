public class Pattern19 {

	
	static void pattern(int m) {
		
		for(int i =1;i<=m;i++) {
			
			int number = 1;
			for(int j =1;j<2*i;j++) {
				
				if(j<i) {
					System.out.print(number++);
				}
				else
					System.out.print(number--);
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		pattern(7);
		
	}

}
