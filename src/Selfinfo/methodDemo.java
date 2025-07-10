package Selfinfo;

public class methodDemo {

	public static void main(String[] args) {
		methodDemo demo = new methodDemo();
		String name=demo.getData();
		System.out.println(name);
    MethodDemo2 d1= new MethodDemo2();
    d1.getUserDaat();
    getData2();
    
	}
	public String getData()
	{
		System.out.println("hello world");
		return "rahul shetty";
	}
	public static String getData2()
	{
		System.out.println("hello");
		return "rahul";
	}

}
