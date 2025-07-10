package practicalexmple;

import java.util.ArrayList;

//compare same index of 2 different arrays & creates another array for matching values
public class thirdexample {

	public static void main(String[] args) {
		 
		int a[]= {1,4,6,8};
		int b[]= {2,4,7,8};
		int[] ab = new int[4];
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==b[i])
			{
			  al.add(a[i]);	
			}
		}
		Object[] c= al.toArray();
        for(Object obj: c)
        {
        	System.out.println(obj);
        }
	}

}
