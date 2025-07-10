package practicalexmple;
//reverse the string vlue /palindrome without using predefined reverse methods
public class nineExample {

	public static void main(String[] args) {
		String s= "Rahul";
		String t=" ";
		for(int i =s.length()-1; i>=0;i--)
		{
			t = t+ s.charAt(i);
		}
		System.out.println(t);

	}

}
