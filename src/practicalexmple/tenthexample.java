package practicalexmple;

import java.util.ArrayList;

public class tenthexample {

	public static void main(String[] args) {
		int a[] = {4,4,5,5,5,6,6,9,4};
        //print unique numbwe from the list
		ArrayList<Integer> ab = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				
				for(int j=i+1; j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
			}
		}
	}

}
