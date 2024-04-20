public class Pattern1{


	static void pattern(int m){


		for(int i = 1;i<m;i++){

			for(int k = m-i;k>0;k--)
				System.out.print(" ");

			for(int j =1;j<=i;j++) {
				if(j==1 || j == i)
					System.out.print("* ");
				else
						System.out.print("  ");
			}
			System.out.println();

		}

		for(int i =1;i<2*m;i++)
			System.out.print("* ");

	}


	public static void main(String args[]){


		pattern(5);
	}

}