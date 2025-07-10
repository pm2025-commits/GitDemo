package javaclass2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateandtime1 {

	public static void main(String[] args) {
		//current date and current time
		Date d= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYYY");
		SimpleDateFormat sd= new SimpleDateFormat("M/d/YYYY hh:mm:ss");
		
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
      	System.out.println(d.toString());
		
	}

}
