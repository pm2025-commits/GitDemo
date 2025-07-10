package array;

public class interview {
   
	 /*   2 4 5
	    * 3 0 7
	    * 1 2 9
	    */ 
	public static void main(String[] args) {
  
int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
/* int min = abc[0][0];
 for(int i=0; i<3; i++)
 {
	for(int j=0; j<3 ; j++)
	{
		if(abc[i][j]<min)
		{
			min=abc[i][j];
		}
	}
 }
 */
/*int max = abc[1][2];
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		if(abc[i][j]>max)
		{
			max=abc[i][j];
		}
	}
}
// System.out.println(min); ///	it is for finding min no.over there
System.out.println(max);
*/
//output is 4
/*step 1:- find the minimum number
 * stp2:-find the column of minimum number
 * step3:-find the maximum umber is identified column
 */
int min = abc[0][0];
int mincolumn;
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		if(abc[i][j]<min)
		{
			min=abc[i][j];
			mincolumn=j;
		}
	}
}
System.out.println(min);

	}
	
	

}
