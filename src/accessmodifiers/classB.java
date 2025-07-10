package accessmodifiers;

public class classB {

	public static void main(String[] args) {
		
		classA ab= new classA();
		ab.abc(); //method
		int i = ab.i; //outside class public variable is accesible
		System.out.println(i); 
		//ab.cba; its not able to access its private method
		//ab.t  its not able to access its private variable
	}

}
