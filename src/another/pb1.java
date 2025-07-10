package another;

public class pb1 {

	public static void main(String[] args) {
		
		//nested loop works
		for(int i=0;i<=5;i++) //outert for loop this blocl will be run 4 times
		{
			System.out.println("outer loop started");
			for(int j=1;j<=4;j++)
			{
				System.out.println("inner loop");
			}
			System.out.println("outer loop finished");
		}
		System.out.println("-------------------");
		//2nd example
/*
   1 2 3 4
   5 6 7
   8 9
   10 */
 /*  int k=1;
     for(int i=0;i<4;i++)
     {
	 for(int j=1;j<=4-i;j++)
	 {
		System.out.print(k); 
		System.out.print("\t");
		k++;
	 }
	  System.out.println( "");
     }
     
  */  
     System.out.println("--------------------");
     
		/*
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		  */
		int k=1;
		for(int i=1;i<5;i++)
		{
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print(k);    //2 3 4 5
			 System.out.print("\t");
			 k++;
		 }
			System.out.println(" "); 
		}
		
//		homework
//		3
//		6 9
//		12 15 18
//	//	
		System.out.println("--------------------");
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
				
			}
			System.out.println("");
		}
  
	}
}

