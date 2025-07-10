package practicalexmple;
//create  a method in which accepts the arrays & return the sume of all elements in the array
//2 print 5 multiplcation table without using multiply operator
public class firstecample {

	public static void main(String[] args) {
		
	/*	int []a={1,2,3,4,5};
		int sum= sumArray(a);
		System.out.println(sum);
		*/
		
		//2ndproblem
		int result = multiply(5,10);
		System.out.println(result);
	

	}
   //2nd peoblwm
	private static int multiply(int i, int j) {
		int k=1;
		int sum=0;
		while(k<=j)
		{
			sum = sum + i;
			k++;
		}
		return sum;
		
	}

	/*private static int sumArray(int[] a) {
		
		int sum =0;
		//extract every value of array & sum each value with other
		for(int i=0; i<a.length;i++)
		{
			sum = sum + a[i]; //10
		}
		return sum;
		
	}
*/
}
