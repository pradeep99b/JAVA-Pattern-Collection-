public class Pattern4{


	static void pattern(int m){
	int number =1;
	for(int i=1;i<=m;i++){

		for(int k =m-i;k>0;k--)
				System.out.print(" ");
		for(int j = 1 ; j<=i;j++){

			
			if(j==1 || j==i)
				System.out.print("1");
			else{
				number *= ((i-j+1)/j);
				System.out.print(number);
			}
			
		}
		System.out.println();
	}

	}

	public static void main(String args[]){

		pattern(5);

	}
}
		