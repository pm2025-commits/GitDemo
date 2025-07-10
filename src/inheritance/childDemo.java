package inheritance;

public class childDemo extends parentDemo {
     String name ="rutu";
	public childDemo()
	{
	super();// this should be always be at first line
	System.out.println("child class construtor");

	}
	public void getStringdata()
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
		childDemo cd = new childDemo();

		cd.getStringdata();
		cd.getData(); //its an overriding
		}
	}


