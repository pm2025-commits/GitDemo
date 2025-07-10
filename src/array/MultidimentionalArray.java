package array;

public class MultidimentionalArray {

	public static void main(String[] args) {
		//a[rows][columns]
//		int a[][] = new int[2][3];
//		a[0][0]=2;                          //2  4  5
//		                                    //3  8  7
//		a[0][1]=4;
//		a[0][2]=5;
//		a[1][0]=3;
//		a[1][1]=8;
//		a[1][2]=7; 
//		System.out.println(a[1][0]);
//		
		System.out.println("-------------------");
		/* 2  4  7
		 * 3  5  8
		 * 1  0  11
		 */
		int b[][] = {{2,4,7},{3,5,8},{1,9,11}};
		System.out.println(b[2][2]);
		
		System.out.println("-------------------");
		for(int i=0; i<3;i++)
		{
			for(int j=0 ; j<3 ;j++)
			{
				System.out.println(b[i][j]);
			}
		}
		
	}

}
