public class Pattern3{


	static void pattern(int m){
	int count = 1;
	for(int i=1;i<=m;i++){
		for(int j = 1 ; j<=i;j++){
			System.out.print(count+" ");
			count++;
		}
		System.out.println();
	}

	}

	public static void main(String args[]){

		pattern(5);

	}
}
		