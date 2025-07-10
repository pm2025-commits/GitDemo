package javaclass2;

public class thisDemo6 {
    
	int a= 4;
	
	public void getData()
	{
		int a=5;
		int b = a+this.a;
		System.out.println(this.a);
		System.out.println(a);
		System.out.println(b);
		//this refers to current object :- object scope lies in the class level
	}
	public static void main(String[] args) {
		thisDemo6 td= new thisDemo6();
		td.getData();

	}

}
