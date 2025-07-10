package javaclass2;

import accessmodifiers.classA;

public class Checkaccess9 {

	public static void main(String[] args) {
		classA kt = new classA();
		kt.abc(); //i.e outside the package public method is accessible
		int az = kt.i;  //outside packages public variable is accesible
		System.out.println(az);
	 //	kt.cba//its not able to access its private because its outside packages
		//kt.t  its not able to access its private variable

	}

}
