package section16;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
   
	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("I am no.1");
	}
	
	@Parameters({ "URL","APIKey/usrname"})
	@Test
	public void webLog(String uname, String key)
	{
		System.out.println("webLoginpersonalloan");
		System.out.println(uname);
		System.out.println(key);
	}
	
	
	@Test(groups= {"Smoke"})
	public void webLogisthekey()
	{
		System.out.println("webLogisthekey");
	}
	
	
	@Test
	public void mobile()
	{
		System.out.println("mobile");
	}
	
	@Test
	public void api()
	{
		System.out.println("api");
	}
}
