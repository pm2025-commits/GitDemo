package Selfinfo;

public class corejavabrushup3 {

	public static void main(String[] args) {
		//sting is an object //string literal
		//string s5="hello";
		
		//new
		String s2 = new String("welcome");
		String s3 = new String("welcome");
		
		String s="Rhul shetty academy";
		String [] splittstring= s.split("shetty");
		System.out.println(splittstring[0]);
		System.out.println(splittstring[1]);
		System.out.println(splittstring[1].trim());
		
		System.out.println("--------------------");
		//how to reverse the string its like this
		for(int i=s.length()-1;i>0;i--)
		{
			System.out.println(s.charAt(i));
		}

	}

}
