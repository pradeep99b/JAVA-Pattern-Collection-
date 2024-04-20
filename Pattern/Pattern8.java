public class Pattern8{


	static void pattern(int m){
		
		
		for(int i = 1;i<=m;i++){

			int flag = 1;
			for(int j =1 ;j<=i;j++){
			
			System.out.print(flag);
			flag = (flag+1)%2;

			}
			System.out.println();
		}

	}

	public static void main(String[] args){


		pattern(5);
	}

}