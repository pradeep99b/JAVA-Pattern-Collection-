public class Pattern10{


	static void pattern(int m){
		
		char ch = 'A';
		for(int i = 1;i<=m;i++){

			
			for(int j =1 ;j<=i;j++)
				System.out.print(ch);
			ch++;
			System.out.println();
		}

	}

	public static void main(String[] args){


		pattern(5);
	}

}