package javaclass2;

//this, super , try, catch ,finally , final , public ,private , protected , default
//packages, import , abstract ,interface, inheritance , runtime polymorphisam , strings
final class finalDemo8 {
    
	/*
	  final void getData()
	  {
	  
	  }
	 */
	//class name as final :- that means you cannot extend that class
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
     final int i= 4; //constant variables
     System.out.println(i);
     //i=5
     
//      packages concept
     StaticVar7 abc = new StaticVar7("new", "delhi");
     abc.getAddress();
     
	}

}
