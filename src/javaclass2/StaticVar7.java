package javaclass2;

public class StaticVar7 {
    
	String name; //instance variable 
	String address;
	static String city="mumbai"; //class variable
	static int i= 0;
	
	StaticVar7(String name, String address)
	{
		this.name = name;
		this.address= address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress()
	{
		//System.out.println(address);
		System.out.println(address+" "+city);
	}
	
	public static void getCity()
	{
		//System.out.println(address);
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		
		StaticVar7 sV = new StaticVar7("bob" , "ganesh colony");
		StaticVar7 sV1 = new StaticVar7("bobY" , "colony");
		StaticVar7 sV2 = new StaticVar7("bobY" , "colony ahe");
		sV.getAddress();
		sV1.getAddress();
		StaticVar7.getCity();
		StaticVar7.i=4;
		sV.address="kolkata";
	}

}
