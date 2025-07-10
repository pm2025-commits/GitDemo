package inheritance;

//function overloading
//either argument count should be different or argument data type should be different 
public class childLevel extends parentLevel{
	
    public void auto()
    {
    	System.out.println("auto is not therre");
    }
	public void getData(int a)
	{
		System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
	}
	public void getData(int a, int b)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
	 
		childLevel cl = new childLevel();
		cl.getData(2);
		cl.getData("hi");
		cl.getData(10, 20);
		cl.auto();// function overriding :-both method same bane, same argument & same signiture but allocated to local value
		// i.e (auto is not therre)
	}

}
