package practicalexmple;

public class secondexample {
//max difference between any adjacent index in array
	public static void main(String[] args) {
		
        int[] a= {1,4,7,16,18};
        int diff = 0;
        for(int i= 0; i<a.length-1;i++)
        {
            if(a[i+1]-a[i]>diff)
            {
            	diff= a[i+1]-a[i];
            }
        }
        System.out.println(diff);
	}

}
