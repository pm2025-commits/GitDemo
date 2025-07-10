package Selfinfo;

public class corejavabrushup {

	public static void main(String[] args) {
		int num =5;
		String name = "prasanna mathane";
		char letter = 'E';
		double dec=5.99;
		boolean value = true;
		System.out.println(num + "it is the key value of num");
		
       //arrays
		int [] arr = new int [5];
		arr [0] =1;
		arr [1] =2;
		arr [2] =4;
		arr [3] = 5;
		arr [4] = 9;
		
		int[] arr2 = {1,4,7,9,5,15,27,13,19,21,255};
		System.out.println(arr2[3]);
		
		for(int i=0; i<arr.length ;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("--------------------");
		
		for(int x=0; x<arr2.length ;x++)
		{
			System.out.println(arr2[x]);
		}
		
		System.out.println("--------------------");
		
		String [] firstName = {"rahul","rupa","king"};
		for(int y=0; y< firstName.length ;y++)
		{
			System.out.println(firstName[y]);
		}
	}

}
