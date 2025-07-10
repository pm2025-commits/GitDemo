package javaclass2;
//one try can be followed by multiple catch blocks
//catch should be an immediate block after try
//finally block is not executed when jvm is closed forcefully
public class exceptionDemo11 {

	public static void main(String[] args) {
		
		int b=7;
		int c=0; 
		try {
			int k=b/c;
			 System.out.println(k);
			
//			int arr[]= new int[5];
//			System.out.println(arr[7]); //it is an example of IndexOutOfBoundException
		}
		catch(ArithmeticException et)
		{
			System.out.println("I catched arithmetic exeption");
		}
		//catch(IndexOutOfBoundException etc)
//		{
//			System.out.println("I catched  IndexOutOfBoundException");
//		}
		catch(Exception e)
		{
			System.out.println("I catched the error/expectation");
		}
		finally
		{
			System.out.println("cookiis is deleted"); //final bloack is executed whether its shoing executed or not executed 
		}

	}

}
