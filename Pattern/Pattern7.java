public class Pattern7{


	static void pattern(int m){
		
		int flag = 1;
		for(int i = 1;i<=m;i++){


			for(int j =1 ;j<=m;j++){
			
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