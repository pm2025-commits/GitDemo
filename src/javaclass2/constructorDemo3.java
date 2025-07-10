package javaclass2;

public class constructorDemo3 {
    //default constructor :- its not accepting any valuess
	public constructorDemo3()
	{
		System.out.println("I am in default constructor");
		System.out.println("I am in default constructor in lecture 1"); 
	}
	
	//paremeterized constuctor
	public constructorDemo3(int a, int b)
	{
		System.out.println("I am not in paremeterized constructor");
		System.out.println("I am  the paremeterized constructor ");
	}
	
	public constructorDemo3(String str)
	{
		System.out.println(str);
		
	}
	
	public void getData()
	{
		System.out.println("I am in the method");
	}
	
	//will not return values
	//name of constructor should be class name
	
	public static void main(String[] args) {
		
		constructorDemo3 cd= new constructorDemo3();
		constructorDemo3 dd= new constructorDemo3(3,4);
		constructorDemo3 ste= new constructorDemo3("its me");
		ste.getData();
		//when we have paremeterized constuctor we have to put her values if its nto thee 
		//then they locate default constuctor
		
		//compiler will call implicit constructor if you have not defined constuctor block
		
		//whenever you create an object constuctor is called 
		
		//block of code whenever an object is created
	}

}
