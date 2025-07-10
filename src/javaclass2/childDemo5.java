package javaclass2;

public class childDemo5 extends parentDemo4 {
    
	//String name="qaClickAcademy";
	String name="rs";
	
	public childDemo5()
	{
		super(); //this should always be the first line if we want to get data from parent class constructor
		System.out.println("its an child constructor"); 
	}
	

	
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am in child class");
	}
	
	public static void main(String[] args) {
		
		childDemo5 sd =new childDemo5();
		sd.getStringData();
		System.out.println("----------------");
		sd.getData();
		System.out.println("----------------");

	}

}
