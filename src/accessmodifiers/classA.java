package accessmodifiers;

public class classA {
    //public ,private, protected, default
	
	//default :-access method anywhere only in packaged
	//public := variable /method as public then you will have access across all packages
	//private :-you cannot aceess mthods or varibale outside the class of same packages as well
	//protected :- variable/method as private you can access only thode in + subclass only (other packages)
	
	//al this thing is variable also
	public int i=5;
	private int t=10; 
	
	public void abc()
	{
		System.out.println("abc is there");
	}
	private void cba()
	{
		System.out.println("cannot access");
	}
	protected void xyz()
	{
		System.out.println("xyz is here");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
