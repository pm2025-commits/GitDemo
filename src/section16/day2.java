package section16;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class day2 {
    
	@AfterTest
	public void postrequest ()
	{
		System.out.println("I will execute at last");
	}
	@Test
	public void webLogicHomeLoan()
	{
		System.out.println("webLogicHomeLoan");
	}
	
	@Test
	public void mobileLogicHomeLoan()
	{
		System.out.println("webLogicHomeLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void webLogisthekey()
	{
		System.out.println("secondkey");
	}
	
	@Test
	public void apiLogicHomeLoan()
	{
		System.out.println("webLogicHomeLoan");
	}
	
	@BeforeTest
	public void prerequest()
	{
		System.out.println("I am executing first");
	}
	
	@AfterSuite
	public void affLast()
	{
		System.out.println("I am no.1 from last");
	}
}
