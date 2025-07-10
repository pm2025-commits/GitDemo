package array;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // a container which stores multiple values of same data type
	 	int a[] = new int[5]; //declares an array and allocates memory for the value
		a[0] =2;
		a[1] =6;
		a[2] =9;
		a[3] =10;
		a[4] =12;  //intitated value in that array
		
		for(int i= 0; i< a.length; i++)
		{
			System.out.println(a[i]); //retrive value present in that array  
		}
		
		System.out.println("---------------");
		
		int b[] = {1,4,7,9,23,45};
		for(int i=0;i< b.length; i++)
		{
			System.out.println(b[i]);
		}
	}

}
