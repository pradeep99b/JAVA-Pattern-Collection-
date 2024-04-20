public class Pattern25 {
	
	static void pattern(int m) {
		
		
		for(int i =1;i<=m;i++) {
				
			int number = i;
			for(int j =1;j<=m ;j++) {
				
				if(number==0)
					number++;
				System.out.print(number);
				number = (number+1)%8;
			}
			
			System.out.println();
		}
	}
		
		public static void main(String[] args) {
			
			pattern(7);
		}

}
