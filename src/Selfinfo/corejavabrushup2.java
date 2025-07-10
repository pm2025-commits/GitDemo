package Selfinfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class corejavabrushup2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,10};
		
		//check if array has multiple of 2
		for(int i=0 ; i<arr.length; i++)
		{
		   if(arr[i]%2 ==0)
		   {
			   System.out.println(arr[i]);
			 //  break;
			 
		   }
		   else
		   {
			   System.out.println(arr[i]+"is not multiple of 2");
		   }
		}
		
		System.out.println("----------------------");
		ArrayList<String> a= new ArrayList<String>();
		a.add("one");
		a.add("two");
		a.add("three");
		a.add("four");
		a.add("five");
		System.out.println(a.get(3));
		
		for(int l=0;l<a.size();l++)
		{
			System.out.println(a.get(l));
		}
		System.out.println("----------------------");
		
		for(String val:a)
		{
			System.out.println(val);
		}
		System.out.println("----------------------");
		//item is prsent in arraylist
		System.out.println(a.contains("four"));
		
		System.out.println("----------------------");
		
		String[] name= {"rahul","shetty","academy"};
		List<String> nameArrayList =Arrays.asList(name);
		nameArrayList.contains("academy");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
